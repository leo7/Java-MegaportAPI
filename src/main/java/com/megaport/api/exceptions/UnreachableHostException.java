package com.megaport.api.exceptions;

/**
 * Created by adam.wells on 17/06/2016.
 */
public class UnreachableHostException extends RuntimeException{

    public UnreachableHostException(String message) {
        super(message);
    }

}
