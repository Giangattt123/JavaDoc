package javaptit.BaiKiemTra1;

import java.util.Scanner;

/**
 *
 * @author DucGiang
 */
public class Main {

    public static void main(String[] args) {
        DaThuc m1 = null;
        DaThuc m2 = null;
        DaThuc tong = null;
        SoNguyen ll = null;
        XuLiXau str = null;
        while (true) {
            System.out.println("1. Nhap vao day so thuc:");
            System.out.println("2. Viet ra phan tu nho nhat cua day so:");
            System.out.println("3. Sap xep day giam dan:");
            System.out.println("4. Nhap vao 1 doan van ban:");
            System.out.println("5. Dua ra so cau:");
            System.out.println("6. Chuan hoa va viet ra:");
            System.out.println("7. Nhap vao 1 da thuc:");
            System.out.println("8. Tinh tong hai da thuc:");
            System.out.println("9. Phep chia hai da thuc:");
            System.out.println("0. Thoat");
            System.out.print("Moi chon (0-9): ");
            int chon;
            Scanner sc = new Scanner(System.in);
            chon = sc.nextInt();
            switch (chon) {
                case 0:
                    System.out.println("Ket thuc chuong trinh!!!");
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("Nhap vao so luong phan tu:");
                    int n = sc.nextInt();
                    System.out.println("Nhap vao cac phan tu cua mang:");
                    ll = new SoNguyen(n);
                    ll.input();
                    break;
                case 2:
                    int minVal = ll.minPhanTu();
                    System.out.println("Phan tu nho nhat la: " + minVal);
                    break;
                case 3:
                    ll.sapXepGiam();
                    System.out.println("Mang sau khi duoc sap xep la: ");
                    ll.output();
                    System.out.println();
                    break;
                case 4:
                    String s = sc.nextLine();
                    str = new XuLiXau(s);
                    break;
                case 5:
                    int soCau = str.soCau();
                    System.out.println("So cau cua doan van ban la: " + soCau);
                    break;
                case 6:
                    System.out.println("Sau duoc chuan hoa la: ");
                    System.out.println(str);
                    break;
                case 7:
                    int n1 = sc.nextInt();
                    m1 = new DaThuc();
                    m1.input();
                    break;
                case 8:
                    int n2 = sc.nextInt();
                    m2 = new DaThuc();
                    m2.input();
                    tong = m1.tongHaiDaThuc(m2);
                    int [] arr = tong.mangDaThuc();
                    for (int i = 0 ; i < arr.length ; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    break;
                case 9:
                        
                    break;
                default:
                    System.out.println("Ban chi chon 0 - 9");
                    break;
            }
        }
    }
}
