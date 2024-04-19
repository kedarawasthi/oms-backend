package com.dev.dto.salesorder;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;

public class Salesorder {

    @NotEmpty(message = "field BusinessUnitName is required.")
    @JsonProperty("BusinessUnitName")
    public String businessUnitName;

    @Size(min = 2, max = 100, message = "The length of field RequestingBusinessUnitName must be between 2 and 100 characters.")
    @JsonProperty("RequestingBusinessUnitName")
    public String requestingBusinessUnitName;
    @JsonProperty("SourceTransactionSystem")
    public String sourceTransactionSystem;
    @JsonProperty("SourceTransactionId")
    public String sourceTransactionId;
    @JsonProperty("SourceTransactionNumber")
    public String sourceTransactionNumber;
    @JsonProperty("BuyingPartyName")
    public String buyingPartyName;
    @JsonProperty("TransactionTypeCode")
    public String transactionTypeCode;
    @JsonProperty("CustomerPONumber")
    public String customerPONumber;
    @JsonProperty("TransactionalCurrencyCode")
    public String transactionalCurrencyCode;
    @JsonProperty("RequestingLegalEntity")
    public String requestingLegalEntity;
    @JsonProperty("PartialShipAllowedFlag")
    public boolean partialShipAllowedFlag;
    @JsonProperty("FreezePriceFlag")
    public boolean freezePriceFlag;
    @JsonProperty("FreezeShippingChargeFlag")
    public boolean freezeShippingChargeFlag;
    @JsonProperty("FreezeTaxFlag")
    public boolean freezeTaxFlag;
    @JsonProperty("SubmittedFlag")
    public boolean submittedFlag;
    @JsonProperty("Salesperson")
    public String salesperson;
    public ArrayList<BillToCustomer> billToCustomer;
    public ArrayList<ShipToCustomer> shipToCustomer;
    public ArrayList<SalesCredit> salesCredits;
    public ArrayList<Line> lines;
}