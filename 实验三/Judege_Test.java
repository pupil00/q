package three;

import java.util.ArrayList;
public class Judege_Test {
	public static void main(String[] args) {
		Judege judge=new Judege();
		ArrayList<String[]> result=new ArrayList<String[]>();
		ArrayList<String[]> answer=new ArrayList<String[]>();
		result=judge.getResult("F:\\result.csv");
		answer=judge.getResult("F:\\answer.csv");
		judge.evaluate(answer, result);
		judge.CheckResult();
	}
}