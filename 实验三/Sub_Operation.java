package three;

public class Sub_Operation extends Operation {
	public Sub_Operation(){
		Binary_Operation('-');
	}
	public boolean checkingCalculation(int anInteger) {
		return anInteger>=LOWER;
	}
	int calculate(int left,int right) {
		return left-right;
	}

}