import java.util.Arrays;

public class Bubble_sort {
    public static void sort_bubble(int[] arr){
        boolean flag;
        for(int i=0;i<arr.length;i++){
            flag=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag) break;
        }
            
    }

    public static void main(String[] args) {
        int[] arr = {20,40,90,10,50};
        System.out.println("Before sorting..."+ Arrays.toString(arr));
        sort_bubble(arr);
        System.out.println("After sorting..."+ Arrays.toString(arr));
    }
}
