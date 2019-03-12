import java.util.Scanner;
//import java.util.ArrayList;
import java.util.HashMap;

public class GradeBook {
	
	static HashMap<String, String> gradeBook = new HashMap<String, String>();
	static HashMap<String, Double> averageGrades = new HashMap<String, Double>();
	//static String grades;
	
	public static void main(String[] args) {
	// Create a HashMap to store names and grades
	inputGrades();
	makeStringArray();
	printGrades();
	}
	
	public static void inputGrades() {
		Scanner reader = new Scanner(System.in);
		System.out.println("How many students will be in the grade book?");
		Integer numberOfStudents = reader.nextInt();
		reader.nextLine();
		for (int i=0; i<numberOfStudents; i++) {
			
			System.out.println("What is the student's name?");
			String name = reader.nextLine();
			System.out.println("What are the grades separated by a comma?");
			String grades = reader.nextLine();
			
			// Add user's name and grades to HashMap
			gradeBook.put(name, grades);
		}
		reader.close();
	}
	
	//make an array of strings out of hash map
	public static void makeStringArray() {
		String[] listOfStudents = (String[]) gradeBook.keySet().toArray(new String[0]);
		String[] listOfAllGrades = (String[]) gradeBook.values().toArray(new String[0]);
		
		for(int i=0; i<listOfAllGrades.length; i++) {
			//take each student's grades and split them into separate strings of each person's grades
			String grades = listOfAllGrades[i];
			//make the grades into an array of strings
			String[] stringArray = grades.split(",");
			
			//convert array of strings into array of integers
			Integer[] intArray = new Integer[stringArray.length];
		    for (int j = 0; j < intArray.length; j++) {
		        Integer num = Integer.parseInt(stringArray[j]);
		        intArray[j] = num;
		    }
		    
		    //compute the average
		    double sum = 0;
			for (int k=0;k<intArray.length;k++) {
				sum = sum + intArray[k];
			}
			double average = sum / intArray.length;
			averageGrades.put(listOfStudents[i], average);
		}
	
	}
	
	public static void printGrades() {
		String[] listOfStudents = (String[]) averageGrades.keySet().toArray(new String[0]);
		Double[] listOfAverages = (Double[]) averageGrades.values().toArray(new Double[0]);
		
		for (int i = 0; i < listOfStudents.length; i++) {
	        String currentName = listOfStudents[i];
	        double currentAvg = listOfAverages[i];

	        System.out.println(currentName + "'s grade average: " + currentAvg);
		}
	}
	
}

