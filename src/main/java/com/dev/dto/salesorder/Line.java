package com.dev.dto.salesorder;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Line{
    @JsonProperty("SourceTransactionLineNumber")
    public String sourceTransactionLineNumber;
    @JsonProperty("ProductNumber")
    public String productNumber;
    @JsonProperty("OrderedQuantity")
    public String orderedQuantity;
    @JsonProperty("UnitSellingPrice")
    public String unitSellingPrice;
    @JsonProperty("RequestedShipDate")
    public String requestedShipDate;
    @JsonProperty("RequestedFulfillmentOrganizationCode")
    public String requestedFulfillmentOrganizationCode;
    @JsonProperty("PartialShipAllowedFlag")
    public boolean partialShipAllowedFlag;
    @JsonProperty("SubstitutionAllowedFlag")
    public boolean substitutionAllowedFlag;
    @JsonProperty("TransactionCategoryCode")
    public String transactionCategoryCode;
    @JsonProperty("SourceScheduleNumber")
    public String sourceScheduleNumber;
    @JsonProperty("SourceTransactionLineId")
    public String sourceTransactionLineId;
    @JsonProperty("SourceTransactionScheduleId")
    public String sourceTransactionScheduleId;
    @JsonProperty("OrderedUOM")
    public String orderedUOM;
    @JsonProperty("ExtendedAmount")
    public int extendedAmount;
    public ArrayList<ManualPriceAdjustment> manualPriceAdjustments;
}
