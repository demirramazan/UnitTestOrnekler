package com.ramazan;

import org.junit.Test;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by ramazan on 14.04.2017.
 */
public class CustomerFileTest {
    @Test
    public void testFile() throws Exception {
        File file=new File("C:\\Users\\ramazan\\IdeaProjects\\UnitTestOrnekler\\src\\main\\resources\\text.txt");

        assertThat(file).exists().canRead().canWrite().hasExtension("txt").hasName("text.txt");

    }

//    @Test
//    public void textExFile() throws Exception {
//
//        Exception exception=new MailServerUnavailableException("test");
//    }
}
