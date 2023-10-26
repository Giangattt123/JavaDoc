/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Bao extends TuLieu implements ITuLieu{
    private String ngay;
    private String ten;

    public Bao() {
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }


    public Bao(String ten , String tenNhaXB, String ngay ,double gia, int soLuong) {
        super(tenNhaXB, gia, soLuong);
        this.ngay = ngay;
        this.ten = ten;
        String[] arr = this.ngay.split("/");
        if (soLuong > 200) gia = gia * 0.95;
        if (Integer.parseInt(arr[1]) == 1 || Integer.parseInt(arr[1]) == 2) gia = gia * 0.95;
        super.setGia(gia);
        String ma = Character.toUpperCase(ten.charAt(0)) + String.format("%03d", cnt++);
        super.setMa(ma);
    }
    
   
    
    @Override
    public String toString() {
        return super.getMa() + " " + ten + " " + ngay + " " + super.getTenNhaXB() + " " + (int)super.getGia();
    }
    
    public int num() {
        String [] arr = ngay.split("/");
        int num = Integer.parseInt(arr[2]);
        return num;
    }
}
