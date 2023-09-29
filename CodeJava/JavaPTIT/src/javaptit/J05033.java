/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Time{
    int gio , phut , giay;

    public Time(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }
    // Comparator sortTime
    public static Comparator<Time> timeComparator = new Comparator<Time>() {
        public int compare(Time t1 , Time t2) {
            if (t1.gio != t2.gio) {
                return Integer.compare(t1.gio, t2.gio);
            }
            if (t1.phut != t2.phut) {
                return Integer.compare(t1.phut, t2.phut);
            }
            return Integer.compare(t1.giay, t2.giay);
        }
    };

    public Time() {
    }
    
    @Override
    public String toString() {
        return gio + " " + phut + " " + giay;
    }
}
public class J05033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> times = new ArrayList<>();
        for (int i = 0 ; i < n ; i++) {
            int gio = sc.nextInt();
            int phut = sc.nextInt();
            int giay = sc.nextInt();
            Time time = new Time(gio, phut, giay);
            times.add(time);
        }
        Collections.sort(times, Time.timeComparator);
        for (Time time : times) {
            System.out.println(time);
        }
    }
}
