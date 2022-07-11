public class ComputeArray {
    public static int[] computeArray(int[] array) {
        int stock;
        if(array == null){
        return null;
        }
      for(int i = 0;i<array.length;i++){
        
        
        if(array[i]%3==0){
            array[i] = array[i]*5;
        }else if((array[i]%3)-1 == 0)
        {
            array[i] = array[i]+7;
        }else{
            continue;
        }

    }

   
    return array;

}
}