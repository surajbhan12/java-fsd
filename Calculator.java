package Arithmatic_Calculator;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		char op;
		double num1,num2,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number :> ");
		num1=sc.nextInt();
		System.out.println("Enter Aritmatic operator like(+,-,/,*) :> ");
		op=sc.next().charAt(0);
		System.out.println("Enter second number :> ");
		num2=sc.nextInt();
		switch (op) {
		case '+': res=num1+num2;
		          System.out.println(num1+" "+op+" "+num2+" = "+res);
		          break;
		case '-': res=num1-num2;
        		  System.out.println(num1+" "+op+" "+num2+" = "+res);
                  break;
		case '/': res=num1/num2;
                  System.out.println(num1+" "+op+" "+num2+" = "+res);
                  break;
		case '*': res=num1*num2;
                  System.out.println(num1+" "+op+" "+num2+" = "+res);
                  break;
        default :
        	       System.out.println("Invalid input !");
        	       break;
		}
	}

}
