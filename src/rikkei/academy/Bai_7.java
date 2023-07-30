package rikkei.academy;

import java.util.Scanner;

public class Bai_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String str = taoChuoi(scanner);
        char[] strNoi = new char[str.length()];
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            boolean flag = true;
            char charJ = str.charAt(i);
         if (charJ != ' '){
             for (int j = 0; j < str.length(); j++) {
                 if (charJ == strNoi[j]) {
                     flag = false;
                     break;
                 }
             }
         }
            if (flag) {
                strNoi[count] = charJ;
                count++;
            }

        }
        for (int j = 0; j < count; j++) {
            System.out.print(strNoi[j]);
        }

    }

    public static String taoChuoi(Scanner scanner) {
        String str = scanner.nextLine();
        return str;
    }
}
