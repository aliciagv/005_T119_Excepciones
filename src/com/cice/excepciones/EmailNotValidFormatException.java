/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.excepciones;

import com.cice.config.MyProperties;

/**
 *
 * @author cice
 */
public class EmailNotValidFormatException extends Exception {

    //public static final String DEFAULT_MSG = "Mensaje por defecto";
    //public static final String FORMAT_ERROR = "Formato erroneo";

    private String errorCode;

    public EmailNotValidFormatException() {
        super(obtenerMsgAsociado("00"));
    }


    public EmailNotValidFormatException(String errorCode) {
        super(obtenerMsgAsociado(errorCode));
        this.errorCode = errorCode;

    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    private static String obtenerMsgAsociado(String code) {
        return MyProperties.getInstance().getMsgAsociado(code);
    }

}
