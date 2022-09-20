import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class KeepTheChange {
    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        ArrayList<Integer> list2 = new ArrayList<Integer>(coins);   
        ArrayList<Integer> dernie = new ArrayList<Integer>();   
        int i = 0;
        int j = 0;

        Collections.sort(list2, Comparator.reverseOrder());
      
        if((amount > 0) && (coins.isEmpty() != true)){
        while(i < amount){
            if(i+list2.get(j)<amount){
                i += list2.get(j);
                dernie.add(list2.get(j));
            }else if(i+list2.get(j)==amount)
            {
                i += list2.get(j);
                dernie.add(list2.get(j));
                return dernie;
            }else{
            j++;
            }

        }
        return list2;
    }else{
    return null;
    }
    }
}

/*
[7, 7, 3, 1]
  */