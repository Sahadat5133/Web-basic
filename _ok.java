class man{
    static int x=0;
    man(){
        x++;
    }
    public void getprint(){
        System.out.println("Man no: "+x);
    }
}
public class _ok {
    public static void main(String[] args) {
        man m1=new man();
        m1.getprint();
        man m2=new man();
        m2.getprint();
        man m3=new man();
        m3.getprint();
    }

}
