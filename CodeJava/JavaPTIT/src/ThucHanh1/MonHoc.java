/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh1;



import java.util.Scanner;


public class MonHoc {
     //thuoc tinh
     private String ma,ten;
     private int soTinChi;
     private boolean ttrang;
     private double hocPhi;
     //contructors

    public MonHoc() {
    }

    public MonHoc(String ma) {
        this.ma = ma;
    }

    public MonHoc(String ma, String ten, int soTinChi, boolean ttrang) {
        this.ma = ma;
        this.ten = ten;
        this.soTinChi = soTinChi;
        this.ttrang = ttrang;
    }
    //getter/setter
    public String getMa(){
        return ma;
    }
    public void setMa(String ma){
        this.ma=ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public String isTtrang() {
        return ttrang?"da hoc":"chua hoc";
    }

    public void setTtrang(boolean ttrang) {
        this.ttrang = ttrang;
    }
    public double getHocPhi(){
        return soTinChi*630000;
    }
    
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("ma:");
        ma=sc.nextLine();
        
    }
     @Override
    public String toString(){
        return ma+"\t"+ten+"\t"+soTinChi+"\t"+getHocPhi();
    }
     
}

