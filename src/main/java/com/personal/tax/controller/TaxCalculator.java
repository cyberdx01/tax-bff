package com.personal.tax.controller;

import com.personal.tax.model.dto.TaxResponseDto;
import com.personal.tax.sdk.client.TaxRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaxCalculator {

    @Autowired
    TaxRestClient taxRestClient;

    @GetMapping(value = "tax")
    public TaxResponseDto calculateTax (@RequestParam Double annualIncome) {
        return taxRestClient.calculateTax(annualIncome);
    }

}
