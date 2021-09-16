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
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       int rv=0;
       int pow = 0;
       int borrow = 0; //0/1/1

        while(n2>0){ //kab tak num bada hai chahe wo n1 ho ya n2 but n2 rakhna safe hai kyuki harbar cut to wahi rha :)
            int d1 = n1%10; //145 -- 5 --4 --1
            int d2 = n2%10; //312 --2 --1 --3

            n1=n1/10;// -- 14 --1--0
            n2=n2/10;  // 31 --3--1

            
          int digit = d2-borrow-d1; //Bhai jo tumne borrow di dusre ko wo ko subtract karo  //Extra-> d2-d1 issliye kar rhe kyuki constrain hai ki n2 bada hai 
                    //2-0-5 = -3
                    //1-1-4 = -4
                    //3-1-1 = 1

            if(digit<0){ //-ve matlab bhaiya tum subtract nahi ho sakte tumhi sahare(borrow) ki zaroorat hai
                borrow=1; // le lo bhai borrow 
                digit+=b; //are bhai ne borrow li hai zara do baju wale se base(eg-10,8 etc) // -3+10(assume base 10) = 7 // -4+10 = 6//
            }else{
                borrow=0; //bhai tuhme sahare ki zaroorat nahi //1 
            }

            rv += digit*Math.pow(10,pow);   //167
            pow++;

           

        }

 

       return rv;
   }
  
  }