import java.util.*;
public class Linear_search {
    public static int lin_search(int[] arr, int target){
          for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
            
            }
            return -1;
}
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int target =30;
        int res = lin_search(arr,target);
        if(res==-1){
            System.out.println("Search not success and element not fount");
        }else{
            System.out.println("Element fount at index :"+res);
        }
    }
}
