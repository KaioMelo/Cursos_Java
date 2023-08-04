package service;

import java.util.List;

public class CalculationService {
    public static <T extends Comparable<T>> T max(List<T> list) { // Forma correta <T extends Comparable<? super T>>
        if(list.isEmpty()){
            throw new IllegalStateException("List can't be empty");
        }
        T max = list.get(0);
        for(T item: list){
            if(item.compareTo(max) > 0){
                max = item;
            }
        }
        return max;
    }
}
