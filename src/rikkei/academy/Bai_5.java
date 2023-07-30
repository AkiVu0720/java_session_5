package rikkei.academy;

import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi can ma hoa");
        String str = scanner.nextLine();
        //Khong co khoang trang o hai dau
        str = str.trim();
        //Moi tu cach nhau 1 khoang trang
         str = str.replaceAll("\\s+"," ");
        //chuyen tat ca thanh chu thuong
        str = str.toLowerCase();
        //Tach cac chu trong chuoi vao mang, sau do chuyen chu cai dau thanh chua Hoa
        String [] strArray = str.split(" ");
        //ghep thanh chuoi moi
        String strAdd = "";
        for (String str1 : strArray) {
            strAdd += str1.valueOf(str1.charAt(0)).toUpperCase() + str1.substring(1)+ " ";
        }
        System.out.println("Chuoi sau khi chuan hoa: "+ strAdd);

    }
}
