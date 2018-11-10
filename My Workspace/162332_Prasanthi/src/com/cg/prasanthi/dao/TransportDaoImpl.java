package com.cg.prasanthi.dao;

import java.util.Map;

import com.cg.prasanthi.bean.TransportBean;
import com.cg.prasanthi.util.DataBase;

public class TransportDaoImpl implements ITransportDao {

	@Override
	public Map<String, String> getTransportDetails() {
		
		return DataBase.getTransportDetails();
	}

	@Override
	public void addTransport(TransportBean bean) {
		 DataBase.addTransportDetails(bean);
		
	}

}
