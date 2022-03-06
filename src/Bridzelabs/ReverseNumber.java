package Bridzelabs;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        int remainder,reverse=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num= scanner.nextInt();

        while(num!=0)
        {
            remainder=num%10;
            reverse=(reverse*10)+remainder;
            num=num/10;
        }
        System.out.println("Reverse number is "+reverse);
    }
}
