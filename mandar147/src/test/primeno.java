package test;

import java.util.Iterator;

public class primeno {
public static void main(String[] args) {
	for (int i = 1; i <=100; i++) {
		if (i%2==0) {
			System.out.println(i+"it is prime");
		}
		else {
			System.out.println(i+"it is not prime");
		}
	}
}
}
