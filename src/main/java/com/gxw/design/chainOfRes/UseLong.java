package com.gxw.design.chainOfRes;

public class UseLong implements Handler {
    private Handler handler;
    private long result=1;

    public void comperMultiply(String number) {
        try{
            long n = Long.parseLong(number);
            long i = 1;
            while(i<=n){
                result *=i;
                if(result<=0){
                    System.out.println("超出long的能力范围，long计算不了了");
                    handler.comperMultiply(number);
                    return;
                }
                i++;
            }
            System.out.println(number+"的阶乘"+result);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setNextHandler(Handler handler) {
        this.handler = handler;
    }
}

