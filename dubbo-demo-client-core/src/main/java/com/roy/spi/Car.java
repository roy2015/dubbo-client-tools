package com.roy.spi;

import com.alibaba.dubbo.common.extension.SPI;


/**
 * 测试下dubbo的SPI
 */
@SPI("ferrari")
public interface Car {

    void dragRacing (long speed);
}
