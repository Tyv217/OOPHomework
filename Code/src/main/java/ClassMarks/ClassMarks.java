package ClassMarks;

import java.util.*;

public class ClassMarks {
    private int total = 0;
    private TreeMap<String,Double> tm;
    public ClassMarks(TreeMap<String,Double> tm){
        this.tm = tm;
    }
    public void add(String name, double mark){
        tm.put(name,mark);
    }
    public List<String> names(){
        ArrayList<String> list = new ArrayList<String>();
        for (Map.Entry<String,Double> entry : tm.entrySet()) {
            list.add(entry.getKey());
        }
        Collections.sort(list);
        return list;
    }
    public List<String> topXPercent(int x){
        Double[] list = new Double[tm.size()];
        int y = 0;
        for (Map.Entry<String,Double> entry : tm.entrySet()) {
            list[y] = (entry.getValue());
            y++;
        }
        Arrays.sort(list, Collections.reverseOrder());
        Double[] list1 = Arrays.copyOf(list,list.length*x/100);
        TreeMap<String,Double> tm1 = tm;
        List<Double> list2 = Arrays.asList(list1);
        ArrayList<String> list3 = new ArrayList<String>();
        for (Map.Entry<String,Double> entry : tm1.entrySet()) {
            if(list2.contains(entry.getValue())){
                list3.add(entry.getKey());
            }
        }
        return list3;
    }
    public double medianMark(){
        Double[] list = new Double[tm.size()];
        int y = 0;
        for (Map.Entry<String,Double> entry : tm.entrySet()) {
            list[y] = (entry.getValue());
            y++;
        }
        Arrays.sort(list);
        if(list.length %2 == 0){
            return (list[(list.length)/2] + list[(list.length)/2+1])/2;
        }
        return list[(list.length+1)/2];
    }

}
