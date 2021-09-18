package com.pattern;

import java.util.Scanner;

public class Fibanacci {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("Enter any number:");
        
         int num = scanner.nextInt();
        
         int f=0,a=1,b=1;
         
        
        System.out.print(a +" " +b +" ");
        
         while(f<=num) {
               
                f = a+b;
               
                if(f>num)
                   break;
               
               System.out.print(f +" ");
               
                a = b;
               
                b = f;
               
        }
 
         scanner.close();
	}

}
