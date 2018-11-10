package com.cg.tms.dao; // package containing data access class to perform database operations.

import java.util.List;
import java.util.Map;

import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;
import com.cg.tms.util.Util;

public class TicketDAOImpl implements TicketDAO {

	@Override
	public Map<String, String> getTicketCategoryEntries() {
		// TODO Auto-generated method stub
		return Util.getTicketCategoryEntries();
	}

	@Override
	public List<TicketCategory> listTicketCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean TicketLog(TicketBean ticketBean) {
		return Util.TicketLog(ticketBean);
		
	}

}
