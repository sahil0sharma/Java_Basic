package Practice.file3.practice;

import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();

        int n = str.length();

        for (int i = 0; i < n; i++) {
            String temp = "";


            for (int j = i; j < n; j++) {
                temp = temp + str.charAt(j);
                System.out.println(temp);
            }
        }
    }
}