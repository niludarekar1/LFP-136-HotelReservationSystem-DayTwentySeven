package com.bridgelabz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HotelReservation {
    ArrayList<HotelData> hotelDataArrayList = new ArrayList<>();
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

        try {
            SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy");
            Date date1 = format.parse(startDate);
            SimpleDateFormat format1 = new SimpleDateFormat("dd-MMM-yyyy");
            Date date2 = format1.parse(endDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("Enter the Regular Customer Rate :");
        int regularCutomerRate = sc.nextInt();

        HotelData hotelData = new HotelData(customerType,hotelName,rating,regularCutomerRate,startDate,endDate);
        hotelDataArrayList.add(hotelData);
    }

    public void printHotel() {
        System.out.println(hotelDataArrayList);
    }

    public void cheapestHotel() {
        List<HotelData> minHotelData = hotelDataArrayList.stream().filter(x -> x.getRegularCustomerRate()==
        hotelDataArrayList.stream().map(HotelData::getRegularCustomerRate).sorted().findFirst().orElse(null))
                .collect(Collectors.toList());
        System.out.println(minHotelData);
    }
}