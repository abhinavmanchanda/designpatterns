package com.comfycabs;

import static org.junit.Assert.*;

import org.junit.Test;

import com.comfycabs.CabBillGenerator.CabType;

public class CabBillGeneratorTest {

	@Test
	public void calculateCostForCompact() {
		CabBillGenerator cabBillGenerator = new CabBillGenerator(14,CabType.COMPACT,35);
		assertEquals(140, cabBillGenerator.calculateCost());
	}
	
	@Test
	public void calculateCostForComfort() {
		CabBillGenerator cabBillGenerator = new CabBillGenerator(3,CabType.COMFORT,9);
		assertEquals(45, cabBillGenerator.calculateCost());
	}
	
	@Test
	public void calculateCostForLuxury() {
		CabBillGenerator cabBillGenerator = new CabBillGenerator(10,CabType.LUXURY,29);
		assertEquals(200, cabBillGenerator.calculateCost());
	}

	@Test
	public void calculateCostForCompactWithExtraTime() {
		CabBillGenerator cabBillGenerator = new CabBillGenerator(14,CabType.COMPACT,45);
		assertEquals(143, cabBillGenerator.calculateCost());
	}
	
	@Test
	public void calculateCostForComfortWithExtraTime() {
		CabBillGenerator cabBillGenerator = new CabBillGenerator(3,CabType.COMFORT,10);
		assertEquals(46, cabBillGenerator.calculateCost());
	}
	
	@Test
	public void calculateCostForLuxuryWithExtraTime() {
		CabBillGenerator cabBillGenerator = new CabBillGenerator(10,CabType.LUXURY,39);
		assertEquals(218, cabBillGenerator.calculateCost());
	}
}
