package com.dev.dto.purchaseorder;

import jakarta.validation.constraints.NotEmpty;

public class Purchaseorder {

    @NotEmpty(message = "field template is required.")
    public String template;
    public Data data;
}
