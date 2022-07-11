public class Palindrome {
    public static boolean isPalindrome(String s) {
       if(s == null){
            return false;
        }else{
        for(int i = 0;i<s.length();i++){
          
            if(s.charAt(i) == s.charAt(s.length()-(i+1))){
                
            }else{
                return false;
            }
        }
        return true;
       
   
    
}

}
}