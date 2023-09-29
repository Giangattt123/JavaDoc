package javaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07001 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            while (sc.hasNext()) {   
                System.out.println(sc.nextLine());
            }
            sc.close(); 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
