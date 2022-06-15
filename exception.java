/* public class Main
{
    public static void main (String[] args) 
    {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);                               
        String name="";
        //String name=new String("");
        int n=Integer.parseInt(br.readline())
        float n=Float.parseFloat(br.readline())
        long n=Long.parseLong(br.readline())
        double n=Double.parseDouble(br.readline())
        short n=Short.parseShort(br.readline())
        byte n=Byte.parseByte(br.readline())
    }
}   
*/
import java.io.*;
import java.lang.System;
class Employee
{
    public static void main (String[] args)throws 
    IOException 
    {InputStreamReader r=new InputStreamReader(System.in);
     BufferedReader br=new BufferedReader(r);                              
     System.out.println("Enter id: ");
     int id=Integer.parseInt(System.in);
     System.out.println("Enter Gender(M/F): ");
     char gender = (char)br.readline();
     br.skip(2);  //char gender=br.readline().charAt(0);
     System.out.println("Enter name: ");
     String name=br.readline();
     System.out.println("id: "+id+"\nGender: "+gender+"\nName: "+name);
    }
}
