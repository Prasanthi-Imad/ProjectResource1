package com.cg.prasanthi.service;

import java.util.Map;

import com.cg.prasanthi.bean.TransportBean;
import com.cg.prasanthi.dao.ITransportDao;
import com.cg.prasanthi.dao.TransportDaoImpl;

public class TransportServiceImpl implements ITransportService {
	ITransportDao dao= new TransportDaoImpl();
	@Override
	public Map<String, String> getTransportDetails() {
		
		return dao.getTransportDetails();
	}
	@Override
	public void addTransport(TransportBean bean) {
		dao.addTransport(bean);
		
		
	}

}
