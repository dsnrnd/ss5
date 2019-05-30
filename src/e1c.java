import java.util.*;
public class e1c {
    public static void main(String[] args){
        int nNum,nNum2,nDiff;
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter a number");
        nNum = sin.nextInt();
        System.out.println("Enter another number");
        nNum2 = sin.nextInt();
        nDiff = diff(nNum,nNum2);
        System.out.println(nDiff);
    }

    public static int diff(int nN1,int nN2){
        int nD;
        nD = nN1 - nN2;
        if(nD < 0){
            nD = nD+(nD*2);
        }
        return nD;
    }
}
