import junit.framework.*;

public class TestSub extends TestCase {

    public void testSub() {
        int sum = Calculator.sub(1, 2);
        assertTrue(sum == -1);
    }
}