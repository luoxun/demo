package com.example.luo;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.example.facade.SampleJvmSrv;

// @SofaService
public class SampleJvmSrvImpl implements SampleJvmSrv {

    public SampleJvmSrvImpl() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        System.out.println("setMessagesetMessagesetMessagesetMessagesetMessagesetMessagesetMessagesetMessage");
        this.message = message;
    }

    private String message;

    public SampleJvmSrvImpl(String message) {
        System.out.println(
                "11111111SampleJvmSrvImplSampleJvmSrvImplSampleJvmSrvImplSampleJvmSrvImplSampleJvmSrvImplSampleJvmSrvImpl11111");
        this.message = message;
    }

    @Override
    public String message() {
        return this.message;
    }
}
