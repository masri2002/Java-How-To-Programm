public class Revres {
    public static void main(String[] args) {
        String s="ahmad almasri";
        String s2=revers(s);
        System.out.println(s2);
    }
    public static String revers(String s){
        if (s.isEmpty() || s.length()==1){
            return s;
        }
        return revers(s.substring(1))+s.charAt(0);
    }
}
