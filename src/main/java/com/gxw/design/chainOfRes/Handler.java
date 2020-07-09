package com.gxw.design.chainOfRes;

public interface Handler {
    /**
    *
    * 传入字符串，将其转换为需要的类型
    *
    */
    void comperMultiply(String number);

    /**
    *
    * 指定下一个处理者
    *
    */
    void setNextHandler(Handler hander);
}
