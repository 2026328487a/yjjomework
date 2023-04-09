package cn.edu.jnu.x2020101339;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowlingGameUnitTest {
    @Test
    public void test1()
    {
        Game game =new Game();
        for(int i=0;i<20;i++){
            game.roll(1);
        }

        assertEquals(20, game.score());
    }
}