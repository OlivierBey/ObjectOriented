package operations;

import CalcEngineClass.CalculateBase;

public class Subtracter extends CalculateBase{

	@Override
	public void Calculate() {
		double value = getLeftVal()-getRightVal();
		setResult(value);
	}
}
