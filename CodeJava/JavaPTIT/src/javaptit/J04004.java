
package javaptit;

import java.util.Scanner;

class PhanSo1{
    private long tuSo  , mauSo;
    public PhanSo1(long tuSo , long mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    public long GCD(long a , long b) {
        while (b != 0)  {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public PhanSo1 add(PhanSo1 other) {
        long tuMoi = this.tuSo * other.mauSo + other.tuSo * this.mauSo;
        long mauMoi = this.mauSo * other.mauSo;
        long gcd = GCD(tuMoi, mauMoi);
        tuMoi /= gcd;
        mauMoi /= gcd;
        PhanSo1 tongToiGian = new PhanSo1(tuMoi , mauMoi);
        return tongToiGian;
    }
    @Override
    public String toString() {
        return tuSo + "/"  + mauSo;
    }
}
public class J04004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        PhanSo1 x = new PhanSo1(a , b);
        PhanSo1 y = new PhanSo1(c ,  d);
        PhanSo1  z = x.add(y);
        System.out.println(z);
    }
}
