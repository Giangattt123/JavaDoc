/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Student2{
    public static int num = 1;
    private String msv , name , lop , ngaySinh;
    private float gpa;
    public Student2(String name , String lop , String ngaySinh , float gpa) throws ParseException {
        this.msv = "B20DCCN" + String.format("%03d", num++);
        this.name = name;
        this.lop = lop;
        this.gpa = gpa;
        SimpleDateFormat fm = new SimpleDateFormat("dd/mm/yyyy");
        this.ngaySinh = fm.format(fm.parse(ngaySinh));
    }
    @Override
    public String toString() {
        return msv + " " + name + " " + lop + " " + ngaySinh + " " + String.format("%.2f", gpa);
    }
};
public class J07010 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("SV.in"));
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0 ; i < n ; i++) {
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String ngaySinh = sc.nextLine();
            float gpa = Float.parseFloat(sc.nextLine());
            Student2 sinhVien = new Student2(name, lop, ngaySinh, gpa);
            System.out.println(sinhVien);
        }
    }
}
