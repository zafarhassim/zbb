import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Merge {
    public static void main(String[] args) throws Exception {

        String note = "src/spotify.csv";
        String line = "";
        String cvsSplitBy = ",";
        String[] singer;
        final int size = 100;
        String[] original = new String[size];
        String[] arrSinger = new String[size];
        int j = 0;

        BufferedReader bufferedReader = new BufferedReader(new FileReader(note));

        while ((line = bufferedReader.readLine()) != null) {
            singer = line.split(cvsSplitBy);
            original[j] = singer[1].toLowerCase().trim();
            arrSinger[j] = singer[3].toLowerCase().trim();
            j++;
        }

        Arrays.toString(original);
        Arrays.toString(arrSinger);

        for(int i = 1; i < arrSinger.length-1;i++){
            if(Integer.parseInt(arrSinger[i]) > 80){
                System.out.println(original[i] + " " + arrSinger[i]);
            }
        }
    }
}