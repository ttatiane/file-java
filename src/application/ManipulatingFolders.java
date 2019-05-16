package application;

import java.io.File;
import java.util.Scanner;

public class ManipulatingFolders {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// Lista de pastas
		System.out.print("Enter a folder path:> ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		System.out.println("----------------------------");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		//lista de arquivos
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		System.out.println("----------------------------");
		for(File file : files) {
			System.out.println(file);
		}
		
		//criando subpasta
		boolean success = new File(strPath + "\\subfolder").mkdir();
		System.out.println("----------------------------");
		System.out.println("Directory created success: " + success);
		
		sc.close();
	}//main(-)

}//class(-)
