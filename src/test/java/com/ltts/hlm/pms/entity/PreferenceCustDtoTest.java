package com.ltts.hlm.pms.entity;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class PreferenceCustDtoTest {
	@Test
	public void testPreferenceCustDto() {
		PreferenceCustDto preferenceCustDto =new PreferenceCustDto();
		
		preferenceCustDto.setDATE_ID(12);
		preferenceCustDto.setDATEFORMAT("yyyy-mm-dd");;
		preferenceCustDto.setLANGUAGE("eng");
		preferenceCustDto.setLANGUAGE_ID(0);
		preferenceCustDto.setMEASUREMENT_ID(12);
		preferenceCustDto.setMEASUREMENT_TYPE("mode");
		preferenceCustDto.setTIME_ID(12);
		preferenceCustDto.setTIMEFORMAT("timeformat");
		preferenceCustDto.setVEHICLE_ID("vehid");
		preferenceCustDto.setVEHICLE_NAME("vehname");
	
	
		

		assertNotNull(preferenceCustDto.getDATE_ID());
		assertNotNull(preferenceCustDto.getDATEFORMAT());
		assertNotNull(preferenceCustDto.getLANGUAGE());
		assertNotNull(preferenceCustDto.getLANGUAGE_ID());
		assertNotNull(preferenceCustDto.getMEASUREMENT_ID());
		assertNotNull(preferenceCustDto.getMEASUREMENT_TYPE());
		assertNotNull(preferenceCustDto.getTIME_ID());
		assertNotNull(preferenceCustDto.getTIMEFORMAT());
		assertNotNull(preferenceCustDto.getVEHICLE_ID());
		assertNotNull(preferenceCustDto.getVEHICLE_NAME());
	}
		
		
}
