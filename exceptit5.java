import java.util.*;
class InvalidNameException extends Exception
{
    String n;
    InvalidNameException(String Name)
    {n=Name;
    }
    public String toString()
    {return "Name is not Jai Hind : "+n;
    }
}
public class exceptit5
{
    public static void main(String []a)
    {
        String n;
        Scanner sc=new Scanner(System.in);
        try
        {System.out.print("Enter the String: ");
         n=sc.nextLine();
         if(n.equalsIgnoreCase("jai hind"))
         {
            System.out.println("Name is "+n);  
         }
         else 
         {
         InvalidNameException l=new InvalidNameException(n);
          sc.close();  
          throw l;
         
         }
        }
        catch(InvalidNameException e)
        {System.out.println(e);}
        finally{System.out.println("End of Exception");}
        System.out.println("End of Program");
    }
}
