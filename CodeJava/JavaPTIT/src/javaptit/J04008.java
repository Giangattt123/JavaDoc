/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

class Point {

    double x;
    double y;

    public Point() {
        this(0f, 0f);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public double distance(Point other) {
        return sqrt(pow(this.x - other.x, 2) + pow(this.y - other.y, 2));
    }
    

    @Override
    public String toString() {
        return x + " " + y;
    }
}

public class J04008 {

    public static void main(String[] args) {
        Scanner  sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point [] p = new Point[3];
            for (int  i = 0 ; i < p.length ; i++)  {
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                p[i] = new Point(x , y);
            }
            double c1 = p[0].distance(p[1]);
            double c2 = p[1].distance(p[2]);
            double c3 = p[2].distance(p[0]);
            if (c1 + c2 > c3 && c2 + c3 > c1 && c3 + c1 > c2) {
                System.out.println(String.format("%.3f", c1 + c2 + c3));
            } else System.out.println("INVALID");
        }
    }
}
