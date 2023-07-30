package rikkei.academy;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi 1: ");
        String str1 = scanner.nextLine();
        System.out.println("Nhap chuoi 2: ");
        String str2 = scanner.nextLine();
        StringBuffer stringBuffer = new StringBuffer(str1);
        String strReverse = stringBuffer.reverse().toString();
        System.out.println("Chuoi sau khi dao nguoc");
        System.out.println(strReverse);
        boolean isReverse = strReverse.matches(str2);
        if (isReverse){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

}
