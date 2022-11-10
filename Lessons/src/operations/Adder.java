package operations;

import CalcEngineClass.CalculateBase;

public class Adder extends CalculateBase {

	@Override
	public void Calculate() {		//polymorphism/ dezelfde naam vd methode in een andere class geeft een ander object en ander result
		double value = getLeftVal()+getRightVal();
		setResult(value);
	}
	
}
