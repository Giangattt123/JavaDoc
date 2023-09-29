package javaptit.BaiKiemTra1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DucGiang
 */
public class SoNguyen {

    private int[] a;

    public SoNguyen() {
    }

    public int getPhanTu() {
        return a.length;
    }

    public SoNguyen(int n) {
        a = new int[n];
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < getPhanTu(); i++) {
            a[i] = sc.nextInt();
        }
    }

    public void output() {
        for (int i = 0; i < getPhanTu(); i++) {
            System.out.print(a[i] + " ");
        }
    }

    public int minPhanTu() {
        int min = a[0];
        for (int i = 1; i < getPhanTu(); i++) {
            if (a[i] <= min) {
                min = a[i];
            }
        }
        return min;
    }

    public void sapXepGiam() {
        for (int i = 0; i < getPhanTu() - 1; i++) {
            for (int j = i + 1; j < getPhanTu(); j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
