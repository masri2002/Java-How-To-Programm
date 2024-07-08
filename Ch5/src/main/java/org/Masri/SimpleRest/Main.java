package org.Masri.SimpleRest;

import java.security.SecureRandom;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
//                "Conditional AND (&&)",
//                "False && False ", (false && false),
//                "False && True", (false && true),
//                "True  && False", (true && false),
//                "True  && True", (true && true));
//
//
//        System.out.printf("%s%n%s : %b%n%s : %b%n%s : %b%n%s : %b%n%n"
//        ,"Conditional OR (||)" ,
//                "False || False" , (false||false),
//                "False || True" , (false || true),
//                "True  || False" ,(true||false),
//                "True  || True" , (true || true)
//        );
//        System.out.printf("%s%n%s : %b%n%s : %b%n%s : %b%n%s : %b%n%n",
//                "Conditional EXCLUSIVE OR (^) " ,
//                "False ^ False",(false^false),
//                "False ^ True" , (false ^ true),
//                "True  ^ False" , (true ^ false),
//                "True  ^ True" , (true ^ true)
//        );
//        System.out.printf("%s%n%s : %b%n%s : %b%n%s : %b%n%s : %b%n%n",
//                "Conditional INCLUSIVE OR (|) " ,
//                "False | False", (false | false),
//                "False | True" , (false | true),
//                "True  | False" , (true  | false),
//                "True  | True" , (true  | true)
//        );
//        System.out.printf("%s%n%s : %b%n%s : %b%n%s : %b%n%s : %b%n%n",
//                "Conditional And OR (&) " ,
//                "False & False",(false & false),
//                "False & True" ,(false & true),
//                "True  & False",(true  & false),
//                "True  & True" , (true & true)
//        );
//        System.out.printf("%s%n%s : %b%n%s : %b%n%n",
//                "Conditional NOT (!)" ,
//                  "!False" ,(!false),
//                  "!True " ,(!true));
//        for (int i=1;i<=10;i++) {
//            switch (i) {
//                case 1:
//                    System.out.println("**********");
//                    break;
//                    case 2:
//                        System.out.println(" *********");
//                        break;
//                        case 3:
//                            System.out.println("  ********");
//                            break;
//                            case 4:
//                                System.out.println("   *******");
//                                break;
//                                case 5:
//                                    System.out.println("    ******");
//                                    break;
//                                    case 6:
//                                        System.out.println("     *****");
//                                        break;
//                case 7:
//                    System.out.println("      ****");
//                    break;
//                    case 8:
//                        System.out.println("       ***");
//                        break;
//                        case 9:
//                            System.out.println("        **");
//                            break;
//                        case 10:
//                            System.out.println("         *");
//                            break;
//            }
//        }

        /*

         *
        ***
       *****
      *******
     *********
      *******
       *****
        ***
         *


         */
//        int n = 5; // Number of rows for the diamond
//
//        for (int i = 1; i <= n * 2 - 1; i++) {
//            int spaces = Math.abs(n-i);
//            int stars = n - spaces;
//
//
//            for (int j = 1; j <= spaces; j++) {
//                System.out.print(" ");
//            }
//
//
//            for (int j = 1; j <= 2 * stars - 1; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//
         int frequency1=0;
         int frequency2=0;
         int frequency3=0;
         int frequency4=0;
         int frequency5=0;
         int frequency6=0;
        SecureRandom random = new SecureRandom();
         for (int i = 1; i <= 6000000; i++) {
             int face =1+random.nextInt(6);
             switch (face){
                 case 1:
                     frequency1++;
                     break;
                     case 2:
                         frequency2++;
                         break;
                         case 3:
                             frequency3++;
                             break;
                             case 4:
                                 frequency4++;
                                 break;
                                 case 5:
                                     frequency5++;
                                     break;
                                     case 6:
                                         frequency6++;

             }
         }
        System.out.printf("%s : %d  , %s : %d, %s : %d, %s : %d, %s : %d, %s : %d",
                "frequency 1" ,frequency1,
                "frequency 2" ,frequency2,
                "frequency 3" ,frequency3,
                "frequency 4" ,frequency4,
                "frequency 5" ,frequency5,
                "frequency 6" ,frequency6);
    }


    }


