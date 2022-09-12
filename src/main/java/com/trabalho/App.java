package com.trabalho;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Tea idtea = new Tea();
        int tea,opt,total = 0;
        System.out.println("Insert the right tea:");
        System.out.println("1- White tea");
        System.out.println("2- Green tea");
        System.out.println("3- Black tea");
        System.out.println("4- Herbal tea");
        tea = in.nextInt();

        for (int i = 1; i < 6; i++) {
            System.out.println("Insert the "+i+"º participant answer:");
            System.out.println("1- White tea");
            System.out.println("2- Green tea");
            System.out.println("3- Black tea");
            System.out.println("4- Herbal tea");
            opt = in.nextInt();
            total += idtea.identifyingTea(opt, tea);
        }
        System.out.println("Number of right answers: "+total);
    }
    
}
