import static org.junit.Assert.*;

import org.junit.Test;

public class TriTest {

	@Test
	public void test1() throws Exception {
		Tri t = new Tri();
		assertEquals("���y�T����",t.triangle(2, 2, 3));
	}

}
