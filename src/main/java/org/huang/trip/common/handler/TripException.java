package org.huang.trip.common.handler;


import org.huang.trip.common.enums.ResultCodeEnum;

public class TripException extends RuntimeException{
    protected String code;
    protected String message;

    public TripException(){

    }

    public TripException(ResultCodeEnum codeEnum){
        super(codeEnum.msg());
        this.code = codeEnum.code();
        this.message = codeEnum.msg();
    }

    public TripException(ResultCodeEnum codeEnum, String msg){
        super(msg);
        this.code = codeEnum.code();
        this.message = msg;
    }
}
