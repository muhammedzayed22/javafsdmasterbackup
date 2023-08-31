package interfacesdemo;
interface Father
{
    void disp();
}
interface Mother
{
    void show();
}
class Son implements Father,Mother
{
    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.println("a");
    }
    @Override
    public void disp() {
        // TODO Auto-generated method stub
    }    
} 
public class MultipleInheritance1 {
    public static void main(String args[])
    {
        Son s1 = new Son();
        s1.show();
    }
}