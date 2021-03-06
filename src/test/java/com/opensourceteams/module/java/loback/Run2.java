package com.opensourceteams.module.java.loback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Run2 {


    static Logger logger = LoggerFactory.getLogger(Run2.class);
    static Logger businessLog = LoggerFactory.getLogger("businessFile");

    public static void main(String[] args) {

        logger.info("INFO信息");
        logger.debug("DEBUG信息");
        logger.error("ERROR信息");
        businessLog.error("error信息");
        businessLog.debug("debug信息");
        businessLog.info("INFO信息");
    }
}
