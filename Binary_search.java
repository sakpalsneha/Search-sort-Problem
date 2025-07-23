import java.util.*;
public class Binary_search {
    public static int bin_search(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid]==target){
                return mid;
            }else if(target<arr[mid]){
                right=mid-1;
            }else {
                left=mid+1;
            }

        }
        return -1;
        
    }
    public static void main(String[] args) {
        int[] arr= {10,20,30,40,50};
        int target =40;
        int res = bin_search(arr,target);

        if(res==-1){
            System.out.println("Search element is not fount");
        }else{
            System.out.println("Search element found at index :"+res);
        }
    }
}
