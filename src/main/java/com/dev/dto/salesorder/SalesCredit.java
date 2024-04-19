package com.dev.dto.salesorder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SalesCredit{
    @JsonProperty("SourceTransactionSalesCreditIdentifier")
    public String sourceTransactionSalesCreditIdentifier;
    @JsonProperty("SalesCreditTypeId")
    public String salesCreditTypeId;
    @JsonProperty("Percent")
    public String percent;
    @JsonProperty("Salesperson")
    public String salesperson;
}