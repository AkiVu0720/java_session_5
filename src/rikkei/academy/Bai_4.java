package rikkei.academy;

import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String str = scanner.nextLine();
        System.out.print ("Chuoi co ki tu so khong:  ");
//        digitMethod(str);
        regex(str);

    }
    public  static void digitMethod ( String str){
        if (Digit(str)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
    public static boolean Digit (String str){
        boolean digit = false;
        for (int i = 0; i<str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                return  true;
            }
        }
        return digit;
    }
    public static  void regex(String str){
//        boolean isRegex = true;
//        Pattern p = Pattern.compile("\\d");
//        Matcher m = p.matcher(str);
        Pattern pattern = Pattern.compile("[0-9]");
        boolean b = pattern.matcher(str).matches();
        if (b){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
