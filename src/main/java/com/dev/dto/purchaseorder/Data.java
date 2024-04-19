package com.dev.dto.purchaseorder;

import jakarta.validation.constraints.NotEmpty;

import java.util.ArrayList;

public class Data{

    @NotEmpty(message = "field po_number is required.")
    public String po_number;
    public String po_date;
    public Company company;
    public Vendor vendor;
    public ShipTo ship_to;
    public String requested_by;
    public String ship_via;
    public String delivery_date;
    public String payment_terms;
    public ArrayList<Line> lines;
    public String subtotal;
    public String sales_tax;
    public String sales_tax_percentage;
    public String shipping;
    public String other;
    public String total;
    public String comments;
    public String color;
}