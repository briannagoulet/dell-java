import java.util.Scanner;

public class Statistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please give me a list of numbers separated by commas: ");
		Scanner reader = new Scanner(System.in);
		String numberList = reader.nextLine();
		reader.close();
	    String[] numberListArray = numberList.split(", ");
	    
	    Integer[] intArray = new Integer[numberListArray.length];
	    for (int i = 0; i < numberListArray.length; i++) {
	        Integer num = Integer.parseInt(numberListArray[i]);
	        intArray[i] = num;
	    }
	    System.out.println("Max value: " + getMaxValue(intArray));
	    System.out.println("Min value: " + getMinValue(intArray));
	    System.out.println("Number of elements: " + getLength(intArray));
	    System.out.println("Average: " + getAverage(intArray));
	    System.out.println("Sum: " + getSum(intArray));
	}
	
	public static int getMaxValue (Integer[] numbers) {
		int maxValue = numbers[0];
		for(int i=1;i<numbers.length;i++){
			if(numbers[i] > maxValue){
				maxValue = numbers[i];
			}
		} 
		return maxValue;
	}
	
	public static int getMinValue (Integer[] numbers) {
		int minValue = numbers[0];
		for(int i=1;i<numbers.length;i++){
			if(numbers[i] < minValue){
				minValue = numbers[i];
			}
		} 
		return minValue;
	}
	
	public static int getLength (Integer[] numbers) {
		int length = numbers.length;
		return length;
	}
	
	public static double getAverage (Integer[] numbers) {
		double sum = 0;
		for (int i=0;i<numbers.length;i++) {
			sum = sum + numbers[i];
		}
		double average = sum / numbers.length;
		return average;
	}
	
	public static int getSum (Integer[] numbers) {
		int sum = 0;
		for (int i=0;i<numbers.length;i++) {
			sum = sum + numbers[i];
		}
		return sum;
	}

}
	
	
