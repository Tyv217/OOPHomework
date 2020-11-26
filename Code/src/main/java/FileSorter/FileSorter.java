package FileSorter;
import java.util.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.io.*;
public class FileSorter{
    int x;
    int y;
    public FileSorter(int x, int y) {
        this.x = x;
        this.y = y;
    }
    static class Sorting implements Comparator<FileSorter> {
        public int compare(FileSorter a, FileSorter b) {
            if(a.x==b.x){
                return a.y-b.y;
            }
            else return a.x - b.x;
        }
    }

    public static List<String> readFileInList(String fileName) {
        List<String> lines = Collections.emptyList();
        try {
            lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
    public static ArrayList<FileSorter> SortAndPrint(List l){

        Integer[][] ints = new Integer[l.size()][2];
        Iterator<String> itr = l.iterator();
        ArrayList<FileSorter> ar = new ArrayList<FileSorter>();
        while (itr.hasNext()) {
            String[] string = itr.next().split(",");
            FileSorter filesorter = new FileSorter(Integer.parseInt(string[0]), Integer.parseInt(string[1]));
            ar.add(filesorter);
        }
        Collections.sort(ar, new Sorting());
        return ar;
    }

    public static void main(String[] args) {
        List l = readFileInList("C:\\Users\\thoma\\OneDrive\\Desktop\\test.txt");
        ArrayList<FileSorter> ar = SortAndPrint(l);
        for(FileSorter x: ar){
            System.out.printf("%d,%d\n",x.x,x.y);
        }
    }
}
