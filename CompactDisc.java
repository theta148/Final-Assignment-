import java.util.Scanner;
import java.io.*;
/**
 This program creates a list of songs for a CD
 by reading from a file.
 */
public class CompactDisc
{
    public static void main(String[] args)throws IOException
    {
        Scanner input = new Scanner(new File("./src/Classics.txt"));
        String title;
        String artist;


        Song[] cd = new Song[6];
        for (int i = 0; i < cd.length; i++)
        {
            title = input.nextLine();
            artist = input.nextLine();
            // Fill the array by creating a new song with
            // the title and artist and storing it in the
            // appropriate position in the array
            Song song = new Song(title, artist);
            cd[i] = song;
        }
        System.out.println("Contents of Classics:");
        for (int i = 0; i < cd.length; i++)
        {
           
            // Print the contents of the array to the console
            System.out.print(cd[i]);
        }
    }
}