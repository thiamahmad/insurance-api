package com.iso4digit.insuranceapi.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DateType{
    @JsonProperty("$date") 
    private Date date;
}
