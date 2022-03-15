package Bridzelabs;

import java.util.Scanner;

public class CouponCode {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of coupons:");
        int num = scanner.nextInt();
        char[] ch = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

        for (int i = 0; i < num; i++) {
            int random = (int) (Math.random() * 999999999); // to increase the value of math.random and storing it at
            // int.
            StringBuffer stringbuffer = new StringBuffer();
            while (random > 0) {
                stringbuffer.append(ch[random % ch.length]);
                random /= ch.length;
            }

            String CouponCode = stringbuffer.toString();
            System.out.println("Coupon Code: " + CouponCode);
        }
    }
}
