package top.klovis.statepattern;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by klovis on 2018/7/11.
 */
public class ContextTest {
    @Test
    public void test() {
        Context context = new Context();
        context.init();
        context.start();
        context.end();
        context.init();

        System.out.println();
        context.init();
        context.end();
    }
}