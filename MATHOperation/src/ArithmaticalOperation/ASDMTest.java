package ArithmaticalOperation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ASDMTest {
	ASDM asdm = new ASDM();

	@Test
	public void AdditionTest() {

		int actualResult = asdm.sum(50, 50);
		System.out.println("Add Actual result" + actualResult);
		assertEquals(100, actualResult);
	}

	@Test
	public void SubTest() {

		int actualResult = asdm.Sub(50, 50);
		System.out.println("Sub Actual result" + actualResult);
		assertEquals(0, actualResult);
	}

	@Test
	public void DivTest() {
		int actualResult = asdm.Div(50, 50);
		System.out.println("Div Acutual Result" + actualResult);
		assertEquals(1, actualResult);
	}

//	@Test
//	public void MulTest() {
//
//		int actualResult = asdm.Mul(50, 50);
//		System.out.println("Mul Actual Result" + actualResult);
//		assertEquals(2500, actualResult);
//
//	}

}
