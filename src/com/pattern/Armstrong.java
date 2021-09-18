package com.pattern;

import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter any number:");
        
         int originalNum = scanner.nextInt();
        
         int num = originalNum ;
        
         int reminder;
        
         int cubedNum = 0;
                     
     while(num >0) {
        
         reminder = num % 10;
        
         num = num / 10;
    
         cubedNum = cubedNum + (reminder* reminder* reminder);
        
     }
    
     if(cubedNum ==originalNum) {
        
        System.out.println("Given number is an Armstrong number");
        
     } else {
        
        System.out.println("Given number is not an Armstrong number");
        
     }
    
     scanner.close();
	}

}
