//Bài tập 5: Dãy số nguyên
//1. Nhập vào 1 dãy số nguyên
//2. Đưa ra tổng
//3. Đưa ra trung bình
//4. Đưa ra giá trị lớn nhất, nhỏ nhất,
//5. Đưa ra vị trí số lớn nhất, số nhỏ nhất, số lớn nhì,...
//6. Đưa ra các số nguyên tố
//7. Đưa ra các số chia hết cho 1 số (ví dụ 3 hoặc 5...)
//8. Sắp xếp dãy số tăng dần, giảm dần
//9. Kiểm tra dãy số đã được sắp xếp chưa
//10. Kiểm tra xem dãy số có phải là mảng đối xứng không?
//11. Đưa ra số lần xuất hiện của mỗi phần tử
//12. Phần tử thứ i được gọi là điểm cân bằng của dãy số nếu như tổng các số bên trái bằng tổng các số bên
//phải của nó. Nhiệm vụ là tìm điểm cân bằng đầu tiên của dãy số. Nếu không có thì in ra -1.
package BaiTap1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class B5 {

    public static void main(String[] args) {
        int n = 0;
        int[] a = new int[100];
        while (true) {
            System.out.println("1. Nhap vao 1 day so nguyen: ");
            System.out.println("2. Dua ra tong: ");
            System.out.println("3. Dua ra  rung binh: ");
            System.out.println("4. Dua ra gia tri lon nhat, nho nhat: ");
            System.out.println("5. Dua ra vi tri so lon nhat, so nho nhat, so lon nhi, so nho nhi,..: ");
            System.out.println("6. Dua ra cac so nguyen to: ");
            System.out.println("7. Dua ra cac so chia het cho 1 so: ");
            System.out.println("8. Sap xep day so  tang dan, giam dan: ");
            System.out.println("9. Kiem tra xem day so da  dc sap xep chua: ");
            System.out.println("10. Kiem tra xem day so co phai mang doi xung  hay khong: ");
            System.out.println("11. Dua ra so lan xuat hien  cua moi phan tu: ");
            System.out.println("12. Diem can bang: ");
            System.out.println("0. Thoat");
            System.out.print("Hay chon 1 trong cac so tu 0 den 12: ");
            int chon;
            Scanner sc = new Scanner(System.in);
            chon = sc.nextInt();
            classesB5 myClass = new classesB5();
            switch (chon) {
                case 1:
                    n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        a[i] = sc.nextInt();
                    }
                    break;
                case 2:
                    int tong = myClass.sumArr(a);
                    System.out.println(tong);
                    break;
                case 3:
                    int tong1 = myClass.sumArr(a);
                    double trungBinh = (double) tong1 / n;
                    String strTrungBinh = String.format("%.2f", trungBinh);
                    System.out.println(strTrungBinh);
                    break;
                case 4:
                    myClass.MinMax(a , n);
                    break;
                case 5:
                    ArrayList<Integer> arr = myClass.Position(a);
                    for (int x :  arr) {
                        System.out.print(x + " ");
                    }
                    System.out.println();
                    break;
            }
        }
    }
}
