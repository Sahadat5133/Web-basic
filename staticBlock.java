public class staticBlock  {
    static int age;
   static String name;
    static{
        age=24;
        name="Sahadat";
    }
    public static
    void getDisplay(){
        System.out.println(age);
        System.out.println(name);
    }

    public static void main(String[] args) {
        staticBlock.getDisplay();
    }
}
