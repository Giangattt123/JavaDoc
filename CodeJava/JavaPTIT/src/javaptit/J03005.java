package javaptit;

import java.util.Scanner;

public class J03005 {
    public static void convert(String s) {
        String[] arr = s.trim().split("\\s+");
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase());
            if (i != arr.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.print(", " + arr[0].toUpperCase() + "\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            convert(s);
        }
    }
}
