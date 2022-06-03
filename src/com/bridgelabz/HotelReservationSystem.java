package com.bridgelabz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HotelReservationSystem {
    public static void main(String[] args) throws ParseException {
        //Welcome message for User
        System.out.println("Welcome to Hotel Reservation System Problem.");

        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel();
        hotelReservation.addHotel();
        hotelReservation.addHotel();
       // hotelReservation.printHotel();
        hotelReservation.cheapestHotel();
    }
}