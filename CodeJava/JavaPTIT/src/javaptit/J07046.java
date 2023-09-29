/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DucGiang
 */
class KhachSan implements Comparable<KhachSan> {

    public static int num = 1;
    private String id, name, phong;
    private long ngayCuTru;

    public KhachSan(String name, String phong, long ngayCuTru) {
        this.id = "KH" + String.format("%02d", num++);
        this.name = name;
        this.phong = phong;
        this.ngayCuTru = ngayCuTru;
    }

    public long getNgayCuTru() {
        return ngayCuTru;
    }

    @Override
    public int compareTo(KhachSan other) {
        if (this.ngayCuTru > other.getNgayCuTru()) {
            return -1;
        } else if (this.ngayCuTru < other.getNgayCuTru()) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
          return id + " " + name + " " + phong + " " + ngayCuTru;
    }
}

public class J07046 {

    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int n = Integer.parseInt(sc.nextLine());
        List<KhachSan> lists = new ArrayList<KhachSan>();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine(); 
            String phong = sc.nextLine();
            Date startDay = sdf.parse(sc.nextLine());
            Date lastDay = sdf.parse(sc.nextLine());
            Long ngayCuTru = (lastDay.getTime() - startDay.getTime()) / (1000L * 60 * 60 * 24);
            KhachSan ks = new KhachSan(name, phong, ngayCuTru);
            lists.add(ks);
        }
        Collections.sort(lists);
        lists.forEach((item) -> {
            System.out.println(item);
        });
    }
}
