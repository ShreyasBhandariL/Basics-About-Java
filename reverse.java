import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(Arrays.toString(reverser(arr)));
    }
        public static int[] reverser(int arr[]) // space complexity 0(1) time complexity 0(N/2)
        {
            int temp;
            for(int i=0;i<arr.length/2;i++)
            {
                temp=arr[i];
                arr[i]=arr[arr.length-1-i];
                arr[arr.length-1-i]=temp;
            }
            System.out.println();
            return arr;
        }
}
