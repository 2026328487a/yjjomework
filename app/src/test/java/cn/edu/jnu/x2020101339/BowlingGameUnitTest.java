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
    @Test
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
    @Test
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
    @Test
    public void  test4() throws Exception {
        setUp();
        rollstrike();
        game.roll(4);
        game.roll(4);
        roll(1, 16);

        assertEquals(42, game.score());
    }

    private void rollstrike() {
        game.roll(10);
    }

    @Test
    public void  test5() throws Exception {
        setUp();
        roll(10, 12);

        assertEquals(300, game.score());
    }
}