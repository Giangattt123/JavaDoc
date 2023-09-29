/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class ThiSinh1 implements Comparable<ThiSinh1> {
    private String maThiSinh , hoTen , trangThai;
    private double math , physical , chemistry;

    public ThiSinh1(String maThiSinh, String hoTen, double math, double physical, double chemistry) {
        this.maThiSinh = maThiSinh;
        this.hoTen = hoTen;
        this.math = math;
        this.physical = physical;
        this.chemistry = chemistry;
    }
    public String getMa() {
        return maThiSinh;
    }
    public void setTrangThai(String sta) {
        this.trangThai = sta;
    }
    public String trangThaiTrungTuyen() {
        return trangThai;
    }
    public String chuanHoaTen() {
        hoTen = hoTen.trim().toLowerCase();
        String [] name = hoTen.split("\\s+");
        String ans = "";
        for (int i = 0 ; i < name.length ; i++) {
            ans += Character.toUpperCase(name[i].charAt(0)) + name[i].substring(1) + " ";
        }
        hoTen = ans.trim();
        return hoTen;
    }
    public double diemUuTien() {
        String s = maThiSinh.substring(0 , 3);
        if (s.equals("KV1")) return 0.5;
        else if (s.equals("KV2")) return 1.0;
        if (s.equals("KV3")) return 2.5;
        return 0;
    }
    public double tongDiem() {
        return math * 2 + physical + chemistry + diemUuTien();
    }
    public static String removeZero(double number) {
        DecimalFormat fm = new DecimalFormat("#.#");
        return fm.format(number);
    }
    @Override
    public int compareTo(ThiSinh1 other) {
        if (this.tongDiem() == other.tongDiem()) 
            return this.getMa().compareTo(other.getMa());
        else if (this.tongDiem() > other.tongDiem())
            return -1;
        else return 1;
    }
    @Override
    public String toString() {
        return maThiSinh + " " + chuanHoaTen() + " " + removeZero(diemUuTien()) + " " + removeZero(tongDiem()) + " " + trangThaiTrungTuyen();
    }
}
public class J07052 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<ThiSinh1> lists = new ArrayList<ThiSinh1>();
        for (int i = 0 ; i < n ; i++) {
            String maThiSinh = sc.nextLine();
            String hoTen = sc.nextLine();
            Double diemToan = Double.parseDouble(sc.nextLine());
            Double diemLi = Double.parseDouble(sc.nextLine());
            Double diemHoa = Double.parseDouble(sc.nextLine());
            ThiSinh1 x = new ThiSinh1(maThiSinh , hoTen , diemToan  , diemLi , diemHoa);
            lists.add(x);
        }
        Collections.sort(lists);
        int chiTieu = Integer.parseInt(sc.nextLine());
        double diemChuan = lists.get(chiTieu - 1).tongDiem();
        for (ThiSinh1 ts1 : lists) {
            if (ts1.tongDiem() >= diemChuan)
                ts1.setTrangThai("TRUNG TUYEN");
            else ts1.setTrangThai("TRUOT");
        }
        System.out.println(String.format("%.1f", diemChuan));
        for (ThiSinh1 ts1 : lists) {
            System.out.println(ts1);
        }
    }
}
