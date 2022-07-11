public class StringContain {
    public static boolean isStringContainedIn(String subString, String s) {
        if(s == null){
            return false;
        }else if(s.toLowerCase().indexOf(subString.toLowerCase()) != -1){
            return true;
        }else{
            return false;
        }
    }
}