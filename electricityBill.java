import java.util.Scanner;
class electricityBill{
    public static void main(String args[]){
        Scanner g=new Scanner(System.in);
        System.out.print("Enter your consumer number:");
        int id=g.nextInt();
        g.nextLine();
        System.out.print("Enter your consumer name:");
        String name=g.nextLine();
        System.out.print("Enter previous month reading:");
        int prevreading=g.nextInt();
        System.out.print("Enter current month reading:");
        int currreading=g.nextInt();
        System.out.print("Enter your type of EB connection (1.domestic/2.commercial):");
        int choice=g.nextInt();
        int unit=currreading-prevreading;
        double amount=0;
        if(choice==1){
          if(unit<=100){
            amount=unit*1;
           }
          else if(unit>=101 && unit<=200){
            amount=100*1+(unit-100)*2.5;
            }
          else if(unit>=201 && unit<=500){
            amount=100*1+100*2.5+(unit-200)*4;
            }
          else{
            amount=100*1+100*2.5+300*4+(unit-500)*6;
            }
        }
        else if(choice==2){
          if(unit<=100){
            amount=unit*2;
            }
          else if(unit>=101 && unit<=200){
            amount=100*2+(unit-100)*4.5;
            }
          else if(unit>=201 && unit<=500){
            amount=100*2+100*4.5+(unit-200)*6;
            }
          else{
            amount=100*2+100*4.5+300*6+(unit-500)*7;
            }
        }
        else{
             System.out.println("INVALID OPERATION");
            }
      
      System.out.println("\n-----Electricity Bill-----");
      System.out.println("Consumer No:"+id);
      System.out.println("Units used:"+unit);
      System.out.println("Connection Type:"+choice);
      System.out.println("Total Bill amount:Rs."+amount);
      
   }
 }
            
