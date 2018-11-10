package com.cg.tms.dto; // package containing all beans

public class TicketCategory {
	private String ticketCategoryId;
	private String categoryName;

	public String getTicketCategoryId() {
		return ticketCategoryId;
	}

	public void setTicketCategoryId(String ticketCategoryId) {
		this.ticketCategoryId = ticketCategoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "TicketCategory [ticketCategoryId=" + ticketCategoryId
				+ ", categoryName=" + categoryName + "]";
	}

	

	

}
