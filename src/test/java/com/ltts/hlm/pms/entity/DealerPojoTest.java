package com.ltts.hlm.pms.entity;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class DealerPojoTest {
	@Test
	public void dateformatupdatedto() {
		DealerPojo dealerPojo =new DealerPojo();
		dealerPojo.setID(12L);
		
		
		
		
		
		assertNotNull(dealerPojo.getID());
		
	}
}
