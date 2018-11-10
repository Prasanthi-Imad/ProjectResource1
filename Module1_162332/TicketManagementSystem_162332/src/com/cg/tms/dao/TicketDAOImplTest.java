package com.cg.tms.dao;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.tms.dto.TicketBean;
import com.cg.tms.service.TicketService;
import com.cg.tms.service.TicketServiceImpl;

public class TicketDAOImplTest {
	TicketBean ticketBean = new TicketBean();
	private static TicketService service;
	@BeforeClass
	public static void createInstance(){
		service = new TicketServiceImpl();
	}
	@Test
	public void testTicketDescriptionForNull() {
		ticketBean.setTicketDescription(null);
		ticketBean.setTicketStatus("New");
		ticketBean.setTicketCategoryId("tc001");
		ticketBean.setTicketPriority("low");
		boolean result = service.TicketLog(ticketBean);
		Assert.assertFalse(result);
	}
	
	}


