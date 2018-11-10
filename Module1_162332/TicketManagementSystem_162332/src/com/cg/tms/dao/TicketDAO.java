package com.cg.tms.dao; // package containing data access class to perform database operations.

import java.util.List;
import java.util.Map;

import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;

public interface TicketDAO {

	Map<String, String> getTicketCategoryEntries();

	List<TicketCategory> listTicketCategory();

	boolean TicketLog(TicketBean ticketBean);
}
