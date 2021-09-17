import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++){ //Taking i/p
        arr[i]=scn.nextInt();
    }

	int d = scn.nextInt();
	int found = -1;  //variale to detect found element

	for(int i=0;i<arr.length;i++){
        if(arr[i]==d) 	found = i;  //Traversing-Checking-Manipulation
	 }

	System.out.print(found);




	}
}

