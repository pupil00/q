package three;
import java.util.Random;
public abstract class Operation {
	static final int UPPER=100;
	static final int LOWER=0;
	public int left_operand=0,right_operand=0;
	private char operator='+';
	private int value=0;
	protected void Binary_Operation(char op) {
		int left,right,result;
		Random random=new Random();
		left=random.nextInt(UPPER+1);
		do {
			right=random.nextInt(UPPER+1);
			result=calculate(left,right);
		}while (!(checkingCalculation(result)));
		left_operand=left;
		right_operand=right;
		operator=op;
		value=result;
		}
	//子类必须实现的两个方法
	abstract boolean checkingCalculation(int anInteger);
	abstract int calculate(int left,int right);
	
	public boolean equals(Operation op) {
		return left_operand==op.getLeftOperand()&
				right_operand==op.getRightOperand()&
				operator==op.getOperator();
	}
	public void Constructor(String op){
		int length=op.length();
		int symbolOp=op.indexOf("+");
		operator='+';
		if(symbolOp<=0){
			symbolOp=op.indexOf("-");
			operator='-';
		}
		left_operand=Integer.parseInt((String) op.subSequence(0, symbolOp));
		right_operand=Integer.parseInt((String) op.subSequence(symbolOp+1, length-1));
	}
	public int getLeftOperand() {
		return left_operand;
	}
	public int getRightOperand() {
		return right_operand;
	}
	public char getOperator() {
		return operator;
	}
	public int getResult() {
		return value;
	}
	public String toString() {
		return ""+left_operand+operator+right_operand+"=";
	}
	public String fullString() {
		return ""+left_operand+operator+right_operand+"="+value;
	}
}