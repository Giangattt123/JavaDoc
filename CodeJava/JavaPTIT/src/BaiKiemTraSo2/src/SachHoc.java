/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class SachHoc extends TuLieu implements ITuLieu{
    private String ten , tenTGl;
    private int soTrang;

    public SachHoc() {
    }

    public SachHoc(String ten , String tenTG , int soTrang, String tenNhaXB, double gia, int soLuong) {
        super(tenNhaXB, gia, soLuong);
        this.ten = ten;
        this.soTrang = soTrang;
        double giaBan=0.0;
        if (soTrang < 300) giaBan = gia * 0.95;
        else if (soTrang > 301 && soTrang < 500) giaBan = gia * 1.1;
        else giaBan = gia * 0.85;
        if (soTrang > 500) giaBan = gia * 0.9;
        super.setGia(giaBan);
        String ma = this.ten;
        String []arr = ma.split("\\s+");
        String Ma="";
        Ma = arr[0].toUpperCase() + String.format("%03d", cnt++);
        super.setMa(Ma);
    }
    
    
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTenTGl() {
        return tenTGl;
    }

    public void setTenTGl(String tenTGl) {
        this.tenTGl = tenTGl;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return super.getMa() + " " + ten + " " + super.getTenNhaXB() + " " + soTrang + " " + (int)super.getGia();
    }
    
    
}
