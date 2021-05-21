package com.addressbook;

import java.util.Scanner;
import java.util.ArrayList;
//import java.util.List;

public class AddressBook {
	
     	    public static void main(String[] args) {
	        ArrayList<String> person = new ArrayList<String>();
	        Scanner inputdata = new Scanner(System.in);

	        System.out.println("Welcome to Address Book !");

	        System.out.print("Enter First name: ");
	        String fname = inputdata.nextLine();

	        System.out.print("Enter Last name: ");
	        String lname = inputdata.nextLine();

	        System.out.print("Enter Address: ");
	        String address = inputdata.nextLine();

	        System.out.print("Enter City: ");
	        String city = inputdata.nextLine();

	        System.out.print("Enter state: ");
	        String state = inputdata.nextLine();

	        System.out.print("Enter Zip: ");
	        String zip = inputdata.nextLine();

	        System.out.print("Enter phone number: ");
	        String phone = inputdata.nextLine();

	        person.add(fname);
	        person.add(lname);
	        person.add(address);
	        person.add(city);
	        person.add(state);
	        person.add(zip);
	        person.add(phone);

	        for (String book : person){
	            System.out.println(book);
	        }
	    }
	
		
	}
