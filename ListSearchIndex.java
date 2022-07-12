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
       if(list == null){
            return null;
       }else if(list.isEmpty()){
        
        List emp = new ArrayList();
            emp.clear();
            return emp;
       }else if(list.contains(value)){
           
       
        List myList = new ArrayList();
        myList.clear();
        System.out.print(value+"\n");
       for(int i=0;i<list.size();i++){
        System.out.print(list.get(i));
        System.out.print((list.get(i) == value)+"\n");
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