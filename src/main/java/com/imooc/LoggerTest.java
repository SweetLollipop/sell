package com.imooc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SellApplication.class)
@Slf4j
public class LoggerTest {

//    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1() {
        String name = "imooc";
        String password = "123456";
        log.debug("debug...");
        log.info("name:" + name + ", password:" + password);
        log.info("name:{}, password:{}", name, password);
        log.error("error...");
        log.warn("warn...");
    }

}

