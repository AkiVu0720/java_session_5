package rikkei.academy;

import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi: ");
        String str = scanner.nextLine();
         char[] arrChar = str.toCharArray();

        for (int i = 0; i <arrChar.length ; i++) {
            System.out.print(arrChar[i]);
        }

    }


}
