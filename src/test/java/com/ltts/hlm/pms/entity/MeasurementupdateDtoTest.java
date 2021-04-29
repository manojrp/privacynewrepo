package com.ltts.hlm.pms.entity;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class MeasurementupdateDtoTest {
	@Test
	public void testmeasurementupdateDto() {
		MeasurementupdateDto measurementupdateDto =new MeasurementupdateDto();
		
		measurementupdateDto.setMEASUREMENT_ID(12);
	
		

		assertNotNull(measurementupdateDto.getMEASUREMENT_ID());
		
		
		
		
		
	}
}
