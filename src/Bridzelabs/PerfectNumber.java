package Bridzelabs;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int sum = 0, i = 1;
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        while (i <= num / 2)
        {
            if (num % i == 0)
            {
                sum = sum + i;
            }
            i++;
        }

        if (num == sum)
        {
            System.out.println(num+" is Perfect Num");
        }
        else
        {
            System.out.println(num+" is Not perfect");
        }

    }
}
