import java.util.*;

public class Area_methodOveriding {

    public double area(int side){
        return side*side;
    }
    public double area (int length,int breath){
        return length*breath;
    }
    public double area (double r)
    {
        return 3.14*r*r;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the sides of square ");
        int side = sc.nextInt();
        Area_methodOveriding amo=new Area_methodOveriding();
        double result1 =amo.area(side);
        System.out.println("area of square:"+result1);

        System.out.println("enter the length of rectangle ");
        int length = sc.nextInt();
        System.out.println("enter the breath of rectangle ");
        int breath = sc.nextInt();
        double result2 =amo.area(length,breath);
        System.out.println("area of square:"+result2);

        System.out.println("enter the radius of circle ");
        double r = sc.nextDouble();
        double result3=amo.area(r);
        System.out.println("area of circle"+result3);







    }

}
