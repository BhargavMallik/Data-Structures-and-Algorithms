package Arrays;

import java.util.Arrays;

public class P01_ReverseArrays
{
    public static void reverseIteratively(int[] arr, int len)
    {
        int s = 0;
        int e = len - 1;
        while (s <= e)
        {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static void reverseRecursively(int[] arr, int s, int e)
    {
        if(s >= e)
            return;

        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        reverseRecursively(arr,++s,--e);
    }
    public static void main(String[] args)
    {
        int[] arr = {7,9,13,17,19,24,26,37,38,46,47,50};
        int len = arr.length;
        System.out.println(Arrays.toString(arr));

        reverseIteratively(arr,len);
        System.out.println(Arrays.toString(arr));

        reverseRecursively(arr,0,len-1);
        System.out.println(Arrays.toString(arr));
    }
}
