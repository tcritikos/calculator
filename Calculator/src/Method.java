import java.util.Scanner;

public class Method
	{

		public static void main(String[] args)
			{
				Scanner userInput= new Scanner(System.in);
				System.out.println("Welcome to calculator give me a number you would like to calculate");
				Double number = userInput.nextDouble();
				System.out.println("How about another one");
				Double secondNumber = userInput.nextDouble();
				System.out.println(" ");
				Scanner userInput2= new Scanner(System.in);
				System.out.println("how would you like to calculate those numbers");
				System.out.println(" ");
				System.out.println("1) addition ");
				System.out.println("2) subtraction");
				System.out.println("3) multiplication");
				System.out.println("4) division ");
				System.out.println("5) exponents");
				String answer = userInput2.nextLine();
				if (answer.equals("1"))
					{
						System.out.println("The answer is " + add(number, secondNumber));
					}
				else if (answer.equals("2"))
					{
						System.out.println("The answer is " + subtract(number, secondNumber));
					}
				else if (answer.equals("3"))
					{
						System.out.println("The answer is " + multiply(number, secondNumber));
					}
				else if (answer.equals("4"))
					{
						System.out.println("The answer is " + divide(number,secondNumber) );
					}
				else
					{
						System.out.println("The answer is " + Math.pow(number,secondNumber));
					}
					
				
			}
		public static Double add(Double x, Double y)

		{
			return x + y; 
			
		}
		
		public static Double subtract(Double x, Double y)
		{
			return x - y; 
		}
		
		public static Double multiply(Double x, Double y)
		{
			return x * y; 
		}
		
		public static Double divide(Double x, Double y)
		{
			return x / y; 
		}
		
	}
