package PassingByRefAndPassingByRef;

public class Main {
   static  class X {
        int x=0;
    }
    public static void main(String[] args) {
        int x=0;

        System.out.print("x before add by 1 as value :");
        System.out.println(x);
        //pass by value
        add(x);
        System.out.println("x after add by 1 as value :" + x);
        X v=new X();
        System.out.println("x before  add by 1 as ref  :" + v.x);
        add(v);
        add(v);
        add(v);
        System.out.println("x after add by 1 as ref  :" + v.x);

    }
    public static void add(int x) {
        x++;
    }
    public static void add(X x) {
        x.x++;
    }
}
