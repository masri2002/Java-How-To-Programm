package Palindromes;


public class Palindromes {
    public static void main(String[] args) {
        String s ="بابا   اباب";
        System.out.println(palindromes(s,0,s.length()-1));
    }
    public static boolean palindromes(String s2 ,int first , int last){
        if(first>=last){
            return true;
        }else{
        if(!Character.isLetter(s2.charAt(first))){
             return palindromes(s2,first+1,last);
        }if(!Character.isLetter(s2.charAt(last))){
            return palindromes(s2,first,last-1);
        }
        if (Character.toLowerCase(s2.charAt(first))==Character.toLowerCase(s2.charAt(last))){
            return palindromes(s2,first+1 ,last-1);
        }
        }
        return false;
    }


}
