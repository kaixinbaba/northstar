package tech.xuanwu.northstar.strategy.client.strategies;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;

import com.alibaba.fastjson.JSON;

import lombok.Getter;
import lombok.Setter;
import tech.xuanwu.northstar.strategy.client.msg.MessageClient;
import xyz.redtorch.pb.CoreField.BarField;
import xyz.redtorch.pb.CoreField.TickField;

public abstract class TemplateStrategy implements TradeStrategy, InitializingBean{

	protected boolean running = false;
	
	protected boolean isBlocking = false;
	
	@Setter @Getter
	protected String name;
	
	@Setter @Getter
	protected String[] mdContracts;
	
	@Setter @Getter
	protected String[] tdContracts;
	
	
	@Value("${northstar.endpoint}")
	protected String coreServiceEndpoint;
	
	protected MessageClient msgClient;
	
	
	@Override
	public void afterPropertiesSet() throws Exception {
		//每个策略绑定一个消息客户端用于与行情交易平台通信
		msgClient = new MessageClient(coreServiceEndpoint, this);
		
		init();
	}

	protected void init() {
		System.out.println("#################################");
		System.out.println(String.format("策略名称：%s", name));
		System.out.println(String.format("订阅合约名称：%s", JSON.toJSONString(mdContracts)));
		System.out.println(String.format("交易合约名称：%s", JSON.toJSONString(tdContracts)));
		System.out.println("#################################");
	}
	
	@Override
	public synchronized void resume() {
		running = true;
	}
	
	@Override
	public synchronized void suspend() {
		running = false;
	}
	
	@Override
	public boolean isRunning() {
		return running;
	}
	
	protected abstract void onTick(TickField tick);
	
	protected abstract void onBar(BarField bar);
	
	/*采用文华风格的开平仓API设计，让策略端避免考虑平今仓还是平旧仓的问题，默认优先平旧仓，由接口平台的风控模块自动计算*/
	
	protected void BK() {}
	
	protected void SK() {}
	
	protected void BP() {}
	
	protected void SP() {}
}
