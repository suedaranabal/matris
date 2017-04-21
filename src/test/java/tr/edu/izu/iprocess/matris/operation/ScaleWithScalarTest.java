package tr.edu.izu.iprocess.matris.operation;

import tr.edu.izu.iprocess.matris.impl.IntegerMatris;
import junit.framework.TestCase;

public class ScaleWithScalarTest extends TestCase {

	private IntegerMatris matris = null;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		matris = new IntegerMatris(3, 3);
	}

	private void assertAllValue(IntegerMatris m, Integer value) {
		for (int i = 0; i < m.getRowsCount(); i++)
			for (int j = 0; j < m.getColumnsCount(); j++)
				assertTrue(value == m.getValue(i, j));
	}

	public void testSumWithNegativeScalar() {
		try {
			matris.sumWithScalar(-1);
			assertAllValue(matris, -1);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void testSumWithScalar() {
		try {
			matris.sumWithScalar(3);
			assertAllValue(matris, 3);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
