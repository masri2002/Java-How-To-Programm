package org.Masri.SimpleRest;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    String args[]={"ahmad"};

    public static void main(String[] args) {
             Account ahmadAcc=new Account("Ahmad AlMasri",0F);
             Account aliAcc=new Account("Ali AlMasri",0F);
             aliAcc.setBalance(70.53F);
        System.out.printf("The Account balance is %.2f",aliAcc.getBalance());


    }
}