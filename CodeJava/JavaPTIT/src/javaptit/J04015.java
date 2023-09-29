/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Scanner;

class GiaoVien{
    private String ma , name;
    private int luongCoBan , heSo , phuCap;

    public GiaoVien(String ma, String name, int luongCoBan) {
        this.ma = ma;
        this.name = name;
        this.luongCoBan = luongCoBan;
    }
    
    public void tinhToan() {
        heSo = Integer.parseInt(this.ma.substring(2));
        if (this.ma.substring(0 , 2).equals("HT")) this.phuCap  = 2000000;
        else if (this.ma.substring(0 , 2).equals("HP")) this.phuCap = 900000;
        else this.phuCap =  500000;
    }
    public int luongGiaoVien() {
        return this.luongCoBan  * this.heSo + this.phuCap;
    }
    public String toString() {
        return ma + " " + name + " " + heSo  + " " + phuCap + " " + luongGiaoVien();
    }
}
public class J04015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String name = sc.nextLine();
        int luongCoBan = sc.nextInt();
        GiaoVien x = new GiaoVien(ma, name, luongCoBan);
        x.tinhToan();
        System.out.println(x);
    }
}
