package Arrays;

import java.util.Arrays;

public class P04_NegPosArray
{
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {-17,26,-9,-13,-19,46,-24,37,-7,50,-38,-47};
        int len = arr.length;

        int low = 0;
        int mid = 0;
        while (mid <= len - 1)
        {
            if(arr[mid] < 0)
            {
                if(mid != low)
                    swap(arr,mid,low);
                low++;
                mid++;
            }
            else
                mid++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
