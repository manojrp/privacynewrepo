package com.ltts.hlm.pms.entity;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ElectricalModelTest {
	@Test
	public void electricalModelTest() {
		ElectricalModel electricalModelTest =new ElectricalModel();
		electricalModelTest.setBATTERY_STATUS_1("good");
		electricalModelTest.setBATTERY_STATUS_2("better");
		
		
		
		
		
		assertNotNull(electricalModelTest.getBATTERY_STATUS_1());
		assertNotNull(electricalModelTest.getBATTERY_STATUS_2());
	}
}
