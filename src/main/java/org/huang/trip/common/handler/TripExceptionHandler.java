package org.huang.trip.common.handler;

import org.huang.trip.common.enums.ResultCodeEnum;
import org.huang.trip.common.model.vo.RestVo;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TripExceptionHandler {
    @ExceptionHandler(value = TripException.class)
    public RestVo handleSimpleException(TripException e){
        e.printStackTrace();
        return RestVo.failedVo(e.code,e.getMessage());
    }

    @ExceptionHandler(value = Exception.class)
    public RestVo handleException(Exception e){
        e.printStackTrace();
        return RestVo.failedVo(ResultCodeEnum.FAILED);
    }
}
