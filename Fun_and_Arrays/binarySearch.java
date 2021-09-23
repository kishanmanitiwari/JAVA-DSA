import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();        

        //Binary Search algo

        int low = 0;
        int high = arr.length-1;
        int foundAt = -1;

        while(low<=high){
            int mid = (low+high)/2;
        
            if(arr[mid]>k){
                high = mid-1;
            }else if(arr[mid]<k){
                low = mid +1;
            }else{
                foundAt = mid;
                break; //Dont forget to break
            }

        }

        System.out.println(foundAt);
    }
    
}
