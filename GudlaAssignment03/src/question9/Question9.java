package question9;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question9 {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("myfile.txt");
			     BufferedReader br = new BufferedReader(new InputStreamReader(fis))) {
			    String line;
			    while ((line = br.readLine()) != null) {
			        System.out.println(line);
			    }
			} catch (IOException e) {
			    // Handle the exception
			}
	}
}
