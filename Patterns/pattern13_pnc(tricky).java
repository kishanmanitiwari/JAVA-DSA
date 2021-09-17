
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
  public static void main (String[] args) throws java.lang.Exception

  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    for (int i = 0; i < n; i++) { //start loop from 0 becasue for each row 1st col is 1 so nc0 =1
      int val = 1;
      for (int j = 0; j <= i; j++) {


        System.out.print(val + "\t");
        val = val * (i - j) / (j + 1);  //Pnc Formula nCr simplified

      }
      System.out.println();

    }




  }
}

