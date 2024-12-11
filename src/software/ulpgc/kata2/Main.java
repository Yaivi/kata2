package software.ulpgc.kata2;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("content.txt");
        List<Title> titles = new TsvFileTitleReader(file).readTitles();
        HashMap<Integer, Integer> histogram = new HashMap<>();
        for (Title title : titles) {
            histogram.put(title.getStartYear(), histogram.getOrDefault(title.getStartYear(), 0) + 1);
        }
        for (Integer integer : histogram.keySet()) {
            System.out.println(integer + ":" + histogram.get(integer));
        }
    }
}
