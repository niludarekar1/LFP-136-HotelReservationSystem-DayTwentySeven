package com.bridgelabz;

import java.util.Date;

public class HotelData {
    String hotelname;
    int rating;
    int weekdayRateRegularCustomer;
    int weekendRateRegularCustomer;
    int weekdayRateRewardedCustomer;
    int weekendRateRewardedCustomer;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    int total;
    public HotelData(String hotelname, int rating, int weekdayRateRegularCustomer, int weekendRateRegularCustomer, int weekdayRateRewardedCustomer, int weekendRateRewardedCustomer) {
        this.hotelname = hotelname;
        this.rating = rating;
        this.weekdayRateRegularCustomer = weekdayRateRegularCustomer;
        this.weekendRateRegularCustomer = weekendRateRegularCustomer;
        this.weekdayRateRewardedCustomer = weekdayRateRewardedCustomer;
        this.weekendRateRewardedCustomer = weekendRateRewardedCustomer;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getWeekdayRateRegularCustomer() {
        return weekdayRateRegularCustomer;
    }

    public void setWeekdayRateRegularCustomer(int weekdayRateRegularCustomer) {
        this.weekdayRateRegularCustomer = weekdayRateRegularCustomer;
    }

    public int getWeekendRateRegularCustomer() {
        return weekendRateRegularCustomer;
    }

    public void setWeekendRateRegularCustomer(int weekendRateRegularCustomer) {
        this.weekendRateRegularCustomer = weekendRateRegularCustomer;
    }

    public int getWeekdayRateRewardedCustomer() {
        return weekdayRateRewardedCustomer;
    }

    public void setWeekdayRateRewardedCustomer(int weekdayRateRewardedCustomer) {
        this.weekdayRateRewardedCustomer = weekdayRateRewardedCustomer;
    }

    public int getWeekendRateRewardedCustomer() {
        return weekendRateRewardedCustomer;
    }

    public void setWeekendRateRewardedCustomer(int weekendRateRewardedCustomer) {
        this.weekendRateRewardedCustomer = weekendRateRewardedCustomer;
    }

    @Override
    public String toString() {
        return "HotelData{" +
                "hotelname='" + hotelname + '\'' +
                ", rating=" + rating +
                ", weekdayRateRegularCustomer=" + weekdayRateRegularCustomer +
                ", weekendRateRegularCustomer=" + weekendRateRegularCustomer +
                ", weekdayRateRewardedCustomer=" + weekdayRateRewardedCustomer +
                ", weekendRateRewardedCustomer=" + weekendRateRewardedCustomer +
                '}';
    }
}