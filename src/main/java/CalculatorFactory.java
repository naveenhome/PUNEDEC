package main.java;

import java.util.HashMap;
import java.util.Map;

public class CalculatorFactory {
	
	public static Map<String, Operator> operatorCalculatorMap = null;

	public CalculatorFactory() {
		super();
		if(operatorCalculatorMap==null){
			operatorCalculatorMap = new HashMap<String, Operator>();
			operatorCalculatorMap.put("+", new AddCalculation());
			operatorCalculatorMap.put("-", new SubtractCalculation());
			operatorCalculatorMap.put("*", new MultiplyCalculation());
			operatorCalculatorMap.put("/", new DivideCalculation());
			operatorCalculatorMap.put("^", new PowerCalculation());
			operatorCalculatorMap.put("%", new PercentOperator());
			operatorCalculatorMap.put("!", new FactorialOperator());
		}
	}
	
	
}
