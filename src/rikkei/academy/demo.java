package rikkei.academy;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
//        swap(a,b);
        int temp = a;
        a = b;
        b = temp;
        System.out.printf("a la: %d ",a);
        System.out.println("");
        System.out.printf("b la: %d ",b);
    }
    public  static  void  swap (int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
