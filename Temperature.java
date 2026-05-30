public class Temperature {
    public static void main(String[] args)
    {
        double[] temp={30,32,34,36,37,38,35,33,31,29,28,30,32,34,36,38,40,39,37,35,34,33,32,31,30,29,28,36,37,38};
        double highest=temp[0];
        double lowest=temp[0];
        double sum=0;
        for(int i=0;i<temp.length;i++)
        {
            if(temp[i]>highest)
            {
                highest=temp[i];
            }
            if(temp[i]<lowest)
            {
                lowest=temp[i];
            }
            sum+=temp[i];
        }
        double average=sum/temp.length;
        System.out.println("highest: "+highest);
        System.out.println("lowest: "+lowest);
        System.out.println("average: "+average);
        System.out.print("hotest days: ");
        for(int i=0;i<temp.length;i++)
        {
            if(temp[i]>35)
            {
                System.out.print((i+1)+" ");
            }
        }
    }
}
