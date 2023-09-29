/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Student_J07033 implements Comparable<Student_J07033> {

    private String msv, name, lop, email;

    public Student_J07033(String msv, String name, String lop, String email) {
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.email = email;
        chuanHoaTen();
    }

    public void chuanHoaTen() {
        String[] arr = this.name.trim().split("\\s+");
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase();
            if (i != arr.length - 1) {
                ans += " ";
            }
        }
        this.name = ans;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int compareTo(Student_J07033 o) {
        return this.msv.compareTo(o.getMsv());
    }

    public Student_J07033() {
    }

    @Override
    public String toString() {
        return msv + " " + name + " " + lop + " " + email;
    }
}

public class J07033 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        Student_J07033[] students = new Student_J07033[n];
       for (int i = 0; i < n; i++) {
            String msv = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            students[i] = new Student_J07033(msv, name, lop, email);
        }
        Arrays.sort(students);
        for (Student_J07033 i : students) {
            System.out.println(i);
        }
    }
}
