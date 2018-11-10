package com.cg.tms.ui; // package containing main class

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;

import com.cg.tms.dto.TicketBean;
import com.cg.tms.service.TicketService;
import com.cg.tms.service.TicketServiceImpl;

class MainUI {

	public static void main(String[] args) {
		TicketService service = new TicketServiceImpl();
		Scanner scanner = new Scanner(System.in);
		try{
		while (true) {
			System.out.println("Welcome to ITIMD Help Desk");
			System.out.println("1.Raise a Ticket\n2.Exit from the system");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				TicketBean ticketBean = new TicketBean();
				Map<String, String> ticketCategory = service
						.getTicketCategoryEntries();
				int count = 1;
				for (Map.Entry<String, String> entrySet : ticketCategory
						.entrySet()) {
					System.out.println(count + ". " + entrySet.getValue());
					count++;
				}
				System.out.println("Enter Option:");
				int option = scanner.nextInt();
				int count1 = 1;
				for (Map.Entry<String, String> entrySet : ticketCategory
						.entrySet()) {
					if (option == count1) {
						ticketBean.setTicketCategoryId(entrySet.getKey());
					}
					count1++;
				}
				int tNo = (int) (Math.random() * 10000);
				String ticketNo = Integer.toString(tNo);
				ticketBean.setTicketNo(ticketNo);
				System.out
						.println("Enter description related to issue:\n(Here you need to type the details)\t ");
				String description = scanner.next();
				ticketBean.setTicketDescription(description);
				System.out.println("Enter Priority(1.low 2. medium 3. high): ");
				String ticketPriority = scanner.next();
				ticketBean.setTicketPriority(ticketPriority);
				if (ticketPriority == "1") {
					ticketBean.setTicketPriority("low");
				}
				if (ticketPriority == "2") {
					ticketBean.setTicketPriority("medium");
				}
				if (ticketPriority == "3") {
					ticketBean.setTicketPriority("high");
				}
				service.TicketLog(ticketBean);
				LocalDateTime ldt = LocalDateTime.now();
				DateTimeFormatter f = DateTimeFormatter
						.ofPattern("dd MMMM yyyy hh : mm a");
				System.out.println("Ticket Number " + ticketNo
						+ " logged successfully at " + ldt.format(f));
				break;

			case 2:
				System.out.println("Successfully exited from the application");
				System.exit(0);
				break;
			}

		}
		/* scanner.close(); */
	}catch(Exception e){
		System.out.println("\n Exception: Enter valid options");
	}
}
}
