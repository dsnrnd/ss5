import java.util.*;
public class e2d {
    public static void main(String[] args){
        double dW,dH,dBmi;
        Scanner sin = new Scanner(System.in);
        System.out.println("Whats your weight");
        dW = sin.nextDouble();
        System.out.println("heigth");
        dH = sin.nextDouble();
        dBmi = bmi(dW,dH);

        if(dBmi < 18.5){
            System.out.println("You skinny");
            System.out.println(dBmi);
        }
        else if(dBmi >= 18.5 && dBmi <= 24.9){
            System.out.println("You normal");
            System.out.println(dBmi);
        }
        else if(dBmi >= 25 && dBmi <= 29.9){
            System.out.println("fatfat");
            System.out.println(dBmi);
        }
        else{
            System.out.println("BIGGG");
            System.out.println(dBmi);
        }
    }
    public static double bmi(double dWeight,double dHeight){
        double dbmi;
        dbmi = dWeight*703/(Math.pow(dHeight,2));
        dbmi = Math.round(dbmi*100)/100;
        return dbmi;
    }
}
