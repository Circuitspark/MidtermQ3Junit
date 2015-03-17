package MainPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTwoNumbersTest {

	@Test
	public void test() {
		assertEquals("Does not add properly.", 4, MyClass.AddTwoNumbers(2, 2));
	}

}
