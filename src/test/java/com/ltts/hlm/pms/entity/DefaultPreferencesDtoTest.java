package com.ltts.hlm.pms.entity;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class DefaultPreferencesDtoTest {
	@Test
	public void defaultPreferencesfto() {
		DefaultPreferencesDto defaultPreferencesDto =new DefaultPreferencesDto();
		defaultPreferencesDto.setDATE_ID(2012-12-12);
		defaultPreferencesDto.setDATEFORMAT("yyyy-mm-dd");
		defaultPreferencesDto.setLANGUAGE("English");
		defaultPreferencesDto.setMEASUREMENT_ID(123);
		defaultPreferencesDto.setTIME_ID(12);
		defaultPreferencesDto.setTIMEFORMAT("yyyy-mm-dd");
		defaultPreferencesDto.setLANGUAGE_ID(23);
		defaultPreferencesDto.setMEASUREMENT_TYPE("analog");
		
		
		
		
		assertNotNull(defaultPreferencesDto.getDATE_ID());
		assertNotNull(defaultPreferencesDto.getDATEFORMAT());
		assertNotNull(defaultPreferencesDto.getLANGUAGE());
		assertNotNull(defaultPreferencesDto.getLANGUAGE_ID());
		assertNotNull(defaultPreferencesDto.getMEASUREMENT_ID());
		assertNotNull(defaultPreferencesDto.getMEASUREMENT_TYPE());
		assertNotNull(defaultPreferencesDto.getTIME_ID());
		assertNotNull(defaultPreferencesDto.getTIMEFORMAT());
		
		
		
		
	}
}
