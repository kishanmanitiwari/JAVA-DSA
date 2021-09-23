import java.util.Scanner;

public class ceilNFloor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();        

        //Binary Search algo
        //Assume ceil and floor as mid and keep on searching for next possible soln
        
        int low = 0;
        int high = arr.length-1;
        
        int floor = 0;
        int ceil = 0;


        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid]>k){
                high = mid-1;
                ceil = mid; //You can be a possible ceil

            }else if(arr[mid]<k){
                low = mid +1;
                floor = mid; //You can be possible foor

            }else{
                
                floor = mid;
                ceil = mid;  //If you found it the ceil and floor is same
                break;
            }


        
        }

       
        System.out.println(arr[ceil]);
        System.out.println(arr[floor]);
    }
}
