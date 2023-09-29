package BaiTap1;

import java.util.ArrayList;
import java.util.Collections;

public class classesB1 {

    public int sumSequence(int n) {
        return n * (n + 1) / 2;
    }

    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public int tongChan(int n) {
        int sumChan = 0;
        for (int i = 2; i <= n; i += 2) {
            sumChan += i;
        }
        return sumChan;
    }

    public int tongLe(int n) {
        int sumLe = 0;
        for (int i = 1; i <= n; i += 2) {
            sumLe += i;
        }
        return sumLe;
    }

    public boolean[] sieveNguyenTo(int n) {
        boolean[] isPrime = new boolean[n + 1];
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (isPrime[i] == true) {
                for (int j = i * i; j <= n; j++) {
                    isPrime[i] = false;
                }
            }
        }
        return isPrime;
    }

    public static int[] fibonacci(int n) {
        int[] F = new int[92];
        F[0] = 0;
        if (n > 1) {
            F[1] = 1;
            for (int i = 2; i < 92; i++) {
                F[i] = F[i - 1] + F[i - 2];
            }
        }
        return F;
    }

    public static int sumDigit(int n) {
        int sumDigit = 0;
        while (n != 0) {
            sumDigit += n % 10;
            n /= 10;
        }
        return sumDigit;
    }

    public static ArrayList<Integer> devisor(int n) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i  =  1 ; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                numbers.add(i);
                if (n % i != i) {
                    numbers.add(n / i);
                }
            }
        }
        Collections.sort(numbers);
        return numbers;
    }
}
