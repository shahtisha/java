import java.util.*;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter employee name:");
        String empName = sc.nextLine();
        System.out.println("enter employee no:");
        int empNo = sc.nextInt();
        System.out.println("enter basic salary:");
        int basic = sc.nextInt();

        double da = 0.7 * basic;
        double hra = 0.3 * basic;
        double pf = 0.1 * basic;
        double cca = 240;
        double pt = 100;

        double gross = basic + da + hra + cca;
        double net = gross - pf - pt;
        
        System.out.println("DA is " + da);
        System.out.println("HRA is " + hra);
        System.out.println("PF is " + pf);
        System.out.println("gross salary is " + gross);
        System.out.println("net salary is " + net);
    }
}
