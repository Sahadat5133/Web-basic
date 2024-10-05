class Person{
    String name;
    int age;
    static String universityName="Su";

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void print(){
        System.out.println(name+" "+age+" "+" "+universityName);
    }
}

public class Three {
    public static void main(String[] args) {
        Person p1=new Person("Sahadat",24);
        Person p2=new Person("Hridoy",23);
        p1.print();
        p2.print();
    }
}
