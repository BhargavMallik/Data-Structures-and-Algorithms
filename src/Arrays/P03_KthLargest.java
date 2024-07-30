package Arrays;

import java.util.Arrays;

public class P03_KthLargest
{
    public static void sort(int[] arr, int len)
    {
        for(int i = 0; i < len; i++)
        {
            for (int j = i+1; j < len; j++)
            {
                if (arr[j] < arr[i])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static int kthLargest(int[] arr, int k)
    {
        return arr[arr.length - k];
    }
    public static void main(String[] args)
    {
        int[] arr = {17,26,9,13,19,46,24,37,7,50,38,47};
        int len = arr.length;
        System.out.println(Arrays.toString(arr));

        sort(arr,len);
        System.out.println(Arrays.toString(arr));

        int k = kthLargest(arr,  3);
        System.out.println("Kth Largest: "+k);
    }
}
