 import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();//b1  b1(source)-->Decimal---> b2(destn) 
      int  destBase= scn.nextInt();//b2
      int dec = getValueIndecimal(n,sourceBase);  //Logic-> From Source go to decimal first then from decimal go to destn
      System.out.println(getValueInBase(dec,destBase));
   }


  
   public static int getValueIndecimal(int n, int b){
      // write your code here
        int rv=0;
        int pow=0;

        while(n!=0){
            int rem = n%10;
            n=n/10;

            rv+=rem*Math.pow(b,pow);
            pow++;
        }

        return rv;
   }


   public static int getValueInBase(int n, int b){
       
       int rv=0;
       int pow =0;

        while(n>0){
            int rem = n%b; //4
            n=n/b; // 56

            rv+=rem*Math.pow(10,pow);
            pow++;


        }



       return rv;


   }

  }