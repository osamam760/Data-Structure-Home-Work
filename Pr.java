/**
 * Created by aamer ali on 23/02/21.
 */
public class Pr {
    static int findrepeating(int[]arr, int n)
    {
      int sum =0;
        for (int i=0;i<n;i++)
        {
            sum+=arr[i];
            return sum -(((n-1)*n)/2);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr ={9,9,2,6,1,8,5,3,4,7};
        int n=arr.length;
        System.out.println("the recurring component is :");
        System.out.println(findrepeating(arr,n));


    }



}
