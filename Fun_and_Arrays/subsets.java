import java.util.Scanner;

public class subsets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        //Main Logic -> if i/p is 3 print 2^n binary nums

        //Approach ->
        //Print the binary numbs from 1-n by simple dec to binary conversion logic divide it n times (inner loop - n times)
        //Initalise a string // To collect the ans
        //Inner loop arr.length-1 to >=0 or 0 to <arr.length{while adding value in subset do arr[arr.length-1-j]} bcz arr-> left to right and nums are <- right to left
        // If rem !=0 print j else print "-\t"

        //eg->
        // arr[1,2,3] n==2 binary == 0 0 1 
        // So for binary of unit place 1 -> 3 should be printed but arr are left to right assocaitive so 1 will be printed
        //So either itreate backwards or while adding do arr[arr.length-1-j]


        for (int i = 0; i < (1<<n); i++) { // loop is runnning 7 times or (1<<n) -> 2^n bitwise opr //Math.pow(2,n)
            int dec = i; //get hold of num
            String ans = ""; //To collect the ans
            
            for (int j = arr.length-1; j>=0; j--) { // loop will run 3 times (You have to divide it n times bcz it represents for n i/p)
                int rem = dec%2;  //You can also loop from 0 to <arr.length
                dec = dec/2;

                if (rem==0) {
                    //Then num will not come
                    ans = "-\t" + ans;
                } else {
                    //!=0 it will come 
                    ans = arr[j] + "\t" + ans; //while printing do arr[arr.length-1-j] arr[3-1-0/1/2] i.e last digit
                }
                
            }
            System.out.println(ans);
            
        }








    }
}
