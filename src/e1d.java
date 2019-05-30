import java.util.*;
public class e1d {
    public static void main(String[] args) {
        int nNum1, nNum2, nDen1, nDen2, nDiffN, nDiffD, nNumf, nDenf;
        Scanner sin = new Scanner(System.in);
        System.out.println("First Numerator");
        nNum1 = sin.nextInt();
        System.out.println("First Denominator");
        nDen1 = sin.nextInt();
        System.out.println("Second Numerator");
        nNum2 = sin.nextInt();
        System.out.println("Second Denominator");
        nDen2 = sin.nextInt();

        nNumf = addN(nNum1, nNum2, nDen1, nDen2);
        nDenf = addD(nDen1, nDen2);
        lowestfrac(nNumf,nDenf);
    }

    public static int addN(int nN1, int nN2, int nD1, int nD2) {
        int nNf;

        nNf = (nN1 * nD2) + (nN2 * nD1);
        return nNf;
    }

    public static int addD(int nD1, int nD2) {
        int nDf;

        nDf = nD1 * nD2;
        return nDf;
    }
    public static void lowestfrac(int nN1, int nD1) {
        int nNf, nDf, nVar;
        nVar = 2;

        while (nN1 % nVar != 0 || nD1 % nVar != 0) {
            nVar++;
        }
        nNf = nN1 / nVar;
        nDf = nD1 / nVar;
        System.out.println(nNf+" / "+nDf);

    }

}
