/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap1;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class classesB5 {
    public static int sumArr(int []a) {
        int sum = 0;
        for (int i = 0 ; i < a.length ; i++) {
            sum += a[i];
        }
        return sum;
    }
    public static void MinMax(int []a , int n) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
         for (int i = 0 ; i < n ; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max + " "  + min);
    }
    public static ArrayList<Integer> Position(int []a) {
        ArrayList<Integer> arr = new ArrayList<>();
        int maxIndex = 0;
        int secondMaxIndex = -1;
        int minIndex = 0;
        int secondMinIndex = -1;
        for (int i = 1 ; i < a.length ; i++) {
            if (a[i] > a[maxIndex]) {
                secondMaxIndex = maxIndex;
                maxIndex = i;
            } else if (secondMaxIndex == -1 || a[i] > a[secondMaxIndex]) {
                secondMaxIndex = i;
            }

            if (a[i] < a[minIndex]) {
                secondMinIndex = minIndex;
                minIndex = i;
            } else if (secondMinIndex == -1 || a[i] < a[secondMinIndex]) {
                secondMinIndex = i;
            }
        }
        arr.add(maxIndex);
        arr.add(minIndex);
        arr.add(secondMaxIndex);
        arr.add(secondMinIndex);
        return arr;
    }
    public static void main(String[] args) {
        int [] a = {1 , 2 , 3 , 4 , 5 , 6};
        MinMax(a , a.length);
    }
}
