package main.java;

public class FactorialOperator implements UnaryOperator {

	public double calculate(double n) {
		double fact = 1; 
		for (double i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

}
