import java.sql.SQLOutput;
import java .util.*;
    class Rectangle {
    double length;
    double breath;

     Rectangle(double l, double b) {
        length = l;
        breath = b;

    }
        public double calculateAreas()
    {

            return length*breath;
        }

    }

     class Triangle{

    double base;
    double hieght;

    Triangle(double b,double h)
    {
        base = b;
        hieght=h;
    }

    double calculateAreas()
    {
        return base*hieght;
    }

    }

    public class Main {
        static void calculateArea(Rectangle rect, Triangle tri)
        {
            double rectArea = rect.calculateAreas();
            double triArea = tri.calculateAreas();
            System.out.println("Area of Rectangle"+rectArea);
            System.out.println("Area of Triangle"+triArea);


        }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Length of Rectangle");
            double length = sc.nextInt();
            System.out.println("Enter the Breath of Rectangle");
            double breath= sc.nextInt();

            System.out.println("Enter the Base of Triangle");
            double base = sc.nextInt();
            System.out.println("Enter the hieght of Triangle");
            double hieght = sc.nextInt();
            Rectangle rectangle = new Rectangle(length,breath );
            Triangle triangle = new Triangle(base,hieght);

            calculateArea(rectangle,triangle);





        }

    }



