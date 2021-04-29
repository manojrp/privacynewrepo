package com.ltts.hlm.pms.entity;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class LanguageupdateDtoTest {
	@Test
	public void LanguageupdateDtoTest() {
		LanguageupdateDto languageupdateDto =new LanguageupdateDto();
		languageupdateDto.setLANGUAGE_ID(12);
		
		
		
		
		
		
		assertNotNull(languageupdateDto.getLANGUAGE_ID());
		
		
	}
}
