
package javaptit;

import java.util.ArrayList;
import java.util.Scanner;
import view.InvoiceView;
import vn.edu.ptit.Invoice;
import vn.edu.ptit.Rule;
import vn.edu.ptit.Student;
import vn.edu.ptit.Subject;


public class PaymentController {
    private Invoice invoice;
    private Rule rule;
    private Student student;
    private Subject subject;
    public Invoice getInvoice() {
        return invoice;
    }
    public PaymentController() {
        Scanner sc = new Scanner(System.in);
        String msv = sc.nextLine();
        String name = sc.nextLine();
        int soMonHoc = sc.nextInt();
        sc.nextLine();
        String maHocPhan , tenHocPhan;
        int soTinChi;
        student = new Student(msv , name);
        double tongHocPhi = 0;
        ArrayList<Subject> arrSub = new ArrayList<>();
        while (soMonHoc-- > 0) {
            maHocPhan = sc.nextLine();
            tenHocPhan = sc.nextLine();
            soTinChi = Integer.parseInt(sc.nextLine());
            subject = new Subject(tenHocPhan , maHocPhan , soTinChi);
            arrSub.add(subject);
        }
        String soQD = sc.nextLine();
        String tenQD = sc.nextLine();
        double donGia = Double.parseDouble(sc.nextLine());
        for (Subject sub : arrSub)
            tongHocPhi += donGia * sub.getCredit();
        rule = new Rule(soQD , tenQD , tongHocPhi);
        invoice = new Invoice(rule);
        invoice.setAlSubject(arrSub);
        invoice.setAmount(tongHocPhi);
        invoice.setSt(student);
    }
    public static void main(String[] args) {
        PaymentController pc = new PaymentController();
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }
}
