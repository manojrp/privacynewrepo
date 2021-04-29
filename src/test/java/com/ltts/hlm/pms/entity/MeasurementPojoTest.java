package com.ltts.hlm.pms.entity;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class MeasurementPojoTest {
	@Test
	public void locationModelTest() {
		MeasurementPojo measurementPojo =new MeasurementPojo();
		
		measurementPojo.setMEASUREMENT_ID(12);
		measurementPojo.setMEASUREMENT_TYPE("anlog");
		

		assertNotNull(measurementPojo.getMEASUREMENT_ID());
		assertNotNull(measurementPojo.getMEASUREMENT_TYPE());
		
		
		
		
	}
}
