package com.gxw.design.chainOfRes;

public class HandlerTest {
    public static void main(String[] args) {
        Handler useInt,useLong,useBig;
        useInt = new UseInt();
        useLong = new UseLong();
        useBig = new UseBigInterger();
        useInt.setNextHandler(useLong);
        useLong.setNextHandler(useBig);
        useInt.comperMultiply("5");
        useInt.comperMultiply("19");
        useInt.comperMultiply("30");
    }
}
