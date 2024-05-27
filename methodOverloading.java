import java.util.Scanner;

public class methodOverloading {
    public int sum (int a,int b,int c)
    {
        return a+b+c;

    }
    public int sum(int a ,int b){
        return a+b;
    }
    public int sum (int a, int b, int c, int d)
    {
        return a+b+c+d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();
        System.out.println("enter the value of c");
        int c = sc.nextInt();
        System.out.println("enter the value of d");
        int d = sc.nextInt();
        methodOverloading mo =new methodOverloading();
        int result1=mo.sum(a,b);
        System.out.println("sum of a and b:"+result1);
        int result2=mo.sum(a,b,c);
        System.out.println("sum of a and b and c:"+result2);
        int result3=mo.sum(a,b,c,d);
        System.out.println("sum of a and b and c and d:"+result3);


    }
}
