import java.util.Scanner;

public class JavaProgram
{
   public static void main(String args[])
   {
       String strOrig, strNew;
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Enter a String : ");
       strOrig = scan.nextLine();
       
       System.out.print("Removing Vowels from The String [" +strOrig+ "]\n");
       strNew = strOrig.replaceAll("[aeiouAEIOU]", "");
              System.out.print(strNew);
   }
}