class pupil1 {
    String name;
    int roll;
    int age;

    pupil1(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    pupil1(String name, int roll, int age) {
        this.name = name;
        this.roll = roll;
        this.age = age;
    }
    public void getdisplay1(){
        System.out.println(name+" "+roll+" "+age+" ");
    }
}
public class nice {
    public static void main(String[] args) {
        pupil1 p1=new pupil1("Sahadat",5133);
        pupil1 p2=new pupil1("Hridoy",5144,24);
        p1.getdisplay1();
        p2.getdisplay1();
    }
}

