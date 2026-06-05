//Student entitys
import java.util.*;
public class Linkedlist {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String[]> list=new ArrayList<>();
        list.add(new String[] {"2828","revanth","cst","a"});
        list.add(new String[] {"2823","hemanth","ece","b"});
        list.add(new String[] {"2816","bharath","ai","c"});
        list.add(new String[] {"2818","harsha","civil","d"});
        for(String[]row: list)
        System.out.println(Arrays.toString(row));

    }
}
