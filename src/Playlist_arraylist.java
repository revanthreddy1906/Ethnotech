import java.util.*;
public class Playlist_arraylist {
    public static void main(String[] args) {
        List<String> Playlist=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String firstsong=sc.nextLine();
        String secondsong=sc.nextLine();
        String thirdsong=sc.nextLine();
        String fourthsong=sc.nextLine();
        String fifthsong=sc.nextLine();
        Playlist.add(firstsong);
        Playlist.add(secondsong);
        Playlist.add(thirdsong);
        Playlist.add(fourthsong);
        Playlist.add(fifthsong);
        System.out.println("Playlist: "+Playlist);
        Playlist.remove(3);
        System.out.println("After removing song: "+Playlist);
        System.out.println("the song at index(1): "+Playlist.get(1));
        for(String s:Playlist)
        {
            System.out.println(s+" ");
        }
        System.out.println();
        Collections.sort(Playlist);
        System.out.println("After sorting: "+Playlist);
    }
}
