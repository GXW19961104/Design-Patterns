package com.gxw.design.chainOfRes;

import javax.annotation.Resource;

public class UseInt implements Handler{

    private Handler handler;
    private int result=1;

    public void comperMultiply(String number) {
        try{
            int n =Integer.parseInt(number);
            int i=1;
            while(i<=n){
                result*=i;
                if(result<=0){
                    System.out.println("超出int的能力范围，int计算不了");
                    handler.comperMultiply(number);
                    return;
                }
                i++;
            }
            System.out.println(number+"的阶乘"+result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void setNextHandler(Handler hander) {
            this.handler=hander;
    }
}
