package FileSorter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class FileSorter implements Comparable<FileSorter>{
    int x = 0;
    int y = 0;
    @Override
    public int compareTo(FileSorter o) {
        int a = Integer.compare(x, o.x);
        if (a != 0){
            return a;
        }
        return Integer.compare(y, o.y);
    }
}
