package com.cg.prasanthi.dao;

import java.util.Map;

import com.cg.prasanthi.bean.TransportBean;

public interface ITransportDao {

	Map<String, String> getTransportDetails();

	void addTransport(TransportBean bean);

}
