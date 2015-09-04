/**
 * 
 */
package part1;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

/**
 * @author 16neusta
 *
 */
public class EmailMerge {
	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		File template = new File("template.txt");
		File people = new File("people.txt");
		Scanner inputPeople = new Scanner(people);
		Scanner inputTemplate = new Scanner(template);
		
		ArrayList<String> usedNames = new ArrayList<String>();
		
		//Read Template in as an array list, each element is one line
		ArrayList<String> templateCopy = new ArrayList<String>();
		while(inputTemplate.hasNext()){
			templateCopy.add(inputTemplate.nextLine());
		}
		
		while (inputPeople.hasNext()) {
			String name = "";
			String age = "";
			String gender = "";
			if (inputPeople.hasNext()) {
				name = inputPeople.next();
			}
			if (inputPeople.hasNext()) {
				age = inputPeople.next();
			}
			if (inputPeople.hasNext()) {
				gender = inputPeople.next();
			}
			ArrayList<String> finalLetter = new ArrayList<String>(templateCopy);
			finalLetter.set(0,finalLetter.get(0).replace("<<N>>", name));
			finalLetter.set(2,finalLetter.get(2).replace("<<A>>", age));
			finalLetter.set(2,finalLetter.get(2).replace("<<G>>", gender));
			
			
			int numSameName = 0;
			for(String s: usedNames){
				if(s.equals(name))
					numSameName++;
			}
			String filename = "";
			if(numSameName == 0){
				filename = name+".txt";
			}else{
				filename = name+"-"+numSameName+".txt";
			}
			
			
			File outputLetter = new File(filename);
			PrintWriter output = new PrintWriter(new FileOutputStream(outputLetter));

			for (String s: finalLetter){
				output.println(s);
			}
			usedNames.add(name);
			output.close();
		}
		inputPeople.close();
		inputTemplate.close();
	}

}
