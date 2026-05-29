import java.util.*;
public class Productof_two_arrays {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of an array: ");
    int n=sc.nextInt();
    System.out.print("Enter the Elements of an array: ");
    int[] arr=new int[n];
    for(int i=0;i<n;i++) arr[i]=sc.nextInt();
    //int[] arr= {5,6,7,8,9};
    for(int i=0;i<arr.length;i++) {
        long mul=1;
        for(int j=0;j<arr.length;j++) {
            if(arr[i]!=arr[j]) {
                mul*=arr[j];
            }
        }
        System.out.print(mul+" ");
    }
}


}
