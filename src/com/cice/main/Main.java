/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.main;

import java.util.Scanner;

/**
 *
 * @author cice
 */
public class Main {

    public static void main(String[] args) {

        //RuntimmeException
        try {
            Integer entero = new Integer("abc");
        } catch (NumberFormatException e) {
            System.out.println("No es un número");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        
        try {
            Integer entero = new Integer(sc.nextLine());
            System.out.println("Has introducido el número " + entero);
        } catch (NumberFormatException nfe) {
            System.out.println("No has introducido un número es un número");

        }
        System.out.println("Introduce otro número");
        Integer otro = new Integer(sc.nextLine());

    }

}
