//Dawson Randell
import java.util.*;
public class Test5 {
    public static void main(String[] args){
        double dA,dB,dC,dX,dY;
        Scanner sin = new Scanner(System.in);
        System.out.println("What is the value for a?");
        dA = sin.nextDouble();
        System.out.println("What is the value for b?");
        dB = sin.nextDouble();
        System.out.println("What is the value for c?");
        dC = sin.nextDouble();
        System.out.println("  X | Y ");

        for(dX=0;dX<=10;dX++){
            dY = quad(dA,dB,dC,dX);
            System.out.println(dX+" | "+dY);
        }
    }
    public static double quad(double dA,double dB,double dC,double dX){
        double dY;
        dY = (dA*Math.pow(dX,2))+(dB*dX)+dC;
        return dY;
    }
}
