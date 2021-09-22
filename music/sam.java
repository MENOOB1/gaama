import java.util.*;
  
  public class  sam{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       // write ur code here
       int t = scn.nextInt();
       for(int i=0;i<t;i++){
           int n = scn.nextInt();
           int count =0;
           for(int j=2;n>=j*j;j++){
              if(n==2||n==1){
                System.out.println("prime"); 
                
                break;
               }
              else if(n%j==0){
                   System.out.println("not prime");
                   count++;
                   break;
               }
                
              else{
                   System.out.println("prime"); 
              }
           }
         
       }
  
   }
  }