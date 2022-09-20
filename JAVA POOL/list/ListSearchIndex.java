import java.util.*;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
      if(!(list == null)){
       if(list.contains(value)){
       return list.lastIndexOf(value);
       
       }else{
        return null;
       }
       }else{
        return null;
       }
    }
    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        if(!(list == null)){
        if(list.contains(value)){
       return list.indexOf(value);
       }else{
        return null;
       }}else{
        return null;
       }
    }
    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {

        List<Integer> myList = new ArrayList<>();
        
       if(list == null){
            return myList;
       }else if(list.isEmpty() == true){
    
            return myList;
       }else{
       
       for(int i=0;i<list.size();i++){
            if(list.get(i).equals(value)){
            myList.add(i);
            
        }
        
       }
       if(myList.isEmpty() == true){
            return myList;
        }
        return myList;
       }
    }
    
    }
