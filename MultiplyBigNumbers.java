import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MultiplyBigNumbers {

	public static void main(String[] args) {
		int[] arrayA = readFromFileToArray("c:/test1.txt");
		int[] arrayB = readFromFileToArray("c:/test2.txt");
		int [] arrayC = multArrays(arrayA, arrayB);
		writeToFileFromArray(arrayC, "c:/result.txt");
		
	}
	
	public static int[] readFromFileToArray(String filePath){
		int[] array = {};
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
	       String text = br.readLine();
	       char[] charArray = text.toCharArray();
	       array = new int[charArray.length];
	       for(int i = 0; i < charArray.length; i++){
	    	   array[i] = (int) charArray[i] - 48;
	       }
		}
		catch (IOException e){
			e.printStackTrace();
		}
	    return array;
	}