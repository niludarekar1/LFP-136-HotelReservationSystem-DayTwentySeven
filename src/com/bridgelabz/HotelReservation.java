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
    Date date1,date2;
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
        System.out.println("Enter the WeekDay Rate :");
        int weekdayRate = sc.nextInt();
        System.out.println("Enter the Weekend Rate :");
        int weekendRate = sc.nextInt();
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy");
            date1 = format.parse(startDate);
            SimpleDateFormat format1 = new SimpleDateFormat("dd-MMM-yyyy");
            date2 = format1.parse(endDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("Enter the Regular Customer Rate :");
        int regularCutomerRate = sc.nextInt();

        HotelData hotelData = new HotelData(customerType,hotelName,rating,regularCutomerRate,startDate,endDate,weekdayRate,weekendRate);
        hotelDataArrayList.add(hotelData);
    }

    public void printHotel() {
        System.out.println(hotelDataArrayList);
    }

    public void cheapestHotel(String date1, String date2) {

        try {
            SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy");
            Date strDate = format.parse(date1);
            SimpleDateFormat format1 = new SimpleDateFormat("dd-MMM-yyyy");
            Date endDate = format1.parse(date2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        List<HotelData> minHotelData = hotelDataArrayList.stream().filter(x -> x.getRegularCustomerRate()==
        hotelDataArrayList.stream().map(HotelData::getRegularCustomerRate).sorted().findFirst().orElse(null))
                .collect(Collectors.toList());
        System.out.println(minHotelData);
    }
}