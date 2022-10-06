package com.utility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SwapUtilTest {

	@Test
	void testSwpNumber() {
		
	int input[]=new int[] {2,6};
	
	int actualOutput[]=SwapUtil.swpNumber(input);
	int expectedOutput[]=new int[] {6,2};
	Assert.assertArrayEquals(expectedOutput,actualOutput);
	}

}
