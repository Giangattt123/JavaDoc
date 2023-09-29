/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh1;


//doc tu ban phim 
import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {
        MonHoc mh=new MonHoc();
        while(true){
            System.out.print("""
                1. Nhập 1 mon hoc
                2. viet ra mon ay
                3. lay ra tien phai nop
                4. sua lai tinh trang
                5. lay ta tinh trang
                6. dat lai ten    
                0. Thoat
                             """);
            System.out.print("ban chon (0->6): ");
            int chon;
            Scanner sc=new Scanner(System.in);
            chon=sc.nextInt();
            switch(chon){
                case 0->{
                    System.out.println("bye!!");
                    System.exit(0);
                }
                case 1->{
                    mh.input();
                }
                case 2->{
                    System.out.println(mh);
                }
                case 3->{
                    System.out.println("tien nop:"+mh.getHocPhi());
                }
                case 4->{
                    //nhap tinh trang moi
                    //set
                }
                case 5->{
                    System.out.println(mh.isTtrang());
                }
                case 6->{
                    //nhap ten moi
                    //set
                }
                
                default-> System.out.println("Chi chon 0->9");
            }
            
        }
    }
}

