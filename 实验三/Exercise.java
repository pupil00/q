package three;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;
import com.csvreader.CsvWriter;

public class Exercise{
	private ArrayList<Operation> exercise=new ArrayList();
	public void generate_Add_Exercise(int operationCount) {
		for(int i=0; i<operationCount; i++) {
		Add_Operation operation=new Add_Operation();
			while(contains1(operation,i-1)) {
		Add_Operation opOperation=new Add_Operation();
		operation=opOperation;
			}
			exercise.add(operation);
		}
	}
	public void generate_Sub_Exercise(int operationCount) {
		for(int i=0; i<operationCount; i++) {
		Sub_Operation operation=new Sub_Operation();
			while(contains2(operation,i-1)) {
		Sub_Operation opOperation=new Sub_Operation();
		operation=opOperation;
			}
			exercise.add(operation);
		}
	}	
		private boolean contains1(Add_Operation anOperation,int length) {
			boolean found=false;
			for(int i=0; i<=length; i++) {
				if(anOperation.equals(exercise.get(i))) {
					found=true;
					break;
				}
			}
			return found;
		}
		private boolean contains2(Sub_Operation operation,int length) {
			boolean found=false;
			for(int i=0; i<=length; i++) {
				if(operation.equals(exercise.get(i))) {
					found=true;
					break;
				}
			}
			return found;
		}
		public void FormateAndDisplay(int columnsPerRow) {
			for(int i=1; i<=exercise.size(); i++) {
				System.out.print(exercise.get(i-1)+"");
				if(i%columnsPerRow==0) {
					System.out.println();
				}
			}
		}
		void writeCSVAdditionExercise(int count,int number){
			try{
				String pathCSVWrite = "F:\\add_excise"+count+"_"+number+".csv";
				CsvWriter csvWriter = new CsvWriter(pathCSVWrite,',',Charset.forName("gb2312"));				
				for(int i=0;i<count;i++){
					String csvContent =exercise.get(i).toString();
					csvWriter.write(csvContent);
				}
				csvWriter.close();
				System.out.println("--------------完成写入操作-----分割线---------");
			}
			catch(IOException e){
				e.printStackTrace();
			}
			
		}
		void writeCSVSubExercise(int count,int number){
			try{
				String pathCSVWrite = "F:\\sub_excise"+count+"_"+number+".csv";
				CsvWriter csvWriter = new CsvWriter(pathCSVWrite,',',Charset.forName("gb2312"));				
				for(int i=0;i<count;i++){
					String csvContent =exercise.get(i).toString();
					csvWriter.write(csvContent);
				}
				csvWriter.close();
				System.out.println("----------------完成写入操作-----分割线---------");
			}
			catch(IOException e){
				e.printStackTrace();
			}
			
		}	
		public void writeSubCsvResult(int count, int number) {
			Operation op;
			try {
				String pathCSVWrite = "F:\\sub_result"+count+"_"+number+".csv";
				CsvWriter csvWriter = new CsvWriter(pathCSVWrite,',',Charset.forName("gb2312"));
				for (int i = 0; i < exercise.size(); i++) {
					op=exercise.get(i);
					csvWriter.write(op.getResult()+"");
				}
				csvWriter.flush();
				csvWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		public void writeAddCsvResult(int count, int number) {
			Operation op;
			try {
				String pathCSVWrite = "F:\\ad_result"+count+"_"+number+".csv";
				CsvWriter csvWriter = new CsvWriter(pathCSVWrite,',',Charset.forName("gb2312"));
				for (int i = 0; i < exercise.size(); i++) {
					op=exercise.get(i);
					csvWriter.write(op.getResult()+"");
				}
				csvWriter.flush();
				csvWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		public Exercise readCSVExercise(File aFile){
			Exercise exercise=new Exercise();
			String eqString;
			Operation op;
			try{
				Scanner sc=new Scanner(aFile);
				sc.useDelimiter(",");
				while (sc.hasNext()){
					eqString=sc.next().replaceAll("\\s", "");
					op=new Add_Operation();
					op.Constructor(eqString);
				    exercise.exercise.add(op);
				      }
		        }catch(IOException e){
		        	System.out.println("ERROR: "+e);
		        }
			return exercise;
        }
}
