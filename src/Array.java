public class Array {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        int k=2;
        int n=arr.length;
        k=k%n;
        int[] result=new int[n];
        for(int i=0;i<n;i++)
        {
            result[(i+k)%n]=arr[i];
        }
        for(int num:result)
        {
            System.out.print(num+" ");
        }
    }

}
