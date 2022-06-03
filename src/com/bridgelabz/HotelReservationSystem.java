package com.bridgelabz;

import java.util.Scanner;

public class HotelReservationSystem {
    public static void main(String[] args) {
        //Welcome message for User
        System.out.println("Welcome to Hotel Reservation System Problem.");

        Scanner sc = new Scanner(System.in);

        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel();
        hotelReservation.addHotel();
        hotelReservation.addHotel();
        hotelReservation.printHotel();
        System.out.println("Enter the Starting Date :");
        String date1 = sc.next();
        System.out.println("Enter the Ending Date :");
        String date2 = sc.next();
        hotelReservation.cheapestHotel(date1,date2);
    }
}