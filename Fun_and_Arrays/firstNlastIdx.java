import java.util.Scanner;

public class firstNlastIdx {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();        

        //Binary Search algo
        //Manipulate the search space
        //Dont forget to reset lo and high for next itrn

        int low = 0;
        int high = arr.length-1;
        int firstIdx = -1;
        int lastIdx = -1;

        while(low<=high){
            int mid = (low+high)/2;
        
            if(arr[mid]>k){
                high = mid-1;
            }else if(arr[mid]<k){
                low = mid +1;
            }else{
                firstIdx = mid;
                high = mid-1; //Search more at left search space if any
            }

        }

        low = 0;
        high = arr.length-1;

        while(low<=high){
            int mid = (low+high)/2;
        
            if(arr[mid]>k){
                high = mid-1;
            }else if(arr[mid]<k){
                low = mid +1;
            }else{
                lastIdx = mid;
                low = mid+1; //Search more at right search space if any
            }

        }

        System.out.println(firstIdx);
        System.out.println(lastIdx);

       
    }
    
}


