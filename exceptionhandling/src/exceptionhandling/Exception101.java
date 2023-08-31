package exceptionhandling;
import java.nio.InvalidMarkException;
public class Exception101 {
    static void add(int a,int b)
    {
        System.out.println(a/b);
    }
    public static void main(String args[])
    {            
        int a1[] = new int[6];
        try
        {  
        	a1[7] = 67/0;
            //add(9,3);
        }
        catch(ArithmeticException e)
        {            
            System.out.println(e);
            a1[7] = 67/2;
        }
        catch(InvalidMarkException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("error handled");
        }
    }
}