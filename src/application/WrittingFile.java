/*
 * FileWriter() e BufferesWriter()
 */
package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WrittingFile {

	public static void main(String[] args) {

		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path = "c:\\temp\\out.txt";
		String path1 = "c:\\temp\\out1.txt";
		
		try (	BufferedWriter bw = new BufferedWriter(new FileWriter(path));	//rewrite
				BufferedWriter bw1 = new BufferedWriter(new FileWriter(path1, true))	//add to the file
				) {
			
			for(String line : lines) {
				bw.write(line);
				bw.newLine(); 	//quebra de linha
				bw1.write(line);
				bw1.newLine();	//quebra de linha
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Criado arquivos: out.txt e out1.txt");
		}
		
		
	}//main(-)

}//class(-)
