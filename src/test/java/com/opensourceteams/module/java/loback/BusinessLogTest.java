package com.opensourceteams.module.java.loback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BusinessLogTest {


    static Logger businessLog = LoggerFactory.getLogger("businessFile");

    public static void main(String[] args) {


        businessLog.error("error信息");
        businessLog.debug("debug信息");
        businessLog.info("INFO信息");



        businessLog.info("INFO信息{},{}","第一个参数","第二个参数");



    }
}
