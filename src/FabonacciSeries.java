// Next num is the sum of Previous two number
public class FabonacciSeries {
    public static void main(String[] args) {
        int num1=0,num2=1,num3, i ;
        int count=10;
        System.out.println(num1+""+num2); // Printing 0 & 1

        for (i=2; i<count;i++)
        {
            num3=num1+num2;
            System.out.println(" forwarded "+num3);
            num1=num2;
            num2=num3;
        }

    }
}
