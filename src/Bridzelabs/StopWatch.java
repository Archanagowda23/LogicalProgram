package Bridzelabs;

import java.util.Scanner;

public class StopWatch {
    static Scanner scanner=new Scanner(System.in);
    public static void stopwatchSimulator()
    {

        long startTime = System.currentTimeMillis();
        System.out.println("press any button to start and end");
        scanner.next();
        long stopTime= System.currentTimeMillis();
        System.out.println("press any button to start and end");
        scanner.next();
        long time= stopTime- startTime;
        System.out.println("total time required "+time+" millisecond");
        System.out.println("total time required "+time/1000+" second");

    }
    public static void main(String[] args)
    {
        stopwatchSimulator();

    }
}
