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
    int d = scn.nextInt();
    int f = getDigitFrequency(n, d);
    System.out.println(f);
  }

  public static int getDigitFrequency(int n, int d) {
    int ct = 0;

    while (n > 0) {  //Jab Tak number bacha hai
      int rem = n % 10; //Last num nikal
      n=n/10; //Number chota kar

      if (rem == d) ct++;
     
  }

    return ct;
  }
}
	
