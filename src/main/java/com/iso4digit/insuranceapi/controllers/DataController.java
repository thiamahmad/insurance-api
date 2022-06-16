package com.iso4digit.insuranceapi.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iso4digit.insuranceapi.models.CaseType;
import com.iso4digit.insuranceapi.models.Data;
import com.iso4digit.insuranceapi.services.DataService;

@RestController()
public class DataController {

    @Autowired
    private DataService dataService;

    @GetMapping("/datas")
    public Object getData(@RequestParam Map<String, String> queryParams) {
        return dataService.getData(queryParams);
    }

}
