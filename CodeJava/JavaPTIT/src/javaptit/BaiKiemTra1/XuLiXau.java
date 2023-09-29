
package javaptit.BaiKiemTra1;

import java.util.StringTokenizer;

/**
 *
 * @author DucGiang
 */
public class XuLiXau {
    private String s;

    public XuLiXau() {
    }
    public XuLiXau(String s) {
        this.s = s;
    }
    public int soCau() {
        StringTokenizer stn = new StringTokenizer(s , ".?!");
        int dem = 0;
        while (stn.hasMoreTokens()){
            stn.nextElement();
            dem++;
        }
        return dem;
    }
    public void chuanHoa() {
        s = s.trim();
        String [] str = s.split("\\s+");
        String sNew = "";
        for (int i = 0 ; i < str.length ; i++) {
            if (str[i] == "." || str[i] == "?" || str[i] == "!")
                sNew += str[i];
            else sNew += str[i] + " ";
        }
    }
    @Override
    public String toString() {
        return s;
    }
}
