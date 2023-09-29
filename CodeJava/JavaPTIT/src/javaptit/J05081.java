/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Product {
    public static int num = 0;
    private String maMH , tenMH , donViTinh;
    private int giaMua , giaBan , loiNhuan;

    public Product(String tenMH, String donViTinh , int giaMua, int giaBan) {
        this.maMH = "MH" + String.format("%03d", ++num);
        this.tenMH = tenMH;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        loiNhuan = giaBan - giaMua;
    }

    public int getLoiNhuan() {
        return loiNhuan;
    }
    
    
    public static Comparator<Product> loiNhuanGiam = new Comparator<Product>(){
        @Override
        public int compare(Product p1, Product p2) {
            return Integer.compare(p2.getLoiNhuan(), p1.getLoiNhuan());
        }
    };
    
    @Override
    public String toString() {
        return maMH + " " + tenMH + " "  + donViTinh + " " + giaMua + " " + giaBan + " " + loiNhuan;
    }
}
public class J05081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Product> products = new ArrayList<>();
        for (int i = 0 ; i < n ; i++) {
            String tenMH = sc.nextLine();
            String donViTinh = sc.nextLine();
            int giaMua = sc.nextInt();
            int giaBan = sc.nextInt();
            sc.nextLine();
            Product product = new Product(tenMH, donViTinh, giaMua, giaBan);
            products.add(product);
        }
        Collections.sort(products , Product.loiNhuanGiam);
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
