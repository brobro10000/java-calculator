import java.util.Scanner;

/*COP3330 Spring 2019. FT Quiz 2
 * This code is written by: Hamzah Ullah
 */
public class Calculator {
	private double num1;
	private double num2;
	
	Calculator(double num1, double num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}

	public double getNum1() {
		return num1;
	}

	public double getNum2() {
		return num2;
	}
	public double add() {
		return num1+num2;
	}
	public double sub() {
		return num1-num2;
	}
	public double mul() {
		return num1*num2;
	}
	public double div() {
		return num1/num2;
	}
	public double power() {
		return Math.pow(num1, num2);
	}
	public int mod() {
		return Math.floorMod((int)num1,(int)num2);
	}
	public static void main(String[] args) {
	}
}
