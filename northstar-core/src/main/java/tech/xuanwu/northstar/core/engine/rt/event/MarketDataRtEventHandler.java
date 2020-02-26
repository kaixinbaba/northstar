package tech.xuanwu.northstar.core.engine.rt.event;

import java.util.EventObject;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import tech.xuanwu.northstar.constant.RuntimeEvent;
import tech.xuanwu.northstar.core.domain.ContractMarketData;
import tech.xuanwu.northstar.core.persistence.dao.BarDataDao;
import tech.xuanwu.northstar.core.persistence.dao.TickDataDao;
import tech.xuanwu.northstar.engine.RuntimeEngine;
import xyz.redtorch.pb.CoreField.TickField;

/**
 * 
 * @author kevinhuangwl
 *
 */
@Slf4j
@Component
public class MarketDataRtEventHandler implements RuntimeEngine.Listener, InitializingBean{
	
	@Autowired
	private RuntimeEngine rtEngine;
	
	@Autowired
	private BarDataDao barDao;
	
	@Autowired
	private TickDataDao tickDao;
	
	private ConcurrentHashMap<String, ContractMarketData> cmdMap = new ConcurrentHashMap<String, ContractMarketData>(100);

	@Override
	public void afterPropertiesSet() throws Exception {
		rtEngine.addEventHandler(RuntimeEvent.TICK_UPDATE, this);
	}
	
	@Override
	public void onEvent(EventObject event) {
		try {
			TickField tick = (TickField) event.getSource();
			String contractId = tick.getUnifiedSymbol();
			if(!cmdMap.containsKey(contractId)) {
				ContractMarketData cmd = new ContractMarketData();
				cmd.setBarDao(barDao);
				cmd.setTickDao(tickDao);
				cmdMap.put(contractId, cmd);
			}
			
			cmdMap.get(contractId).updateTick(tick);
		}catch(ClassCastException e) {
			log.error("", e);
		}
		
	}

	

}
