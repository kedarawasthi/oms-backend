package com.dev.dto.returnorder;

import jakarta.validation.constraints.NotEmpty;

import java.util.ArrayList;

public class Data{
    @NotEmpty(message = "field order_number is required.")
    public String order_number;
    public String order_date;
    public ReturnFrom return_from;
    public ReturnTo return_to;
    public ArrayList<Item> items;
    public String message_title;
    public String message_body;
    public Company company;
    public int barcode;
}