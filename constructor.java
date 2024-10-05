class Second{
    int id;
    String name;
    int roll;

    Second(int i,String n){
        id=i;
        name=n;
    }
    Second(int i,String n,int r){
        id=i;
        name=n;
        roll=r;
    }
    public void getOverloading(){
        //System.out.println(id+" "+name);
        System.out.println(id+" "+name+" "+roll);
    }
}
public class constructor {
    public static void main(String[] args) {
        Second s1=new Second(5133,"Sahadat");
        Second s2=new Second(5144,"Hridoy",55);
        //s1.getOverloading();
        s2.getOverloading();
    }
}
