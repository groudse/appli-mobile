import java.util.Set;
import java.util.Map;
import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Wedding {
    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
        Map<String, String> phonebook = new HashMap<String, String>(); 
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<Integer> stock = new ArrayList<>();
        List<Integer> stock2 = new ArrayList<>();
        stock.clear();
        stock2.clear();

        list.addAll(first);
        list2.addAll(second);
        int max = 0;

        if(first.size()>second.size()){
            max = second.size();
        }else{
            max = first.size();
        }

        for(int i=0;i<max;i++){

            int g = (int) (Math.random()*(max-0)) + 0;
            int v = (int) (Math.random()*(max-0)) + 0;

            if((stock.contains(g) == false) && (stock2.contains(v) == false)){
                String ty =  list.get(g);
                String ru =  list2.get(v);
                stock.add(g);
                stock2.add(v);

                phonebook.put(ty,ru);
            }else{
                i--;
            }
           
            
            

        }
        return phonebook;
    }
}
