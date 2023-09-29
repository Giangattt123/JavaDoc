/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Scanner;

class ThiSinh{
    private String fullName , ngaySinh;
    private  double dm1 , dm2 , dm3;

    public ThiSinh(String fullName, String ngaySinh, double dm1, double dm2, double dm3) {
        this.fullName = fullName;
        this.ngaySinh = ngaySinh;
        this.dm1 = dm1;
        this.dm2 = dm2;
        this.dm3 = dm3;
    }
    
    public double tongDiem() {
        return this.dm1 + this.dm2 + this.dm3;
    }
    
    @Override
    public String toString() {
        return fullName + " " + ngaySinh + " " + String.format("%.1f", tongDiem());
    }
}
public class J04005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullName  = sc.nextLine();
        String ngaySinh = sc.nextLine();
        double dm1 = sc.nextDouble();
        double dm2 = sc.nextDouble();
        double dm3 = sc.nextDouble();
        ThiSinh x = new ThiSinh(fullName , ngaySinh , dm1 , dm2 , dm3);
        System.out.println(x);
    }
}
