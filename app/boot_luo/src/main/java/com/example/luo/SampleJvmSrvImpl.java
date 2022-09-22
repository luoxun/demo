package com.example.luo;

import com.example.facade.SampleJvmSrv;

public class SampleJvmSrvImpl implements SampleJvmSrv {


    public SampleJvmSrvImpl(){}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    public SampleJvmSrvImpl(String message){
        this.message =  message;
    }


    @Override
    public String message() {
        return null;
    }
}
