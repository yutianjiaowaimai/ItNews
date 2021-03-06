package com.xinyang.read.http.exception;


/**
 * api异常
 *
 * @author xinyang
 */
public class ApiException extends RuntimeException implements IApiException {

    private int mResultCode;
    private String mMessage;

    public ApiException(int resultCode, String message) {
        mResultCode = resultCode;
        mMessage = message;
    }

    @Override
    public int getResultCode() {
        return mResultCode;
    }

    @Override
    public String getMessage() {
        return mMessage;
    }

}

