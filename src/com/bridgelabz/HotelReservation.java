package com.bridgelabz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Collectors;

public class HotelReservation {
    ArrayList<HotelData> hotelDataArrayList = new ArrayList<>();

    public void addHotel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Hotel Name :");
        String hotelName = sc.next();
        System.out.println("Enter the Rating :");
        int rating = sc.nextInt();
        System.out.println("Enter the WeekDay Rate for Regular Customer :");
        int weekdayRateRegularCustomer = sc.nextInt();
        System.out.println("Enter the Weekend Rate for Regular Customer:");
        int weekendRateRegularCustomer = sc.nextInt();
        System.out.println("Enter the WeekDay Rate for Rewarded Customer :");
        int weekdayRateRewardedCustomer = sc.nextInt();
        System.out.println("Enter the Weekend Rate for Rewarded Customer:");
        int weekendRateRewardedCustomer = sc.nextInt();

        HotelData hotelData = new HotelData(hotelName, rating, weekdayRateRegularCustomer, weekendRateRegularCustomer, weekdayRateRewardedCustomer, weekendRateRewardedCustomer);
        hotelDataArrayList.add(hotelData);
    }

    public void printHotel() {
        System.out.println(hotelDataArrayList);
    }

    public void cheapestHotel() {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println("Enter the Customer Type (1. Regular 2. Rewarded) :");
            int customerType = getInput().nextInt();
            System.out.println("Enter the Date1 for Booking (yyyy-MM-dd):");
            Date date1 = format.parse(getInput().next());
            System.out.println("Enter the Date2 for Booking (yyyy-MM-dd):");
            Date date2 = format.parse(getInput().next());

            findWeekend(customerType,date1, date2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void findWeekend(int customerType, Date startDate, Date endDate) {
        LocalDate start = startDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate end = endDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        int weekendCount = 0, weekdayCount = 0;

        for (LocalDate date = start; date.isBefore(end); date = date.plusDays(1)) {
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                weekendCount++;
            } else {
                weekdayCount++;
            }
        }
        int finalWeekdayCount = weekdayCount;
        int finalWeekendCount = weekendCount;
        Map<String,Integer> hotelTotal;
        if(customerType==1) {
            hotelTotal = hotelDataArrayList.stream().collect(Collectors.toMap(x->x.getHotelname(),
                    x->(finalWeekdayCount * x.getWeekdayRateRegularCustomer() + finalWeekendCount * x.getWeekendRateRegularCustomer())));
        } else {
            hotelTotal = hotelDataArrayList.stream().collect(Collectors.toMap(x->x.getHotelname(),
                    x->(finalWeekdayCount * x.getWeekdayRateRewardedCustomer() + finalWeekendCount * x.getWeekendRateRewardedCustomer())));
        }
        showCheapestHotel(hotelTotal);
    }

    public void showCheapestHotel(Map<String,Integer> hotelTotal){
        Map.Entry<String, Integer> min = null;
        for (Map.Entry<String, Integer> entry : hotelTotal.entrySet()) {
            if (min == null || min.getValue() > entry.getValue()) {
                min = entry;
            }
        }
        System.out.println("Hotel Name : "+min.getKey()+"\t Total Cost : "+ min.getValue());
    }

    public Scanner getInput() {
        return new Scanner(System.in);
    }
}