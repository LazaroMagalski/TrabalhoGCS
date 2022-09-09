package com.trabalho;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        int opt,tea,num = 0;

        System.out.println("Insert the right tea");
        System.out.println("1- White tea");
        System.out.println("2- Green tea");
        System.out.println("3- Black tea");
        System.out.println("4- Herbal tea");
        tea = in.nextInt();

        for (int i = 0; i < 5; i++) {
            System.out.println("Insert your Answer!");
            System.out.println("1- White tea");
            System.out.println("2- Green tea");
            System.out.println("3- Black tea");
            System.out.println("4- Herbal tea");
            opt = in.nextInt();
            
            if(opt == tea) num++;
        }
        System.out.println("Number of right answers!: " + num);
    }
}
