class Car{
    String color;
    String model;
    Car(){
    }
    public void setDetails(String carcolor,String carmodel){
        color=carcolor;
        model=carmodel;
    }
    public void printDisplay(){
        System.out.println("Car Color is: "+color);
        System.out.println("Car Model is: "+model);
    }
}
public class Main {
    public static void main(String[] args) {
        Car mycar=new Car();
        mycar.setDetails("red","BMW");
        mycar.printDisplay();


    }

}
