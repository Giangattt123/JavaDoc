/*
Bài tập 1: Viết chương trình thực hiện Menu sau:
1. Nhập vào số nguyên dương n
2. Viết ra tổng 1+2+3+...+n
3. Viết ra tích 1.2.3...n
4. Viết ra tổng 2+4+....
5. Viết ra tổng 1+3+5+...
6. Viết ra các số nguyên tố <n
7. Viết ra dãy số Fibonacci <n
8. Viết tổng các chữ số của n (345: 3+4+5)
9. Viết các ước của n
*/
package BaiTap1;

import java.util.ArrayList;
import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        int n = 0;
        while (true) {
            System.out.println("1. Nhap vao n: ");
            System.out.println("2. Tong cac STN be hon bang n la: ");
            System.out.println("3. Tich cac so tu 1 den n: ");
            System.out.println("4. Tong cac so chan be hon bang n: ");
            System.out.println("5. Tong cac so le be hon bang n: ");
            System.out.println("6. Viet ra cac so nguyen to be hon n: ");
            System.out.println("7. Viet ra cac day so Fibo < n: ");
            System.out.println("8. Viet tong cac chu so cua n: ");
            System.out.println("9. Viet ra cac uoc cua n: ");
            System.out.println("0. Thoat");
            System.out.print("Hay chon 1 trong cac so tu 0 den 9: ");
            int chon;
            Scanner sc = new Scanner(System.in);
            chon = sc.nextInt();
            classesB1 myClass = new classesB1();
            switch(chon){
                case 1:
                    System.out.println("Nhap vao n:");
                    n = sc.nextInt();
                    break;
                case 2: 
                    System.out.print("Tong 1 + 2 + 3 + .. + " + n + ": ");
                    int sum = myClass.sumSequence(n);
                    System.out.println(sum);
                    break;
                case 3:
                    System.out.print("Tich 1 * 2 * 3 * .. * " + n + ": ");
                    int tich = myClass.factorial(n);
                    System.out.println(tich);
                    break;
                case 4:
                    System.out.print("Tong 2 + 4 + .. + " + n + ": ");
                    int sumChan = myClass.tongChan(n);
                    System.out.println(sumChan);
                    break;
                case 5:
                    System.out.print("Tong 1 + 3 + .. + " + n + ": ");
                    int sumLe = myClass.tongLe(n);
                    System.out.println(sumLe);
//                    System.out.println();
                    break;
                case 6:
                    System.out.print("Cac so nguyen to nho hon " + n + " la: ");
                    boolean[] isPrime = myClass.sieveNguyenTo(n);
                    for (int i = 2; i <= n; i++) {
                        if(isPrime[i] == true)
                            System.out.println(i + " ");
                    }
                    System.out.println();
                    break;
                case 7:
                    System.out.print("Cac so fibonacci nho hon " + n + " la: ");
                    int[] F = myClass.fibonacci(n);
                    int i = 0;
                    while(F[i] <= n){
                        System.out.println(F[i] + " ");
                        i++;
                    }
                    System.out.println();
                    break;
                case 8:
                    System.out.print("Tong cac chu so cua " + n + " la: ");
                    System.out.println(myClass.sumDigit(n));
                    System.out.println();
                    break;
                case 9:
                    System.out.print("Cac uoc nho hon " + n + " la: ");
                    ArrayList<Integer> devisors = myClass.devisor(n);
                    for (int j = 0; j < devisors.size(); j++) {
                        System.out.print(devisors.get(j) + " ");
                    }
                    System.out.println();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        }
    }
}
