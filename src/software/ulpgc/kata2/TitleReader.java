package software.ulpgc.kata2;

import java.io.IOException;
import java.util.List;

public interface TitleReader {
    List<Title> readTitles() throws IOException;
}
