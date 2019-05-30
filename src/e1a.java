import java.util.*;
public class e1a {
    public static void main(String[] args){
        double dC,dF;
        Scanner sin = new Scanner(System.in);
        System.out.println("What is the degrees celsius?");
        dC = sin.nextDouble();
        dF = CtoF(dC);
        System.out.print("Centigrade = "+dC+" Fahrenheit = "+dF);
    }


    public static double CtoF(double dCent){
        double dFahr;
        dFahr = (dCent*9)/5 +32;
        return dFahr;
    }
}