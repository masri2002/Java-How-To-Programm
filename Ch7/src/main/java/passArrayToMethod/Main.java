package passArrayToMethod;

public class Main {
public static void main(String[] args) {
    int ar []={1,2,3,4,5};
    System.out.printf("%s%n","Array before modification");
    for(int i :ar){
        System.out.printf("%-2d",i);
    }
    modifyArray(ar);
    System.out.printf("%n%s%n","Array after modification");
    for(int i :ar){
        System.out.printf("%-2d",i);
    }
    System.out.println();
    System.out.println("element 3 before modification " +ar[3]);
    modifyElement(ar[3]);
    System.out.println("element 3 after modification " +ar[3]);
}
public static int[] modifyArray(int ar[]){
    for(int i=0;i<ar.length;i++){
        ar[i]=(i+1)*2;
    }
    return ar;
}
public static int modifyElement(int element){
    System.out.println("modifyElement =" +element*2);
    return element*2;
}
}

