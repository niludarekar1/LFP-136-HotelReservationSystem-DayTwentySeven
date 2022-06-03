package com.bridgelabz;

public class HotelData {
    String customer_type;
    String hotelname;
    int rate;
    int regularCustomerRate;
    String date1;
    String date2;

    public HotelData(String customer_type, String hotelname, int rate, int regularCustomerRate, String date1, String date2) {
        this.customer_type = customer_type;
        this.hotelname = hotelname;
        this.rate = rate;
        this.regularCustomerRate = regularCustomerRate;
        this.date1 = date1;
        this.date2 = date2;
    }

    public String getCustomer_type() {
        return customer_type;
    }

    public void setCustomer_type(String customer_type) {
        this.customer_type = customer_type;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getRegularCustomerRate() {
        return regularCustomerRate;
    }

    public void setRegularCustomerRate(int regularCustomerRate) {
        this.regularCustomerRate = regularCustomerRate;
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getDate2() {
        return date2;
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }

    @Override
    public String toString() {
        return "HotelData{" +
                "customer_type='" + customer_type + '\'' +
                ", hotelname='" + hotelname + '\'' +
                ", rate=" + rate +
                ", regularCustomerRate=" + regularCustomerRate +
                ", date1='" + date1 + '\'' +
                ", date2='" + date2 + '\'' +
                '}';
    }
}