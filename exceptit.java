import java.util.*;
class InvalidNameException extends Exception
{
    String n;
    InvalidNameException(String Name)
    {n=Name;
    }
    public String toString()
    {return "Name is not GEHU : "+n;
    }
}
public class exceptit
{
    public static void main(String []a)
    {
        String n;
        Scanner sc=new Scanner(System.in);
        try
        {System.out.print("Enter the String: ");
         n=sc.nextLine();
         if(n.equalsIgnoreCase("GEHU"))
         {InvalidNameException l=new InvalidNameException(n);
          sc.close();  
          throw l;  
         }
         else System.out.println("Name is Gehu");
        }
        catch(InvalidNameException e)
        {System.out.println(e);}
        finally{System.out.println("End of Exception");}
        System.out.println("End of Program");
    }
}
