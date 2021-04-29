package com.ltts.hlm.pms.entity;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class DealerupdateDtoTest {
	@Test
	public void dateformatupdatedto() {
		DealerupdateDto dealerPojo =new DealerupdateDto();
		dealerPojo.setDEALER_ID("D123");;
		
		
		
		
		
		assertNotNull(dealerPojo.getDEALER_ID());
		
	}
}
