package com.dev.dto.returnorder;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;

public class Returnorder {

    public String grp_id;

    @NotEmpty(message = "field template is required.")
    public String template;

    public Data data;
}
