class person{
    String name;
    int age;

    person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void getDisplay(){
        System.out.println("The name of this person is: "+ name);
        System.out.println("The age of this person is: "+age);
    }
    public void checkAge(){
        if(this.age>18){
            System.out.println("The person age is above 18");
        }
        else{
            System.out.println("The person age is not 18");
        }
    }
}


public class one {
    public static void main(String[] args) {
        person p1=new person("Sahadat",24);
        person p2=new person("Hridoy",23);
        p1.getDisplay();
        p1.checkAge();
        p2.getDisplay();
        p2.checkAge();
    }
}
