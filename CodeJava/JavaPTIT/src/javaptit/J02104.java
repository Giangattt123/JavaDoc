/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class J02104 {
    class Edge {
        int dinhDau , dinhCuoi;
        public Edge(int dinhDau , int dinhCuoi) {
            this.dinhDau = dinhDau;
            this.dinhCuoi = dinhCuoi;
        }
    }
    private List<Edge> solve(int [][]a , int n) {
        List<Edge> lists = new ArrayList<>();
        for (int i = 0 ; i < n ; i++) {      
            for (int j = i + 1 ; j < n ; j++) {
                if (a[i][j] == 1) {
                    Edge list = new Edge(i + 1, j + 1);
                    lists.add(list);
                }
            }
        }
        return lists;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]a = new int [n][n];
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        J02104 nonStatic = new J02104();
        List<Edge> dscanh = nonStatic.solve(a , n);
        for (Edge canh : dscanh) {
            System.out.println("(" + canh.dinhDau + "," + canh.dinhCuoi + ")");
        }
    }
}
