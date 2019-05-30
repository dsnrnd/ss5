import java.util.*;
public class e1b {
    public static void main(String[] args){
        double dMark,dMark2,dMark3,dMark4;
        double dAvg;
        Scanner sin = new Scanner(System.in);
        System.out.println("What are your four marks");
        dMark = sin.nextInt();
        dMark2 = sin.nextInt();
        dMark3 = sin.nextInt();
        dMark4 = sin.nextInt();
        dAvg = average(dMark,dMark2,dMark3,dMark4);
        System.out.println(dAvg);
    }

    public static double average(double dM1,double dM2,double dM3,double dM4){
        double dSum, dAver;
        dSum = dM1 + dM2 + dM3 +dM4;
        dAver = dSum/4;
        return dAver;
    }
}
