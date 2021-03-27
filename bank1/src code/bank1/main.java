package bank1;

import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println("Welcome to infinte Bank");
          System.out.println("Please choose the number");
          System.out.println("1.Add account");
          System.out.println("2.Check Balance");
          System.out.println("3.Deposit a amount");
          System.out.println("4.Withdraw an amount");
          
          Scanner sc=new Scanner(System.in);
          int s=sc.nextInt();
          
          if(s==1) {
        	  
        	  Random rand = new Random();
              int upperbound = 10025;
              int int_random = rand.nextInt(upperbound);
        	  
              Scanner sc1=new Scanner(System.in);
        	  System.out.println("Enter your name");
        	  String name =sc.next();
        	  System.out.println("Enter your age");
        	  int age=sc1.nextInt();
        	  System.out.println("Enter your amount");
        	  int amt=sc1.nextInt();
        	  int k=int_random;
        	  System.out.println("Your account number is"+k+"Please note it");
        	  businesslayer bss=new businesslayer();
        	  bss.add_records( k,name, age, amt);
          
          }
          
          else if(s==2){
        	  System.out.println("Enter your account number");
        	  Scanner sc3=new Scanner(System.in);
        	  int acc=sc3.nextInt();
        	  
        	  
        	  businesslayer bss=new businesslayer();
        	  bss.show_amt(acc);
        	  
        	 
          }
          
          else if(s==3) {
        	   System.out.println("Enter acount number");
        	   Scanner sc4=new Scanner(System.in);
        	   int a=sc4.nextInt();
        	   System.out.println("Enter amount to be deposited");
        	   int b=sc4.nextInt();
        	   businesslayer bss=new businesslayer();
        	   bss.add_amt(a,b);
        	   System.out.println("Your current balance is");
        	   bss.show_amt(a);
          }
          else if(s==4) {
        	  System.out.println("Enter account number");
        	  Scanner sc5=new Scanner(System.in);
        	  int a=sc5.nextInt();
        	  System.out.println("Enter withdraw amount");
        	  int b=sc5.nextInt();
        	  businesslayer bss=new businesslayer();
       	      bss.draw_amt(a, b);
       	      System.out.println("Your current balance is");
       	      bss.show_amt(a);
          }
          
	}

}
