package com.cg.tms.service; // package with service layer class.

import java.util.List;
import java.util.Map;

import com.cg.tms.dao.TicketDAO;
import com.cg.tms.dao.TicketDAOImpl;
import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;

public class TicketServiceImpl implements TicketService {
TicketDAO dao = new TicketDAOImpl();
	@Override
	public Map<String, String> getTicketCategoryEntries() {
		// TODO Auto-generated method stub
		return dao.getTicketCategoryEntries();
	}
	@Override
	public List<TicketCategory> listTicketCategory() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean TicketLog(TicketBean ticketBean) {
		return dao.TicketLog(ticketBean);
		
	}

}
