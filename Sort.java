import java.util.*;


public class Sort {

    public static List<Integer> sort(List<Integer> list) {
        List<Integer> myList = new ArrayList<>();
        
        if(list != null){

            Collections.sort(list);
            for(int i=0; i<list.size();i++ )
        {
            myList.add(list.get(i));
        }
        return myList;
        }else{
            myList.clear();
            return myList;
        }
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        List<Integer> myList = new ArrayList<>();
       
        if(list != null){
            Collections.sort(list, Collections.reverseOrder());
            for(int i=0; i<list.size();i++ )
        {
            myList.add(list.get(i));
        }
        return myList; 
        }else{
            myList.clear();

            return myList;
        }
    }
}







