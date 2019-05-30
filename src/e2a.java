import java.util.*;
public class e2a {
    public static void main(String[] args){
        double dT,dCt;
        String sChoice;

        Scanner sin = new Scanner(System.in);
        System.out.println("Do you want to convert to Centigrade or Fahrenheit");
        sChoice = sin.next();
        System.out.println("What is the temperature");
        dT = sin.nextInt();
        dCt = 0;
        if(sChoice.equalsIgnoreCase("centigrade")){
            dCt = CtoF(dT);
        }
        else if(sChoice.equalsIgnoreCase("fahrenheit")){
            dCt = FtoC(dT);
        }
        System.out.println(dCt);
    }

    public static double CtoF(double dTemp){
        double dF;
        dF = (dTemp*9/5)+32;
        return dF;
    }
    public static double FtoC(double dTemp){
        double dC;
        dC = (dTemp - 32)*5/9;
        return dC;
    }
}
