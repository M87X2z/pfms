package cn.org.xinke;

import org.apache.tika.Tika;
import org.junit.Ignore;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2019-01-07 下午 2:22.
 */
@Ignore
public class Test {

    @org.junit.Test
    public void test() throws IOException {
        Tika tika = new Tika();
        String detect = tika.detect(new File("C:\\EasyFS\\2018\\12\\26\\a0e0bffa077b4218a0739433439521e2.jpg"));
        System.out.println(detect);
    }
}
