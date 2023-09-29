/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07002 {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            long tong = 0;
            while (sc.hasNext()) {
                String s = sc.next();
                try {
                    tong += Integer.parseInt(s);
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println(tong);
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }
}
