import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){ //10 134 148
     int rv=0;//return value
     int carry = 0;
     int pow = 0;

        while(n1>0|| n2>0 ||carry>0){//carry>0 because if carry is left till last itreation eg->777(8)+1(8) = 1000 // 000 is from n1>0 || n2>0 but the 1 comes from carry(left-out) so put carry>0
                                        //Dry run 777(8)+1(8)

            int d1 = n1%10; //7/7/7
            int d2 = n2%10; //1/0/0

            int addn = d1+d2 + carry; //8/8/8
          

              carry = addn/b; //1/1/1   Qt is carry

              addn = addn%b; // give me last digit eg if addn is 12%10 = 2 and that is vaue of 1 whereas qt is carry (So Rem  gives me value at pos x)



              rv+=(addn)*Math.pow(10,pow);   //Place wrt to 10 pow
                     

              pow++;


          n1 =  n1/10;  //Num ko chota karte jaa
          n2 =  n2/10; //Num ko chota karte jaa

          


        }



     return rv;
     
   }
  }