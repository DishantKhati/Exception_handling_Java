import java.util.*;
class NegativeAgeException extends Exception
{
    int age;
    NegativeAgeException(int a)
    {
        age=a;
    }
    public String toString()
    {
     return "Negative age found";
    }
}
public class except4
{
    public static void main(String []ar)
    {
        int a;
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.println("Enter your age: ");
            a=sc.nextInt();
            if(a<0){NegativeAgeException n=new NegativeAgeException(a);
                sc.close();
                throw n;}
            else System.out.println("Age entered is "+a);
        }
        catch(NegativeAgeException e)
        {System.out.println(e);}
        finally{System.out.println("End of Exception");}
        System.out.println("End of Program");
    }
}
