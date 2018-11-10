package com.cg.tms.service; // package with service layer class.

import java.util.List;
import java.util.Map;

import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;

public interface TicketService {

	Map<String, String> getTicketCategoryEntries();
	List<TicketCategory> listTicketCategory();
	boolean TicketLog(TicketBean ticketBean);

}
