/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.excepciones;

/**
 *
 * @author cice
 */
public class EmailNotValidFormatException extends Exception{
    
    
    public static final String DEFAULT_MSG="Mensaje por defecto";
    public static final String FORMAT_ERROR="El email no tiene el formato correcto";
    public EmailNotValidFormatException(){
        super(DEFAULT_MSG);
    }
    
    public EmailNotValidFormatException(String mensaje){
        super(mensaje);
    }

  
    
    
    
}
