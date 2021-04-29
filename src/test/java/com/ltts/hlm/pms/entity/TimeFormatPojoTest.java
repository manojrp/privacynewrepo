package com.ltts.hlm.pms.entity;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TimeFormatPojoTest {
	@Test
	public void testtimeFormatPojo() {
		TimeFormatPojo timeFormatPojoTest =new TimeFormatPojo();
		
		timeFormatPojoTest.setTIME_ID(12);
		timeFormatPojoTest.setTIMEFORMAT("yy");
	
		

		assertNotNull(timeFormatPojoTest.getTIME_ID());
		assertNotNull(timeFormatPojoTest.getTIMEFORMAT());
		
		
		
		
		
	}
}
