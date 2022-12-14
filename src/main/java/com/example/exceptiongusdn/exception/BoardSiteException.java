package com.example.exceptiongusdn.exception;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BoardSiteException extends RuntimeException{

    private ErrorCode errorCode;

    private String message;


    @Override
    public String getMessage() {
        if (message == null) {
            return errorCode.getMessage();
        }
        return String.format("%s. %s" , errorCode.getMessage() , message);
    }
}
