package main.java;

import java.util.Stack;


public class RPNCalculator {
	public RPNCalculator() {
		new CalculatorFactory();
	}
	
	private  Stack<String> stack = new Stack<String>();

	private  boolean isOperator(String operator){
		return CalculatorFactory.operatorCalculatorMap.containsKey(operator);
	}
	
	private  boolean basicValidityCheck(String rpn){
		if(rpn==null || rpn.isEmpty() || rpn.length()<3 ||
				!isOperator(""+rpn.charAt(rpn.length()-1))){
			return false;
		}
		return true;
	}
	
	private  void isEmptyStack() throws Exception{
		if(stack.isEmpty()){
			throw new EmptyStackException("Stack is Empty");
		}
	}
	
	public  double calculate(String rpn) throws Exception{
		double ret=0;
		if(basicValidityCheck(rpn)){
			String[] elements = rpn.split(",");
			for(int i=0;i<elements.length;i++){
				String c = elements[i];
				if(isOperator(c)){
					isEmptyStack();
					String b = stack.pop();
					if(c.equals("%") || c.equals("!")){
						UnaryOperator calculation = (UnaryOperator)CalculatorFactory.operatorCalculatorMap.get(c);
						ret = calculation.calculate(new Double(b).doubleValue());
					}
					else{
						isEmptyStack();
						String a = stack.pop();
						BinaryOperator calculation = (BinaryOperator)CalculatorFactory.operatorCalculatorMap.get(c);
						ret = calculation.calculate(new Double(a).doubleValue(), new Double(b).doubleValue());
					}
					stack.push(ret+"");
				}else{
					try{
						new Double(c);
					}catch(NumberFormatException nm){
						throw nm;
					}
					stack.push(c);
				}
			}
			isEmptyStack();
			if(stack.size()>1){
				throw new Exception();
			}
			ret = new Double(stack.pop()).doubleValue();
		}else{
			throw new Exception();
		}
		return ret;
	}
}
