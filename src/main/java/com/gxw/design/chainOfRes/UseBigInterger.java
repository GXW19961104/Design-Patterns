package com.gxw.design.chainOfRes;

import java.math.BigInteger;

public class UseBigInterger implements Handler{
    private Handler handler;
    private BigInteger result=new BigInteger("1");

    public void comperMultiply(String number) {
        try{
            BigInteger n =new BigInteger(number);
            BigInteger one =new BigInteger("1");
            BigInteger i = one ;
            while(i.compareTo(n)<=0){
                result =result.multiply(i);
                i = i.add(one);
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
