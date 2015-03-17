package MainPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReturnTrueTest {

	@Test
	public void test() {
		assertTrue("Does not return true.", MyClass.ReturnTrue());
	}

}
