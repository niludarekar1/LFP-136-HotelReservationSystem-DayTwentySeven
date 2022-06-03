package com.bridgelabz;

import java.util.Scanner;

public class HotelReservation {
    public void addHotel(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Customer Type :");
        String customerType = sc.next();
        System.out.println("Enter the Hotel Name :");
        String hotelName = sc.next();
        System.out.println("Enter the Rating :");
        int rating = sc.nextInt();
        System.out.println("Enter the Start Date :");
        String startDate = sc.next();
        System.out.println("Enter the Ending Date :");
        String endDate = sc.next();

        System.out.println("Enter the Regular Customer Rate :");
        int regularCutomerRate = sc.nextInt();

    }
}