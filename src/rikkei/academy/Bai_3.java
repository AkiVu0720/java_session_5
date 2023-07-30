package rikkei.academy;

import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String str = scanner.nextLine();
        StringBuffer stringBuffer = new StringBuffer(str);
        String strReverse = stringBuffer.reverse().toString();
        System.out.println("Chuoi sau khi dao nguoc: ");
        System.out.printf("%s", strReverse);
    }
}
