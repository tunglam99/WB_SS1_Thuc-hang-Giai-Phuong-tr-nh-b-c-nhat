import java.util.Scanner;

public class GiaiPTBacNhat {
    public static void main(String[] args) {
        System.out.println("Giai phuong trinh bac nhat");
        System.out.println("dua vao 1 phuong trinh dang a*x+b = c, nhap vao cac hang so");
        Scanner scanner = new Scanner(System.in);
        double a,b;
        System.out.println("nhap a:");
        a = scanner.nextDouble();
        System.out.println("nhap b:");
        b = scanner.nextDouble();

        if (a!=0) {
            double answer = -b/a;
            System.out.printf("ket qua gai phuong trinh la: %f!\n",answer);
        } else {
            if (b==0) {
                System.out.print("phuong trinh vo so nghiem");
            } else {
                System.out.print("phuong trinh vo nghie,");
            }
        }
    }
}
