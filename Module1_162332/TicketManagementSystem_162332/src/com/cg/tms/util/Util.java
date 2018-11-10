package com.cg.tms.util; // package containing data access class to perform utility operations.

import java.util.HashMap;
import java.util.Map;

import com.cg.tms.dto.TicketBean;

public class Util {
	private static Map<String, String> ticketCategory = new HashMap<String, String>();
	private static Map<String, TicketBean> ticketLog = new HashMap<String, TicketBean>();
	public static Map<String, String> getTicketCategoryEntries(){
		ticketCategory.put("tc001", "software installation");
		ticketCategory.put("tc002", "mailbox creation");
		ticketCategory.put("tc003", "mailbox issues");
		return ticketCategory;
		
	}
	public static boolean TicketLog(TicketBean ticketBean) {
		return ticketLog.put(TicketBean.getTicketNo(), ticketBean) != null;
		
		
	}
}
