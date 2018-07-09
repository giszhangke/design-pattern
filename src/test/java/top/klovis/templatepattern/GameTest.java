package top.klovis.templatepattern;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by klovis on 2018/7/9.
 */
public class GameTest {
    @Test
    public void testTemplate() {
        Game football = new Football();
        Game billiards = new Billiards();

        football.play();
        billiards.play();
    }
}