package cn.edu.jnu.x2020101339;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowlingGameUnitTest {

    private Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @Test
    public void test1() throws Exception {
        setUp();
        roll(1,20);

        assertEquals(20, game.score());
    }
    public void  test2() throws Exception {
        setUp();
        roll(3, 20);

        assertEquals(60, game.score());
    }

    private void roll(int k, int times) {
        for(int i=0;i<times;i++){
            game.roll(k);
        }
    }
    public void  test3() throws Exception {
        setUp();
        rollspare();
        roll(1, 18);

        assertEquals(29, game.score());
    }

    private void rollspare() {
        game.roll(3);
        game.roll(7);
    }
}