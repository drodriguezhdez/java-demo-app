package com.undefinedlabs.app.dummy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.ThreadLocalRandom;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

//@Ignore
//@RunWith(Parameterized.class)
public class QuickLogicTest {

    private static final int SIZE = 50;

    //@Parameterized.Parameters
    public static Collection<Object[]> data() {
        final Long[][] waitTimes = new Long[SIZE][];
        for(int i = 0; i < SIZE; i++) {
            waitTimes[i] = new Long[]{ ThreadLocalRandom.current().nextLong(1000) };
        }

        return Arrays.asList(waitTimes);
    }

    private Long waitTime;

    public QuickLogicTest(final Long waitTime) {
        this.waitTime = waitTime;
    }

    //@Test
    public void dummy_should_execute_quick_logic() throws InterruptedException {
        Thread.sleep(this.waitTime);
        assertThat(true).isTrue();
    }

}
