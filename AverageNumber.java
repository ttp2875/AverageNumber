import java.util.Scanner;
public class AverageNumber {
    public static void main(String [] args) {


        Scanner keyboardNumber = new Scanner(System.in);
        System.out.println("Enter the numbers that you want to get an average from ");

        int n1= keyboardNumber.nextInt();
        int n2= keyboardNumber.nextInt();
        int n3= keyboardNumber.nextInt();
        int n4= keyboardNumber.nextInt();
        int n5= keyboardNumber.nextInt();
        int n6= keyboardNumber.nextInt();
        int n7= keyboardNumber.nextInt();
        int n8= keyboardNumber.nextInt();
        int n9= keyboardNumber.nextInt();
        int n10= keyboardNumber.nextInt();

        int sum = (n1+n2+n3+n4+n5+n6+n7+n8+n9+n10);
        int average = sum/10;

        System.out.println("You entered: " + n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6 + " " + n7 + " " + n8 + " " + n9 + " " + n10);
        System.out.println("The average number is " + average);

    }
}


