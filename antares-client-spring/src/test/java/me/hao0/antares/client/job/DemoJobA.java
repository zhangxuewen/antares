package me.hao0.antares.client.job;

import me.hao0.antares.common.util.Sleeps;
import java.util.Random;

/**
 * Author: haolin
 * Email:  haolin.h0@gmail.com
 */
public class DemoJobA implements DefaultJob {

    private final Random random = new Random();

    @Override
    public JobResult execute(JobContext context) {
        System.out.println("DemoJobA start...");
        System.out.println("context: " + context);

        Sleeps.sleep(random.nextInt(10) + 1);

        System.out.println("DemoJobA end...");

        return JobResult.SUCCESS;
    }
}
