package oopbasic;
import java.util.Scanner;

public class CalculatorUser {

	public static void main(String[] args) {
		int n=1;
		float tot=0;
		System.out.println("Enter the 2 nos");
		int a= new Scanner(System.in).nextInt();
		
		System.out.println();
		int b= new Scanner(System.in).nextInt();
		System.out.println();
		System.out.println("1.ADDITION");
		System.out.println("2.SUBTRACTION");
		System.out.println("3.MULTIPLICATION");
		System.out.println("4.DIVISION");
		System.out.println("Enter your choice");
	
		int ch=new Scanner(System.in).nextInt();
		switch(ch)
		{
case 1:
	 tot=a+b;
	System.out.println(a+ "+" +b + "=" +(a+b));
	break;
			case 2:
				tot=a-b;
				System.out.println(a+ "-" +b + "=" +(a-b));
				break;
			case 3:
				tot=a*b;
				System.out.println(a+ "*" +b + "=" +(a*b));
				break;
			case 4:
			 float c;
			 c=((float)a)/b;
			 tot=c;
			 System.out.println(a+ "/" +b + "=" +(c));
				break;
            default:
            	System.out.println("please enter choice only between 1 and 4");
		}
		int count=2;
		System.out.println("Do you want to continue or exit");
		System.out.println("1.continue 0.exit");
		n=new Scanner(System.in).nextInt();
		while(n==1)
		{
			
			count++;
			
		System.out.println("Enter the " + count + "th number" );
		int num= new Scanner(System.in).nextInt();
		System.out.println("1.ADDITION");
		System.out.println("2.SUBTRACTION");
		System.out.println("3.MULTIPLICATION");
		System.out.println("4.DIVISION");
		System.out.println("Enter your choice");
	
		int ch1=new Scanner(System.in).nextInt();
		
		
		switch(ch1)
		{
case 1:
	tot+=num;
	System.out.println((tot-num) + "+" + num + "=" + (tot));
	break;
			case 2:
				tot-=num;
				System.out.println((tot+num) + "-" + num + "=" + (tot));
				break;
			case 3:
				tot*=num;
				System.out.println((tot/num) + "*" + num + "=" + (tot));
				break;
			case 4:
		 tot=((float)tot)/num;
		 System.out.println((tot * num) + "/" + num + "=" + (tot));
				break;
            default:
            	System.out.println("please enter choice only between 1 and 4");
		}
		System.out.println("Do you want to continue or exit");
		System.out.println("1.continue 0.exit");
		n=new Scanner(System.in).nextInt(); 
		
	  
		}
		
		
}
}
	



