/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit.BaiKiemTra1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DaThuc {
    private int []a;
    public DaThuc(){
    }
    public int getPhanTu() {
        return a.length;
    }
    public int[] mangDaThuc() {
        return a;
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i < getPhanTu() ; i++) {
            a[i] = sc.nextInt();
        }
    }
    public DaThuc(int n) {
        a = new int[n];
    }
    public DaThuc tongHaiDaThuc(DaThuc other) {
        int maxPhanTu = Math.max(this.getPhanTu(), other.getPhanTu());
        DaThuc m3 = new DaThuc(maxPhanTu);
        int [] x = m3.mangDaThuc();
        for (int i = 0 ; i < maxPhanTu ; i++) {
            x[i] = this.mangDaThuc()[i] + other.mangDaThuc()[i];
        }
        return m3;
    }
}
