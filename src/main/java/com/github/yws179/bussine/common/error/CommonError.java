package com.github.yws179.bussine.common.error;

/**
 * @author yws
 * @date 2019/04/24
 */
public interface CommonError {

    int getErrorCode();

    String getErrMsg();

    CommonError setErrMsg(String errMsg);

}