package application;

import java.io.File;
import java.util.Scanner;

public class FilePathInfo {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter a file path:> ");
			System.out.println("-------------------------------");
			String strPath = sc.nextLine();
			
			File path = new File(strPath);
			
			//accessing file name
			System.out.println("getname: " + path.getName());
			
			//accessing parent path file
			System.out.println("getParent: " + path.getParent());
			
			//accessing complete path file
			System.out.println("getPath: " + path.getPath());
			
		sc.close();
	}//main(-)

}//class(-)
