/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconverter1;
import java.util.*;

import java.text.DecimalFormat;
/**
 *
 * @author samsung
 */
public class Currencyconverter1 {

   


    
public static void main(String[] args) 
       
 {
            double rupee,dollar,pound,code,euro,yen;
      
      DecimalFormat df = new DecimalFormat("##.###");

          
  Scanner sc = new Scanner(System.in);

          
  System.out.println("Enter the currency code 1:Rupee\n2:Dollar\n3:Pound\n4:Euro\n5:Yen"); 
   
         code=sc.nextInt();


          if(code == 1)
         
   {
                System.out.println("Enter amount in rupees");
            
    rupee = sc.nextFloat();
  
              dollar = rupee / 66;
                
System.out.println("Dollar : "+df.format(dollar));

              
  pound = rupee / 98;
           
     System.out.println("Pound : "+df.format(pound));

            
    euro = rupee / 72;
              
  System.out.println("Euro : "+df.format(euro));

  
              yen = rupee / 0.55;
               
 System.out.println("Yen : "+df.format(yen));

            }

  
          //For Dollar Conversion
          
  else if (code == 2)
          
  {
                System.out.println("Enter amount in dollar");
      
          dollar = sc.nextFloat();

             
   rupee = dollar * 66;
           
     System.out.println("Rupees : "+df.format(rupee));

       
         pound = dollar * 0.67;
              
  System.out.println("Pound : "+f.format(pound));
                        
         
       euro = dollar * 0.92;
           
     System.out.println("Euro : "+df.format(euro));
               
     
           yen = dollar * 120.90;
               
 System.out.println("Yen : "+df.format(yen));
            }

      
      //For Pound Conversion
          
  else if(code == 3)
           
 {
                System.out.println("Enter amount in Pound");
   
             pound = sc.nextFloat();

      
          rupee = pound * 98;
     
           System.out.println("Rupees : "+df.format(rupee));
         
               
                dollar = pound * 1.49;
        
        System.out.println("Dollar : "+df.format(dollar));

           
     euro = pound * 1.36;
    
            System.out.println("Euro : "+f.format(euro));

      
          yen = pound * 179.89;
             
   System.out.println("Yen : "+df.format(yen));
            }

      
      //For Euro Conversion
       
     else if(code == 4)
        
    {
                System.out.println("Enter amount in Euro");
          
      euro = sc.nextFloat();

              
  rupee = euro * 72;
               
 System.out.println("Rupees : "+df.format(rupee));
                 
       
                dollar = euro * 1.09;
             
   System.out.println("Dollar : "+df.format(dollar));

       
         pound = euro * 0.73;
         
       System.out.println("Pound : "+df.format(pound));

      
          yen = euro * 131.84;
              
  System.out.println("Yen : "+df.format(yen));
            }

            //For Yen Conversion
      
      else if(code == 5)
           
 {
                System.out.println("Enter amount in Yen");
       
         yen = sc.nextFloat();

           
     rupee = yen * 0.55;
             
   System.out.println("Rupees : "+df.format(rupee));

        
        dollar = yen * 0.01;
            
    System.out.println("Dollar : "+df.format(dollar));

          
      pound = yen * 0.01;
             
   System.out.println("Pound : "+df.format(pound));

            
    euro = yen * 0.01;
              
  System.out.println("Euro : "+df.format(euro));
            }

       
     else
      {         
 System.out.println("Invalid Code");

    }
                
}

}
