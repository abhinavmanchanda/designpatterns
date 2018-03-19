package com.comfycabs;

import static org.junit.Assert.*;

import org.junit.Test;

public class CabBillGeneratorTest {

	@Test
	public void calculateCostForCompact() {
		CabBillGenerator cabBillGenerator = new CabBillGenerator(14,"Compact",35);
		assertEquals(140, cabBillGenerator.calculateCost());
	}
	
	@Test
	public void calculateCostForComfort() {
		CabBillGenerator cabBillGenerator = new CabBillGenerator(3,"Comfort",9);
		assertEquals(45, cabBillGenerator.calculateCost());
	}
	
	@Test
	public void calculateCostForLuxury() {
		CabBillGenerator cabBillGenerator = new CabBillGenerator(10,"Luxury",29);
		assertEquals(200, cabBillGenerator.calculateCost());
	}

	@Test
	public void calculateCostForCompactWithExtraTime() {
		CabBillGenerator cabBillGenerator = new CabBillGenerator(14,"Compact",45);
		assertEquals(143, cabBillGenerator.calculateCost());
	}
	
	@Test
	public void calculateCostForComfortWithExtraTime() {
		CabBillGenerator cabBillGenerator = new CabBillGenerator(3,"Comfort",10);
		assertEquals(46, cabBillGenerator.calculateCost());
	}
	
	@Test
	public void calculateCostForLuxuryWithExtraTime() {
		CabBillGenerator cabBillGenerator = new CabBillGenerator(10,"Luxury",39);
		assertEquals(218, cabBillGenerator.calculateCost());
	}
}
