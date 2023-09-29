/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Scanner;

class PhanSo {
    private long tuSo , mauSo;
    PhanSo(long tuSo , long mauSo) {
        this.tuSo = tuSo;
        this.mauSo= mauSo;
    }
    public  long GCD(long a , long b) {
        while (b != 0)  {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public String toSring() {
        long gcd = GCD(this.tuSo, this.mauSo);
        return this.tuSo / gcd + "/" + this.mauSo / gcd; 
    }
}
public class J04003 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        PhanSo p = new PhanSo(sc.nextLong() , sc.nextLong());
        System.out.println(p.toSring());
    }
}
