package com.cg.prasanthi.service;

import java.util.Map;

import com.cg.prasanthi.bean.TransportBean;

public interface ITransportService {

	Map<String, String> getTransportDetails();

	void addTransport(TransportBean bean);

}
