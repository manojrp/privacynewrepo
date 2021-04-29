package com.ltts.hlm.pms.entity;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class LanguagePojoTest {
	@Test
	public void languagePojoTest() {
		LanguagePojo languagePojo =new LanguagePojo();
		languagePojo.setLANGUAGE("eng");
		languagePojo.setLANGUAGE_ID(2);
		
		
		
		
		
		assertNotNull(languagePojo.getLANGUAGE());
		assertNotNull(languagePojo.getLANGUAGE_ID());
		
	}
}
