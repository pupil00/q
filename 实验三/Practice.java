package three;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;
import com.csvreader.CsvWriter;
public class Practice {
	public static int num=50;
	private Integer result[]=new Integer[num];
	public void write_Result(){//从屏幕输入算式结果
		Scanner input=new Scanner(System.in);
		System.out.println("输入你的答案：");
		for (int i = 0; i < result.length; i++) {
			result[i]=input.nextInt();
		}

		input.close();
	}
	public void writeCSVPractice(int operationCount, int number) {//写的算式答案写入编号为number的文件中
		try {
			String pathCSVWrite = "F:\\practice_"+operationCount+"_"+number+".csv";
			CsvWriter csvWriter = new CsvWriter(pathCSVWrite,',',Charset.forName("gb2312"));
			for (int i = 0; i < result.length; i++) {
				csvWriter.write(result[i]+"");
			}
			csvWriter.flush();
			csvWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Exercise exercises=new Exercise();
		Practice practice=new Practice();
		System.out.println("50道加法习题为:");
		exercises.readCSVExercise(new File("F:\\Addition_exercise_50_1.csv"));
		exercises.FormateAndDisplay(5);
		practice.write_Result();
		practice.writeCSVPractice(50,1);
	}
}