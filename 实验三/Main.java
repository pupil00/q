package three;
import java.io.File;
 public class Main {
	public static void main(String[] args) {
		Exercise exercise=new Exercise();
		exercise.generate_Add_Exercise(50);
		exercise.writeCSVAdditionExercise(50,1);
		exercise.readCSVExercise(new File("F:\\ad_result_50_1.csv"));
		exercise.FormateAndDisplay(5);
		exercise.writeAddCsvResult(50,1);
		System.out.println("50道减法习题:");
		exercise.generate_Sub_Exercise(50);
		exercise.writeCSVSubExercise(50,1);
		System.out.println("从文件中读入结果：");
		exercise.readCSVExercise(new File("F:\\sub_result_50_1.csv"));
		exercise.FormateAndDisplay(5);
		exercise.writeSubCsvResult(50,1);
	}

}