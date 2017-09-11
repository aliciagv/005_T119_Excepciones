/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.main;

/**
 *
 * @author cice
 */
public class Finally {
    
    public static void main(String[] args){
        
        try {
            int var =(1/0);
        }catch(NullPointerException e){
            e.getMessage();
        } catch(ArithmeticException e){
            System.out.println("Excepcion");
            int var=(1/0);
            throw e;
        } catch(IndexOutOfBoundsException e){
            e.getMessage();
        } catch(Exception e){
            e.getMessage();
        
        } finally {
            System.out.println("Paso por el finally");
        }
        
    }
    
}
