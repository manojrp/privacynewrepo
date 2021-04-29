package com.ltts.hlm.pms.entity;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class PreferenceDtoTest {
	@Test
	public void testPreferenceDto() {
		PreferenceDto preferenceDtoTest =new PreferenceDto();
		
		
		preferenceDtoTest.setDATE_ID(12);
		preferenceDtoTest.setDATEFORMAT("yyyy");
		preferenceDtoTest.setLANGUAGE("eng");
		preferenceDtoTest.setLANGUAGE_ID(12);
		preferenceDtoTest.setMEASUREMENT_ID(23);
		preferenceDtoTest.setMEASUREMENT_TYPE("analog");
		preferenceDtoTest.setTIME_ID(12);
		preferenceDtoTest.setTIMEFORMAT("hh");
		
	
	
		

		assertNotNull(preferenceDtoTest.getDATE_ID());
		assertNotNull(preferenceDtoTest.getDATEFORMAT());
		assertNotNull(preferenceDtoTest.getLANGUAGE());
		assertNotNull(preferenceDtoTest.getLANGUAGE_ID());
		assertNotNull(preferenceDtoTest.getMEASUREMENT_ID());
		assertNotNull(preferenceDtoTest.getMEASUREMENT_TYPE());
		assertNotNull(preferenceDtoTest.getTIME_ID());
		assertNotNull(preferenceDtoTest.getTIMEFORMAT());
		
}}
