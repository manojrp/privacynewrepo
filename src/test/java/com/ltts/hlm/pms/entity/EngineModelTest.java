package com.ltts.hlm.pms.entity;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class EngineModelTest {
	@Test
	public void electricalModelTest() {
		EngineModel electricalModelTest =new EngineModel();
		electricalModelTest.setALTERNATE_POTENTIAL("potential");
		electricalModelTest.setCHARGE_INDICATOR("indicator");
		electricalModelTest.setCHECK_ENGINE("checked");
		electricalModelTest.setEMERGENCY_STOP_MODE("stopmode");;
		electricalModelTest.setENGINE_BOT_PRESSURE("boost");;
		electricalModelTest.setENGINE_SPEED("high");
		electricalModelTest.setENGINE_TEMP("temp");
		electricalModelTest.setENGINE_TILT_TRIM("tilted");
		electricalModelTest.setFUEL_RATE("fuelrate");
		electricalModelTest.setLOW_OIL_PRESSURE("oilpressure");
		electricalModelTest.setOVER_TEMPERATURE("overtemp");
		electricalModelTest.setRATED_ENGINE_SPEED("rantedeng");
		electricalModelTest.setREV_LIMIT_EXCEEDED("limit exeeded");
		electricalModelTest.setTOTAL_ENGINE_HOURS("23");
		electricalModelTest.setTRANSMISSION_GEAR("gear");
		electricalModelTest.setWATER_IN_FUEL("waterinfuel");
		
		
		
		
		
		
		
		assertNotNull(electricalModelTest.getALTERNATE_POTENTIAL());
		assertNotNull(electricalModelTest.getCHARGE_INDICATOR());
		assertNotNull(electricalModelTest.getCHECK_ENGINE());
		assertNotNull(electricalModelTest.getEMERGENCY_STOP_MODE());
		assertNotNull(electricalModelTest.getENGINE_BOOT_PRESSURE());
		assertNotNull(electricalModelTest.getENGINE_SPEED());
		assertNotNull(electricalModelTest.getENGINE_TEMP());
		assertNotNull(electricalModelTest.getENGINE_TILT_TRIM());
		assertNotNull(electricalModelTest.getFUEL_RATE());
		assertNotNull(electricalModelTest.getLOW_OIL_PRESSURE());
		assertNotNull(electricalModelTest.getOVER_TEMPERATURE());
		assertNotNull(electricalModelTest.getRATED_ENGINE_SPEED());
		assertNotNull(electricalModelTest.getREV_LIMIT_EXCEEDED());
		assertNotNull(electricalModelTest.getTOTAL_ENGINE_HOURS());
		assertNotNull(electricalModelTest.getTRANSMISSION_GEAR());
		assertNotNull(electricalModelTest.getWATER_IN_FUEL());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
