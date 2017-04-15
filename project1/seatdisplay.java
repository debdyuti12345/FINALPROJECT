package a;



import java.util.Scanner;


public class seatdisplay {
	 public static void main(String args[])  {
    
       

        int sn,rem=0;
        

        System.out.println("Welcome to the DIC lovin bus system!");
        System.out.println(" one fabulous DIC ride!");
        System.out.println();   
        
        System.out.println("Enter the seat no you want to display (between 1 and 108)");
        Scanner sc = new Scanner(System.in);
        sn = sc.nextInt();
                
        

            if(sn>=1 && sn<=108){
                rem = sn % 12;
            }
              else{
                      System.out.println("enter seat  between 1 and 108");
                  }
           
             if(rem==0)
            {
           
                if (sn == 12) 
                System.out.println("seat no is = "+1 + " " + "seat window is WS");
                else 
                System.out.println("seat no is = "+(sn - 11)+ " " + "seat window is WS");
             }
             else if (rem==1)
              {
                  if (sn == 1) 
                  System.out.println("seat no is = "+12 + " " + "seat window is WS");
                  else 
                  System.out.println("seat no is = "+(sn+ 11)+ " " + "seat window is WS");  
              }
                  else if(rem ==2)
                {
                 
                      if (sn == 2) 
                      System.out.println("seat no is = "+11 + " " + "seat window is MS");
                      else 
                      System.out.println("seat no is = "+(sn + 9)+ " " + "seat window is MS");
                  }
                  else if(rem == 3)
                      {
                  
                        if (sn == 3) 
                        System.out.println("seat no is = "+10 + " " + "seat window is AS");
                        else 
                        System.out.println("seat no is = "+(sn + 7)+ " " + "seat window is AS");
                      }
                  else if(rem == 4)
                    {
                 
                       if (sn == 4) 
                       System.out.println("seat no is = "+9 + " " + "seat window is AS");
                       else 
                       System.out.println("seat no is = "+(sn + 5)+ " " + "seat window is AS");
                   }
                  else if(rem == 5)
                    {
                
                      if (sn == 5) 
                      System.out.println("seat no is = "+5 + " " + "seat window is MS");
                      else 
                      System.out.println("seat no is = "+(sn + 3)+ " " + "seat window is MS");
                  }
                  else if(rem==6)
                  {
                     if (sn == 6) 
                      System.out.println("seat no is = "+7 + " " + "seat window is WS");
                      else 
                      System.out.println("seat no is = "+(sn + 1)+ " " + "seat window is WS");  
                  }
                  else if (rem==7)
                	  {
                	  if (sn == 7) 
                          System.out.println("seat no is = "+6 + " " + "seat window is WS");
                          else 
                          System.out.println("seat no is = "+(sn - 1)+ " " + "seat window is WS"); 
                    }
                  else if(rem ==8)
                  {
                     
                         if (sn == 8) 
                         System.out.println("seat no is = "+5 + " " + "seat window is MS");
                         else 
                         System.out.println("seat no is = "+(sn - 3)+ " " + "seat window is MS");
                  }
                  else if( rem == 9)
                  {
                  
                      if (sn == 9) 
                      System.out.println("seat no is = "+4 + " " + "seat window is AS");
                      else 
                      System.out.println("seat no is = "+(sn - 5)+ " " + "seat window is AS");
                  }
                  else if(rem == 10)
                  {
                 
                      if (sn == 10) 
                      System.out.println("seat no is = "+3 + " " + "seat window is AS");
                      else 
                      System.out.println("seat no is = "+(sn - 7)+ " " + "seat window is AS");
                  }
                  else 
                   {
                	  
                	      if (sn == 11) 
                          System.out.println("seat no is = "+2 + " " + "seat window is MS");
                          else 
                          System.out.println("seat no is = "+(sn - 9)+ " " + "seat window is MS");
                   }
                   
                  
                   
                    
            }
}



    


