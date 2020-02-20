package tech.xuanwu.northstar.core.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import tech.xuanwu.northstar.core.dao.AccountDao;
import tech.xuanwu.northstar.domain.IAccount;
import tech.xuanwu.northstar.domain.IStrategy;
import tech.xuanwu.northstar.gateway.GatewayApi;
import xyz.redtorch.pb.CoreField.AccountField;
import xyz.redtorch.pb.CoreField.CancelOrderReqField;
import xyz.redtorch.pb.CoreField.OrderField;
import xyz.redtorch.pb.CoreField.PositionField;
import xyz.redtorch.pb.CoreField.SubmitOrderReqField;
import xyz.redtorch.pb.CoreField.TradeField;

/**
 * 账户对象，每个实际账户一个实例
 * 作为聚合根，协调多个策略之间的开平仓信号，以及在资金占用率过高时，禁止策略开仓
 * @author kevinhuangwl
 *
 */
@Slf4j
public class RealAccount implements IAccount{
	
	@Autowired
	AccountDao accDao;
	
	/*账户对应的网关接口，一对一关系*/
	GatewayApi gatewayApi;
	
	/*基本账户信息副本*/
	volatile AccountField accountInfo;
	
	/*策略信息*/
	Map<String, IStrategy> strategyMap = new HashMap<>();
	
	/*账户名称*/
	@Getter
	protected String name;
	
	/*账户余额*/
	@Getter
	protected double balance;
	
	/*保证金占用*/
	@Getter
	protected double margin;
	
	/*持仓信息*/
	protected List<PositionField> positionList = new ArrayList<>();
	
	/*订单信息*/
	protected List<OrderField> orderList = new ArrayList<>();
	
	protected String lastOrderTradeDay = "";
	
	/*成交信息*/
	protected List<TradeField> transactionList = new ArrayList<>();
	
	public RealAccount(){}
	
	public RealAccount(GatewayApi gatewayApi){
		this.name = gatewayApi.getGatewayName();
	}

	@Override
	public void submitOrder(SubmitOrderReqField submitOrderReq) {
		log.info("账户-【{}】委托下单，{}", name, submitOrderReq);
		gatewayApi.submitOrder(submitOrderReq);
	}

	@Override
	public void cancelOrder(CancelOrderReqField cancelOrderReq) {
		log.info("账户-【{}】委托撤单，{}", name, cancelOrderReq);
		gatewayApi.cancelOrder(cancelOrderReq);
	}

	@Override
	public void updatePosition(PositionField position) {
		synchronized (positionList) {
			positionList.add(position);
		}
	}

	@Override
	public List<PositionField> getPositionInfoList() {
		synchronized (positionList) {		
			List<PositionField> resultList = new ArrayList<>(positionList.size());
			resultList.addAll(positionList);
			return resultList;
		}
	}

	@Override
	public void updateOrder(OrderField order) {
		// FIXME 这处不确定
		synchronized (orderList) {
			if(!lastOrderTradeDay.equals(order.getTradingDay())) {
				//FIXME 不确定是否要保存
				orderList.clear();
			}
			orderList.add(order);
		}
	}

	@Override
	public void updateTransaction(TradeField transaction) {
		synchronized (transactionList) {
			transactionList.add(transaction);
		}
	}

	@Override
	public AccountField getAccountInfo() {
		return accountInfo;
	}

	@Override
	public void updateAccount(AccountField account) {
		//若账户信息有变，则保存记录
		if(this.accountInfo!=null && !this.accountInfo.equals(account)) {
			accDao.insert(account);
		}
		
		this.accountInfo = account;
	}

	@Override
	public List<IStrategy> getStrategyList() {
		synchronized (strategyMap) {
			List<IStrategy> resultList = new ArrayList<>(strategyMap.size());
			resultList.addAll(strategyMap.values());
			return resultList;
		}
	}

	@Override
	public void regStrategy(String strategyName) {
		IStrategy strategy = new Strategy(strategyName);
		synchronized (strategyMap) {
			strategyMap.put(strategyName, strategy);
		}
		
	}

	@Override
	public void unregStrategy(String strategyName) {
		synchronized (strategyMap) {
			strategyMap.remove(strategyName);
		}
	}

	@Override
	public void sellOutAllPosition() {
		//FIXME 先做简单实现
		throw new IllegalStateException("本方法未实现");
	}

	@Override
	public List<OrderField> getOrderInfoList(LocalDate fromDate, LocalDate toDate) {
		//FIXME 先做简单实现
		synchronized (orderList) {
			List<OrderField> resultList = new ArrayList<>(orderList.size());
			resultList.addAll(orderList);
			return resultList;
		}
	}

	@Override
	public List<TradeField> getTransactionInfoList(LocalDate fromDate, LocalDate toDate) {
		//FIXME 先做简单实现
		synchronized (transactionList) {
			List<TradeField> resultList = new ArrayList<>(transactionList.size());
			resultList.addAll(transactionList);
			return resultList;
		}
	}

	@Override
	public void connectGateway() {
		gatewayApi.connect();
	}

	@Override
	public void disconnectGateway() {
		gatewayApi.disconnect();
	}
	
}
