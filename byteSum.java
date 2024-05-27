
import java.util.Scanner;

public class byteSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of byte1:");
        byte byte1= sc.nextByte();
        System.out.println("enter the value of byte2:");
        byte byte2= sc.nextByte();
        int int1=(int)byte1;
        int int2=(int)byte2;
        int sum = int1+int2;
        System.out.println("addition:"+sum);



    }
}
