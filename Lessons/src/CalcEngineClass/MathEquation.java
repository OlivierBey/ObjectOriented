package CalcEngineClass;

public class MathEquation {

	//fields
		private double leftVal;	//state of data
		private double rightVal;	//private omdat encapsulatie: niet zichtbaar of aanpasbaar door gebruikers
		private char opCode;
		private double result;
		private static double amountOfCalculations;
		private static double totalResult;
		

	//constructors	
		public MathEquation(char opCode) {
			this.opCode= opCode;
		}
		public MathEquation(char opCode, double leftVal, double rightVal) {
			this(opCode);
			this.leftVal=leftVal;
			this.rightVal= rightVal;
		}
	//methods	
		public static double getAverageResult() {
			return totalResult/amountOfCalculations;
		}
		
		public double getLeftVal() {
			return leftVal;
		}
		public void setLeftVal(double leftVal) {
			this.leftVal = leftVal;
		}
		public double getRightVal() {
			return rightVal;
		}
		public void setRightVal(double rightVal) {
			this.rightVal = rightVal;
		}
		public char getOpCode() {
			return opCode;
		}
		public void setOpCode(char opCode) {
			this.opCode = opCode;
		}
		public double getResult() {
			return result;
		}
		public void setResult(double result) {
			this.result = result;
		}
		public static void avgResult() {
			
		}
	
	public void execute(double leftVal, double rightVal){
		this.leftVal=leftVal;
		this.rightVal=rightVal;	
		execute();
	}

	public void execute(int leftVal, int rightVal){
		this.leftVal=(double)leftVal;
		this.rightVal=(double)rightVal;	
		execute();
	}
	
	
	public void execute() {	//methode
		
		switch (opCode) {
        case 'a':
            result = leftVal + rightVal;
            break;
        case 's':
            result = leftVal - rightVal;
            break;
        case 'm':
            result = leftVal * rightVal;
            break;
        case 'd':
            result = rightVal != 0 ? leftVal / rightVal : 0.0d;
            break;
        default:
            System.out.println("Invalid opCode: " + opCode);
            result = 0.0d;
            break;
		}
		setAmountOfCalculations(getAmountOfCalculations() + 1);
		setTotalResult(getTotalResult() + result);
	
	
	}
	public static double getAmountOfCalculations() {
		return amountOfCalculations;
	}
	public static void setAmountOfCalculations(double amountOfCalculations) {
		MathEquation.amountOfCalculations = amountOfCalculations;
	}
	public static double getTotalResult() {
		return totalResult;
	}
	public static void setTotalResult(double totalResult) {
		MathEquation.totalResult = totalResult;
	}
	
	
	
	
	
	
	
}
