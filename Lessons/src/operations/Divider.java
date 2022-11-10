package operations;

import CalcEngineClass.CalculateBase;

public class Divider extends CalculateBase{

	@Override
	public void Calculate() {
		double value = getRightVal() != 0 ? getLeftVal() / getRightVal() : 0.0d;
		setResult(value);
	}
}
