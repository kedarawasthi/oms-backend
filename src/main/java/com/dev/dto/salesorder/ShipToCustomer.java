package com.dev.dto.salesorder;


import com.fasterxml.jackson.annotation.JsonProperty;

public class ShipToCustomer{
    @JsonProperty("PartyName")
    public String partyName;
}

