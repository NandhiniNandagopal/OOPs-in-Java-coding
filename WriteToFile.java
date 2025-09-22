import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class WriteToFile{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the filename to save your text:");
      String filename=sc.nextLine();
      try{
         FileWriter writer=new FileWriter(filename);
         System.out.println("Enter text (type 'STOP' on a new line to finish):");
         while(true){
            String line=sc.nextLine();
            if(line.equalsIgnoreCase("STOP")){
               break;
            }
            writer.write(line+"\n");
         }
         writer.close();
         System.out.println("your input has been written to"+filename);
      }catch(IOException e){
         System.out.println("An error occured:"+e.getMessage());
      }
      sc.close();
   }
}
