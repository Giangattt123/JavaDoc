/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh1;


import java.util.Scanner;





public class Main {

    //tren 1 dong
    public static void main(String[] args) {
        //System out
        //String ten="TO an An";
        //System.out.println("Hello PTIT.");
//        int x=21;
//        System.out.printf("Tuoi:%d\n", x);
//         char c='d';
//         c=65;//A
//         System.out.printf("ky tu:%c\n",c);
//         int a=5;
//         short st=(short)a;
//         boolean gt=true;
//         System.out.println("gioi tinh:"+(gt?"Nam":"Nu"));
//         float x=(float)1.5;
//         long vv=56;
//         
//         String ten="Lan";
//         System.out.println(ten instanceof String);//true
//           double diem=5;
//           //if
//           //1
//             if(diem<0 || diem>10){
//                 System.out.println("khog phai diem");
//             }
//           //2
//              if(diem>=5){
//                  System.out.println("dat");
//              }else{
//                  System.out.println("tach");
//              }
//           //3  step if
//              if(diem<5){
//                  System.out.println("yeu");
//              }else if(diem<6.5){
//                       System.out.println("trung binh");
//                    }else if(diem<8){
//                             System.out.println("kha");
//                          }else{
//                        System.out.println("gioi");
//                    }
//           
//           //4 nested if
//           boolean ut=true;
//           if(diem<5){
//               if(ut && diem>4){
//                   System.out.println("trung binh");
//               }
//           }
//           int chon=1;//int, char,byte,short,String
//           switch(chon){
//               case 1->System.out.println("chon 1");
//               case 2,3,4->
//                   System.out.println("thuc hen cai gi day");
//               case 7->{
//                   //thuc hien nhieu
//               }
//               default->System.out.println("co the co hoac khong");
//           }
//        String[] ds = {"To an an", "Vu tuan tu", "Le thi lan"};
//        for (int i = 0; i < ds.length; i++) {
//            System.out.println(i + ":" + ds[i]);
//        }
//        System.out.println("-----------------------");
//        for(String i:ds){
//            System.out.println(i);
//        }
//          String s1="Ha";
//          String s2="Ha";
//          String s3=new String("Ha");
//          System.out.println(s1==s2);//true
//          System.out.println(s1==s3);//false

//       Scanner sc=new Scanner(System.in);
//        System.out.println("nhap du lieu");
//        int x=Integer.parseInt(sc.nextLine());
//        double a=Double.parseDouble(sc.nextLine());
//        boolean gt=sc.nextBoolean();
//        sc.nextLine();//nhan enter
//        String ma=sc.nextLine();
//        System.out.println("cac gi tri:"+x+","+a+","+gt+","+ma);
          MonHoc mh=new MonHoc();//default
          MonHoc mh1=new MonHoc("INT33333");
          MonHoc mh2=new MonHoc("INT8888","LT HDT", 3, false);
          mh.setMa("INT9999");
          System.out.println(mh);
          System.out.println(mh1);
          System.out.println(mh2);
          

    }
}

