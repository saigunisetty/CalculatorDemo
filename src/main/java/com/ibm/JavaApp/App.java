package com.ibm.JavaApp;

/**
 * Hello world!
 *
 */
public class App 
{
    
	public int firstNum;
	public int secondNum;
	
	public App(int firstNum, int secondNum) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}

	
	public int getFirstNum() {
		return firstNum;
	}


	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}


	public int getSecondNum() {
		return secondNum;
	}


	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public int addFunction(int firstNum, int secondNum) {
			return firstNum+secondNum;
	}
	
	public int subFunction(int firstNum, int secondNum) {
		return secondNum-firstNum;
	}
	
	public int mulFunction(int firstNum, int secondNum) {
		return firstNum*secondNum;
	}
	
	public static void main( String[] args )
    {
        int firstNum = Integer.parseInt(args[0]);
        int secondNum = Integer.parseInt(args[1]);
        
        App app = new App(firstNum, secondNum);
        
        String output = String.format("\n*** Your Calculator ***\n\nFirst: %d\nSecond: %d\n\nSum : %d\nDifference : %d\nProduct : %d\n\n", app.firstNum, app.secondNum, app.addFunction(firstNum, secondNum), app.subFunction(firstNum, secondNum), app.mulFunction(firstNum, secondNum));
	    System.out.println(output);
        
    }
}
