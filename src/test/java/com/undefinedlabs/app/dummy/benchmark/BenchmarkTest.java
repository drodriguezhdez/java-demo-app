package com.undefinedlabs.app.dummy.benchmark;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.results.RunResult;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

public class BenchmarkTest {

    private static final String SAMPLE_TEXT = "sampleTest";

    //@Test
    public void dummy_execute_JMH_TestMD5() throws RunnerException {
        final Options opt = new OptionsBuilder()
                .include(BenchmarkTestMD5.class.getSimpleName())
                .mode(Mode.SingleShotTime)
                .forks(1)
                .build();

        final Collection<RunResult> runResults = new Runner(opt).run();
        assertThat(runResults).isNotEmpty();
    }

    public static class BenchmarkTestMD5 {
        @Benchmark
        public void benchmark_digest_MD5(){
            DigestUtils.md5Hex(SAMPLE_TEXT);
        }
    }

    //@Test
    public void dummy_execute_JMS_TestSHA1() throws RunnerException {
        final Options opt = new OptionsBuilder()
                .include(BenchmarkTestSHA1.class.getSimpleName())
                .mode(Mode.SingleShotTime)
                .forks(1)
                .build();

        final Collection<RunResult> runResults = new Runner(opt).run();
        assertThat(runResults).isNotEmpty();
    }

    public static class BenchmarkTestSHA1 {
        @Benchmark
        public void benchmark_digest_SHA1_benchmark(){
            DigestUtils.sha1Hex(SAMPLE_TEXT);
        }
    }

    //@Test
    public void dummy_execute_JMH_TestSHA384() throws RunnerException {
        final Options opt = new OptionsBuilder()
                .include(BenchmarkTestSHA384.class.getSimpleName())
                .mode(Mode.SingleShotTime)
                .forks(1)
                .build();

        final Collection<RunResult> runResults = new Runner(opt).run();
        assertThat(runResults).isNotEmpty();
    }

    public static class BenchmarkTestSHA384 {
        @Benchmark
        public void benchmark_digest_SHA384(){
            DigestUtils.sha384(SAMPLE_TEXT);
        }
    }

    //@Test
    public void dummy_execute_JMH_TestSHA512() throws RunnerException {
        final Options opt = new OptionsBuilder()
                .include(BenchmarkTestSHA512.class.getSimpleName())
                .mode(Mode.SingleShotTime)
                .forks(1)
                .build();

        final Collection<RunResult> runResults = new Runner(opt).run();
        assertThat(runResults).isNotEmpty();
    }

    public static class BenchmarkTestSHA512 {
        @Benchmark
        public void benchmark_digest_SHA512_benchmark(){
            DigestUtils.sha512(SAMPLE_TEXT);
        }
    }

    //@Test
    public void dummy_execute_JMH_TestMD2() throws RunnerException {
        final Options opt = new OptionsBuilder()
                .include(BenchmarkTestMD2.class.getSimpleName())
                .mode(Mode.SingleShotTime)
                .forks(1)
                .build();

        final Collection<RunResult> runResults = new Runner(opt).run();
        assertThat(runResults).isNotEmpty();
    }

    public static class BenchmarkTestMD2 {
        @Benchmark
        public void benchmark_digest_MD2(){
            DigestUtils.md2Hex(SAMPLE_TEXT);
        }
    }
}
