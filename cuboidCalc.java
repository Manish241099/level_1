import java .util.*;
public class cuboidCalc {
    double length;
    double breath;
    double height;

    public cuboidCalc( double length,double breath,double height)

    {
        this.length=length;
        this.breath=breath;
        this.height=height;
    }
    public double Area(){

        double area = 2*(length * breath + breath * height + height * length);
        System.out.println("area of cuboid"+area);
        return area;
    }

    public double volumn ()
    {
        Area();
        double volumn = length*breath*height;
        System.out.println("volumn of cuboid" +volumn);
        return volumn;
    }

    public double perimeter(){
        volumn();
        double perimeter=4*(length*breath*height);
        System.out.println("perimeter of cuboid"+perimeter);
        return perimeter;
        }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the length");
        double length = sc.nextInt();
        System.out.println("enter the breath");
        double breath = sc.nextInt();
        System.out.println("enter the height");
        double height = sc.nextInt();
        cuboidCalc cub = new cuboidCalc(length,breath,height);
        cub.perimeter();


    }
    }




