package Enum;

import java.util.EnumSet;

public class Main {
    public static void main(String []args){

        for (Book book:Book.values()){
            System.out.printf("%-10s%-45s%s%n", book,
                    book.getTitle() ,book.getYear());
        }
        System.out.printf("%nDisplay a range of enum constants:%n");
        for (Book book : EnumSet.range(Book.JHTP ,Book.CPPHTP)){
            System.out.printf("%-10s%-45s%s%n", book,
                    book.getTitle() ,book.getYear());
        }
    }
}
