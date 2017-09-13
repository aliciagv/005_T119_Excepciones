/*
 * Confirmar si un email solicitado tiene el formato correcto
 */
package com.cice.main;

import com.cice.excepciones.EmailNotValidFormatException;
import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author cice
 */
public class MainExcepcionesPersonalizadas {
    
    private static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    
    public static void main( String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el email");
        String email =sc.nextLine();
        try {
            validaEmail(email);
        } catch (EmailNotValidFormatException ex) {
            System.out.println(ex.getMessage());
            
        }
       
        
    
    }
    private static void validaEmail(String email)  throws EmailNotValidFormatException{
        
        Pattern pattern = Pattern.compile(PATTERN_EMAIL);
 
        // Match the given input against this pattern
        Matcher matcher = pattern.matcher(email);
        if (!matcher.matches()) throw new EmailNotValidFormatException(EmailNotValidFormatException.FORMAT_ERROR);
    
    }
}
