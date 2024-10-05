class staticMethod{
    static int x=10;
    public void display1(){
        display2();
        System.out.println("I am non static method");
    }
    public static void display2(){
        System.out.println(" "+x);
        System.out.println("I am static method");
    }
}


public class Static5 {
    public static void main(String[] args) {
        staticMethod ob1=new staticMethod();
        ob1.display1();
        staticMethod.display2();
    }
}
