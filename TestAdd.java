import junit.framework.*;

public class TestAdd extends TestCase {

    public void testAdd() {
        int sum = Calculator.add(1, 2);
        assertTrue(sum == 3);
    }
}