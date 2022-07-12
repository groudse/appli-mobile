import java.util.*;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
      
       if(list.contains(value) && !(list == null)){
       return list.lastIndexOf(value);
       
       }else{
        return null;
       }
       
    }
    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        
        if(list.contains(value) && !(list == null)){
       return list.indexOf(value);
       }else{
        return null;
       }
    }
    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
       
        if(list.contains(value)){
       
        List myList = new ArrayList();
        

       for(int i=0;i<list.size();i++){
            if(list.get(i) == value){
            myList.add(i);
        }
       }
        return myList;
       }else{
        return null;
       }
    }
    
    
}