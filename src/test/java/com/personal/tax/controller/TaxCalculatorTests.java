package com.personal.tax.controller;

import com.personal.tax.model.dto.TaxResponseDto;
import com.personal.tax.sdk.client.TaxRestClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TaxCalculatorTests {

	@InjectMocks
	TaxCalculator taxCalculator;

	@Mock
	TaxRestClient taxRestClient;

	@Test
	void testCalculateTax() {
		Mockito.when(taxRestClient.calculateTax(ArgumentMatchers.any())).thenReturn(new TaxResponseDto());
		Assertions.assertNotNull(taxCalculator.calculateTax(5000.0));
	}

}
