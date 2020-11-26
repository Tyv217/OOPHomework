package FindMean;

import java.util.Iterator;
import java.util.List;

public class FindMean {
    public double forLoopFindMean(List<Integer> list){
        double total = 0;
        for (int x = 0; x < list.size(); x++){
            total += list.get(x);
        }
        return (total /  list.size());
    }
    public double forEachFindMean(List<Integer> list){
        double total = 0;
        for (int x: list){
            total += x;
        }
        return (total / list.size());
    }
    public double iteratorFindMean(List<Integer> list){
        double total = 0;
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            total += iterator.next();
        }
        return (total / list.size());
    }
}
