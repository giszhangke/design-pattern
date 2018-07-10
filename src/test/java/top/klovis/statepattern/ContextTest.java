package top.klovis.statepattern;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by klovis on 2018/7/11.
 */
public class ContextTest {
    Context context = new Context();
    @Test
    public void test() {
        context.init();
        context.start();
        context.end();
        context.init();

        System.out.println();
        context.init();
        context.end();
    }
}