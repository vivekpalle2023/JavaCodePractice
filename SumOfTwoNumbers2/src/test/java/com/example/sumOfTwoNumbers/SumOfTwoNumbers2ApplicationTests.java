package com.example.sumOfTwoNumbers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class SumOfTwoNumbers2ApplicationTests {


	@Autowired
	SumOfNumbers sumOfNumber;
		@Test
	void TestSumOfNumbers() {
assertEquals(10, sumOfNumber.sumOfNumbers(10, 10));
		
	}

}
