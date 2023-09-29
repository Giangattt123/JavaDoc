
package javaptit;

import java.util.Arrays;
import java.util.Scanner;
public class J08015 {
    public static long firstPos(long []a , int l , int r , int x) {
        int res = -1;
	while(l <= r){
            int m = (l + r)/2;
            if(a[m] == x){
                res = m;
                r = m - 1;
            }
            else if(a[m] > x) r = m - 1;
            else l = m + 1;
	}
	return res;
    }
    
    public static long lastPos(long []a , int l , int r , int x) {
        int res = -1;
	while(l <= r){
            int m = (l + r)/2;
            if(a[m] == x){
                res = m;
                l = m + 1;
            }
            else if(a[m] > x) r = m - 1;
            else l = m + 1;
	}
	return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            long count = 0;
            for (int j = 0; j < n - 1; j++) {
                long l = firstPos(a, j + 1, n - 1, (int) (k - a[j]));
                long r = lastPos(a, j + 1, n - 1, (int) (k - a[j]));
                if (l != -1) {
                    count += r - l + 1;
                }
            }
            System.out.println(count);
        }
    }
}
