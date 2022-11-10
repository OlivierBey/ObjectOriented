package CalcEngineClass;
import static CalcEngineClass.MathEquation.*;

public class CalcEngine {
	 public static void main(String[] args) {
	        
         performCalculations();
	 }
    
     static void performCalculations() {
         double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
         double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
         char[] opCodes = {'d', 'a', 's', 'm'};
         
         
         
         MathEquation[] equations = new MathEquation[4];
//       
        
         for (int i = 0; i < opCodes.length; i++) {
        	
			equations[i]= new MathEquation(opCodes[i],leftVals[i], rightVals[i]);
			equations[i].execute();
			System.out.println(equations[i].getResult());
		}
       System.out.println("Average result = "+ MathEquation.getAverageResult());
       
       
       
    	
       double left = 9.0;
       double right= 4.0;
       MathEquation equationOverload = new MathEquation('d');
       equationOverload.execute(left,right);
       System.out.println("Overload results with doubles= "+ equationOverload.getResult());
       
       int leftInt = 9;
       int rightInt = 4;
       equationOverload.execute(leftInt,rightInt);
       System.out.println("Overload results with integers= "+ equationOverload.getResult());
       
       
       
     }
     
     //create is de naam van de method  van het type Mathequation
//     private static MathEquation create(double leftVal, double rightVal, char opCode){
//     	MathEquation equation = new MathEquation();
//     	equation = new MathEquation();
//     	equation.setLeftVal(leftVal);
//     	equation.setRightVal(rightVal);
//     	equation.setOpCode(opCode);
//     	return equation;
//     	}
     	
    
     	
     
     	
     	
     	
     	
     	
//         for (int i = 0; i < opCodes.length; i++) {
//             results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);
//         }
//         for (double currentResult : results)
//             System.out.println("result = " + currentResult);



      
    
     
//     static double execute(char opCode, double leftVal, double rightVal) {
//         double result;
//         switch (opCode) {
//             case 'a':
//                 result = leftVal + rightVal;
//                 break;
//             case 's':
//                 result = leftVal - rightVal;
//                 break;
//             case 'm':
//                 result = leftVal * rightVal;
//                 break;
//             case 'd':
//                 result = rightVal != 0 ? leftVal / rightVal : 0.0d;
//                 break;
//             default:
//                 System.out.println("Invalid opCode: " + opCode);
//                 result = 0.0d;
//                 break;
//         }
//         return result;
//     }





}

