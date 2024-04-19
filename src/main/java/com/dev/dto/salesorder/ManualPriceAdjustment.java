package com.dev.dto.salesorder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ManualPriceAdjustment{
    @JsonProperty("AdjustmentAmount")
    public String adjustmentAmount;
    @JsonProperty("AdjustmentTypeCode")
    public String adjustmentTypeCode;
    @JsonProperty("ReasonCode")
    public String reasonCode;
    @JsonProperty("SequenceNumber")
    public String sequenceNumber;
    @JsonProperty("ChargeDefinitionCode")
    public String chargeDefinitionCode;
    @JsonProperty("SourceManualPriceAdjustmentId")
    public String sourceManualPriceAdjustmentId;
    @JsonProperty("ChargeRollupFlag")
    public boolean chargeRollupFlag;
}
