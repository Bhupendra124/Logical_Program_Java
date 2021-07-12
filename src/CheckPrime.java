import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number  ");
        int num=s.nextInt();
        int temp=0; // to terminate loop

        for (int i=2; i<num; i++) {
            if (num % i == 0)
                temp = temp + 1;
        }if (temp>0) {
            System.out.println("NOT PRIME : " +num);
        }else System.out.println("PRIME NUMBER :" +num);
        }

    }

