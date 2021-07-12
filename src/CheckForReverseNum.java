import java.util.Scanner;

public class CheckForReverseNum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number want to reverse");
        int Number=s.nextInt();
        int remainder, reverse=0;

        while(Number!=0){           //check till true
            remainder=(Number%10); //remainder last digit
            reverse=reverse*10 + remainder;
            Number=Number/10;

        }
        System.out.println("Reverse of "+ reverse);
    }
}
