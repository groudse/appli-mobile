import java.util.*;
import java.util.ArrayList;

import javax.swing.plaf.synth.SynthEditorPaneUI;

public class Sort {

    public static List<Integer> sort(List<Integer> list) {
    
        ArrayList<Integer> list2 = new ArrayList<Integer>();   
        list2.clear();
        if(list != null){
        for(int i=0; i<list.size();i++ ){
            list2.add(list.get(i));

        }
        
        Collections.sort(list2);   
    
        return list2;
    }else{
        return null;
    }
 
     
        
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        ArrayList<Integer> list2 = new ArrayList<Integer>();   
        list2.clear();
        if(list != null){
        for(int i=0; i<list.size();i++ ){
            list2.add(list.get(i));

        }
        
        Collections.sort(list2,Collections.reverseOrder());   
    
        return list2;
    }else{
        return null;
    }
    }
}







