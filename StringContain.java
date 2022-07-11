public class StringContain {
    public static boolean isStringContainedIn(String subString, String s) {
        if(s == null){
            return false;
        }else if(s.toLowerCase().contains(subString.toLowerCase()) ){
            return true;
        }else{
            return false;
        }
    }
}