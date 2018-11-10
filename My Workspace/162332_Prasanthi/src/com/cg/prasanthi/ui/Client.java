package com.cg.prasanthi.ui;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;

import com.cg.prasanthi.bean.TransportBean;
import com.cg.prasanthi.service.ITransportService;
import com.cg.prasanthi.service.TransportServiceImpl;

public class Client {
	public static void main(String[] args) {
		TransportBean bean = new TransportBean();
		ITransportService service = new TransportServiceImpl();
		Map<String, String> transportDetails = service.getTransportDetails();
		System.out.println("Mode of Transport");
		int count = 1;
		for (Map.Entry<String, String> entrySet : transportDetails.entrySet()) {
			System.out.println(count+". "+entrySet.getValue());
			count++;
		}
		System.out.println("Enter option");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		int count1 = 1;
		for (Map.Entry<String, String> entrySet : transportDetails.entrySet()) {
			if(choice==count1){
				bean.setTransportCategoryId(entrySet.getKey());
			}
			count1++;
		}
		int id = (int) (Math.random()*10000);
		bean.setId(id);
		System.out.println("Enter reason");
		scanner.nextLine();
		String reason = scanner.nextLine();
		bean.setReason(reason);
		System.out.println("\n1.This week\n2.Next week\n3.Next month");
		int whenChoice= scanner.nextInt();
		if(whenChoice==1){
			bean.setWhen("a");
		}
		if(whenChoice==2){
			bean.setWhen("b");
		}
		if(whenChoice==3){
			bean.setWhen("c");
		}
		service.addTransport(bean);
		LocalDateTime ltd = LocalDateTime.now();
		DateTimeFormatter f= DateTimeFormatter.ofPattern("dd MMMM yyyy hh:mm a");
		System.out.println("Booked with id "+id+" on "+ltd.format(f));
		scanner.close();
	}
}
