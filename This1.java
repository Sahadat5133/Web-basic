class student1{
    int roll;
    String name;
    float fee;

    student1(int roll,String name,float fee){
        this.roll=roll;
        this.name=name;
       this.fee=fee;
    }
    public void display(){
        System.out.println(roll+" "+name+" "+fee);
    }
}



public class This1 {
    public static void main(String[] args) {
        student1 s1=new student1(5133,"Sahadat",13600);
        student1 s2=new student1(5144,"Hridoy",14000);
        s1.display();
        s2.display();
    }
}
