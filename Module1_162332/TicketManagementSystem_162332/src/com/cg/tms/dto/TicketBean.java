package com.cg.tms.dto; // package containing all beans

public class TicketBean {
	private static String ticketNo;
	private String ticketCategoryId;
	private String ticketDescription;
	private String ticketPriority;
	private String ticketStatus = "New";
	private String itimdComments;

	public static String getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(String ticketNo) {
		TicketBean.ticketNo = ticketNo;
	}

	public String getTicketCategoryId() {
		return ticketCategoryId;
	}

	public void setTicketCategoryId(String ticketCategoryId) {
		this.ticketCategoryId = ticketCategoryId;
	}

	public String getTicketDescription() {
		return ticketDescription;
	}

	public void setTicketDescription(String ticketDescription) {
		this.ticketDescription = ticketDescription;
	}

	public String getTicketPriority() {
		return ticketPriority;
	}

	public void setTicketPriority(String ticketPriority) {
		this.ticketPriority = ticketPriority;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public String getItimdComments() {
		return itimdComments;
	}

	public void setItimdComments(String itimdComments) {
		this.itimdComments = itimdComments;
	}

	@Override
	public String toString() {
		return "TicketBean [ticketNo=" + ticketNo + ", ticketCategoryId="
				+ ticketCategoryId + ", ticketDescription=" + ticketDescription
				+ ", ticketPriority=" + ticketPriority + ", ticketStatus="
				+ ticketStatus + ", itimdComments=" + itimdComments + "]";
	}

}
