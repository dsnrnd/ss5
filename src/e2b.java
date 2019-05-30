import java.util.*;
public class e2b {
    public static void main(String[] args){
        int nNum1,nNum2,nlcm;
        Scanner sin = new Scanner(System.in);
        System.out.println("what is first umba");
        nNum1 = sin.nextInt();
        System.out.println("Wnotah");
        nNum2 = sin.nextInt();
        nlcm = lcm(nNum1,nNum2);
        System.out.println(nlcm);
    }

    public static int lcm(int nN1, int nN2){
        int nF,nM1,nM2,nLcm,nLcm2;
        nF = 2;
        while(nN1%nF != 0 && nN2%nF != 0){
            nF ++;
        }
        nM1 = nN1/nF;
        nM2 = nN2/nF;
        nLcm = nN1*nM2;
        nLcm2 = nN2*nM1;
        if(nLcm == nLcm2) {
            System.out.println("is good");
        }
        return nLcm;
    }
}
