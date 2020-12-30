package com.cn;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GitCycApplicationTests {

    @Test
    void contextLoads() {
        int a=2;
        int b=3;
        int d=6;
        int c=a+b;
        System.out.println(c);
    }

}
