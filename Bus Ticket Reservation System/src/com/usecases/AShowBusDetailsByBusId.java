package com.usecases;

import java.util.Scanner;

import com.dao.AdminDao;
import com.dao.AdminDaoImpl;

public class AShowBusDetailsByBusId {

	public static void showBusDetailsByBusId() {
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("____________________");
			System.out.println("|                  |");
			System.out.println("|  Enter bus id:   |");
			System.out.println("|__________________|");
			int bid = sc.nextInt();
			AdminDao dao = new AdminDaoImpl();

			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println(dao.showBusDetails(bid));
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
			
			System.out.println("==================================================");
			
			AdminLoginInterface.adminLoginInterface();
			sc.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
