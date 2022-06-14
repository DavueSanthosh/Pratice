package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Handling {

	String path;
	
	Scanner scan=new Scanner(System.in);

	
	public void write() {
		
		
		System.out.println("Enter The text file name");
		String filename = scan.nextLine();
	
	     String filePath = System.getProperty("user.dir");
         path= filePath+File.separator+ filename;	
     	
         File file=new File(path);
	
         try {
			boolean createNewFile = file.createNewFile();
			
			boolean exists = file.exists();
			
			System.out.println("File is present or Not:"+exists);
		
			FileWriter fileWriter=new FileWriter(path);
			BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
			
			int length;
			
			System.out.println("Enter the Length");
			 length = scan.nextInt();
			 scan.nextLine();
			
			for (int index = 0; index <length; index++) {
				
				bufferedWriter.write(scan.nextLine());
				bufferedWriter.newLine();
			
			}
			
			
			bufferedWriter.flush();
			bufferedWriter.close();
         }
         catch (IOException Exception1) 
         {
		
        	 System.out.println("IO Exception");
		 }
	}
	
	public void read() {
		
		try {
			
			FileReader fileReader=new FileReader(path);
			BufferedReader bufferedReader=new BufferedReader(fileReader);
			String line = bufferedReader.readLine();
			
			while(line != null) {
				
				System.out.println(line);
				 line = bufferedReader.readLine();
				
			}
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	
	}
	public static void main(String[] args) {
		Handling hand=new Handling();
		hand.write();
		hand.read();
	}
}
