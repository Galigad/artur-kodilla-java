package com.kodilla.sortapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SortAppApplication {

	public static void main(String[] args) { SpringApplication.run(SortAppApplication.class, args);

		int n = 10, i, j, temp;
		int numbers[] = {12,132,14,6,242,521,552,232,992,1};

		boolean ascendingOrDescenging = !true;

		for(i=0; i < n; i++) {
			for(j = i + 1; j < n; j++) {
				if(ascendingOrDescenging == true) {
					if(numbers[i] > numbers[j]) {
						temp = numbers[i];
						numbers[i] = numbers[j];
						numbers[j] = temp;
					}
				} else {
					if(numbers[i] < numbers[j]) {
						temp = numbers[i];
						numbers[i] = numbers[j];
						numbers[j] = temp;
					}
				}
			}
		}

		if(ascendingOrDescenging == true) {
			System.out.println("Ascending Order:");
		} else {
			System.out.println("Descending Order:");
		}
		for(i = 0; i < n ; i++) {
			System.out.println(numbers[i]);
		}
	}
}