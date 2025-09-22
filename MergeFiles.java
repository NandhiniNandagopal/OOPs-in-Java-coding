import java.io.*;
import java.io.FileWriter;
public class MergeFiles{
   public static void main(String[] args){
      String file1="happy";
      String file2="happy.txt";
      String mergedFile="merged.txt";
      try{
         FileWriter writer=new FileWriter(mergedFile,false);
         BufferedReader br1=new BufferedReader(new FileReader(file1));
         String line;
         while((line=br1.readLine())!=null){
            writer.write(line+"\n");
         }
         br1.close();
         BufferedReader br2=new BufferedReader(new FileReader(file2));
         while((line=br2.readLine())!=null){
            writer.write(line+"\n");
         }
         br2.close();
         writer.close();
         System.out.println("Files merged successfully into "+mergedFile);
      }catch(IOException e){
         System.out.println("Error:"+e.getMessage());
      }
   }
}
      
