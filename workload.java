
import java.util.Arrays;

public class workload {
    public static void main(String[] args) {
        int[] arr={2,8,4,9,3,6};
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        int sum_max=0;
        while(left<right){
            if(arr[left]+arr[right]>sum_max) sum_max=arr[left]+arr[right];
            left++;
            right--;
        }
        System.out.println(sum_max);
    }
}
   