package three;

 public class Add_Operation extends Operation {
	public Add_Operation(){
		Binary_Operation('+');
	}
	public boolean checkingCalculation(int Integer) {
		return Integer<=UPPER;
	}
	int calculate(int left,int right) {
		return left+right;
	}

}