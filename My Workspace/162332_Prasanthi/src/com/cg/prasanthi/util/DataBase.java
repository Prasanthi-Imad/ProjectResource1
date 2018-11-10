package com.cg.prasanthi.util;
import java.util.HashMap;
import java.util.Map;

import com.cg.prasanthi.bean.TransportBean;

public class DataBase {
private static Map<String, String> transportDetails = new HashMap<>();
private static Map<Integer, TransportBean> bookTransport = new HashMap<>();
	public static Map<String, String> getTransportDetails() {
		transportDetails.put("f-1", "Flight");
		transportDetails.put("Tr-1", "Train");
		transportDetails.put("Taxi-1", "Taxi");
		return transportDetails;
	}
	public static void addTransportDetails(TransportBean bean) {
		bookTransport.put(bean.getId(),bean );
		
	}

}
