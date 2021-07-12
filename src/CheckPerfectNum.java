import java.util.Scanner;

public class CheckPerfectNum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        int i,sum=0;

        for (i=1; i<number; i++)
        {
            if(number%i==0)
                sum =sum+i;
        }if(sum==number)
            System.out.println("Perfect number "+number);
        else
            System.out.println("NOT Perfect number "+number);
    }
}
