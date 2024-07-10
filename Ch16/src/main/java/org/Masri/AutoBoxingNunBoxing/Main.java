package org.Masri.AutoBoxingNunBoxing;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Object []integers = new Object[10];
      //AutoBoxing
      Integer integer = 100;
      integers[0]= integer;
      //AutoUnboxing
      int i = (int) integers[0];

        System.out.println(i);
    }
}