/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Student {

    private String msv = "B20DCCN001";
    private String name , lop , ngaySinh;
    private float gpa;
    
    public Student(String name, String lop, String ngaySinh, float gpa) {
        this.name = name;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }

    public String chuanHoa() {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date date = formatter.parse(ngaySinh);
            return formatter.format(date);
        } catch (ParseException e) {
            System.out.println(e);
        }
        return "";
    }

    @Override
    public String toString() {
        return msv + " " + name + " " + lop + " " + chuanHoa() + " " + String.format("%.2f", gpa);
    }
}
public class J04006 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String lop = sc.nextLine();
        String ngaySinh = sc.nextLine();
        float gpa = sc.nextFloat();
        Student x = new Student(name, lop, ngaySinh, gpa);
        System.out.println(x);
    }
}
