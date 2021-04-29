package com.ltts.hlm.pms.entity;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;



public class DateformatpojoTest {
	

	@Test
	public void dateformatpojo() {
		DateFormatPojo dateformatpojo =new DateFormatPojo();
		dateformatpojo.setDATE_ID(2021-12-11);
		dateformatpojo.setDATEFORMAT("yyyy-mm-dd");
		
		
		
		
		assertNotNull(dateformatpojo.getDATE_ID());
		assertNotNull(dateformatpojo.getDATEFORMAT());
	}

}



