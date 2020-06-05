package exercise;

import static org.junit.Assert.*;

import org.junit.Test;

public class newtriangleTest {
	newtriangle newtriangle = new newtriangle();

	@Test
	public void case1() {
		assertEquals("tri", newtriangle.triangle(3, 7, 8));
	}

//	@Test
//	public void case2() {
//		assertEquals("等腰三角形", newtriangle.triangle(3, 3, 5));
//	}
//
//	@Test
//	public void case3() {
//		assertEquals("三角形", newtriangle.triangle(3, 4, 6));
//	}
//
//	@Test
//	public void case4() {
//		assertEquals("直角三角形", newtriangle.triangle(3, 4, 5));
//	}
//
//	@Test
//	public void case5() {
//		assertEquals("等腰直角三角形", newtriangle.triangle(Math.sqrt(2), Math.sqrt(2), 2));
//	}
//
//	@Test
//		public void case6() {
//			assertEquals("正三角形", newtriangle.triangle(3, 3, 3));
//		}
}
