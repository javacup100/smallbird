package com.smallbird.backend.platform;

import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@SpringBootTest
@Listeners(MyTestResultListener.class)
class SmallBirdApplicationTests {

    @Test
    void contextLoads() {
//        System.out.println("hello");
        Assert.assertEquals(1,2);
    }

}
