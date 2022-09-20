public class StringContain {
    public static boolean isStringContainedIn(String subString, String s) {
        if(s == null || subString == null){
            return false;
        }else if(s.indexOf(subString) != -1){
            return true;
        }else{
            return false;
        }
    }
}