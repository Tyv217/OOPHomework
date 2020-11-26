package FileReader;

public class FileReader implements Comparable<FileReader>{
    int x = 0;
    int y = 0;
    @Override
    public int compareTo(FileReader o) {
        int a = Integer.compare(x, o.x);
        if (a != 0){
            return a;
        }
        return Integer.compare(y, o.y);
    }
}
