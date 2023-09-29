/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Collections;

/**
 *
 * @author DucGiang
 *
 */
class MatHang implements Comparable<MatHang> {

    public static int num = 1;
    private String maHang, tenHang, nhomHang;
    private Float giaMua, giaBan, loiNhuan;

    public MatHang(String tenHang, String nhomHang, Float giaMua, Float giaBan) {
        this.maHang = "MH" + String.format("%02d", num++);
        this.tenHang = tenHang;
        this.nhomHang = nhomHang;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = giaBan - giaMua;
    }

    public Float getLoiNhuan() {
        return loiNhuan;
    }

    @Override
    public int compareTo(MatHang other) {
        if (this.getLoiNhuan() > other.getLoiNhuan()) {
            return -1;
        } else if (this.getLoiNhuan() < other.getLoiNhuan()) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return maHang + " " + tenHang + " " + nhomHang + " " + String.format("%.2f", loiNhuan);
    }
}

public class J07050 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        MatHang[] mh = new MatHang[n];
        for (int i = 0; i < n; i++) {
            String tenHang = sc.nextLine();
            String nhomHang = sc.nextLine();
            Float giaMua = Float.parseFloat(sc.nextLine());
            Float giaBan = Float.parseFloat(sc.nextLine());
            mh[i] = new MatHang(tenHang, nhomHang, giaMua, giaBan);
        }
        Arrays.sort(mh);
        for (MatHang x : mh) {
            System.out.println(x);
        }
    }
}
