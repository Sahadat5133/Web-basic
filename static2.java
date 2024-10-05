class employee1{
    static String company_name="SRBD";

    public void printDisplay(){
        System.out.println(company_name);
    }
}

public class static2 {
    public static void main(String[] args) {
        employee1 e1=new employee1();
        e1.printDisplay();
    }
}
