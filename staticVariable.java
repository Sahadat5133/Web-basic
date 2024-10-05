class employee{
    int age;
    double salary;
    static String company="Multinational";
    employee(int age,double salary){
        this.age=age;
        this.salary=salary;
    }
    public void getdisplay(){
        System.out.println(age+" "+salary+" "+company);
    }
}



public class staticVariable {
    public static void main(String[] args) {
        employee e1=new employee(24,30000.70);
        employee e2=new employee(25,30000.89);
        e1.getdisplay();
        e2.getdisplay();
    }
}
