
public class obj_count {
    static int counter=0;
    public obj_count(){
        counter++;
    }
    public static int getObjCounter(){
        return counter;
    }

    public static void main(String[] args) {
        obj_count obj1=new obj_count();
        obj_count obj2=new obj_count();
        obj_count obj3=new obj_count();
        System.out.println("number of obj created:"+obj_count.getObjCounter());
    }
}
