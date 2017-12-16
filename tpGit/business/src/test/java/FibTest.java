import org.junit.Test;

import org.junit.Assert;

public class FibTest {
	@Test
	public void fibJUnitTest() {
        Assert.assertEquals(1, Fibonacci.fib(1));
        Assert.assertEquals(1, Fibonacci.fib(2));
        Assert.assertEquals(2, Fibonacci.fib(3));
        Assert.assertEquals(3, Fibonacci.fib(4));
        Assert.assertEquals(5, Fibonacci.fib(5));
    }
	
	@Test
	public void fibNegativeJUnitTest() {
		Assert.assertEquals(-1, Fibonacci.fib(-1));
        Assert.assertEquals(-96, Fibonacci.fib(-96));
        Assert.assertEquals(0, Fibonacci.fib(0));
	}
}
