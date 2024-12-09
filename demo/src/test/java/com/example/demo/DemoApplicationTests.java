package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {

	}

	@Test
	void problem1(){
		int[] arr = {1, 9, 6, 4, 5};

		int count = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					count++;
				}
			}
		}
		System.out.println(count);;
	}

}
