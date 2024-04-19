package com.dev.dto.salesorder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BillToCustomer{
    @JsonProperty("PartyName")
    public String partyName;
}