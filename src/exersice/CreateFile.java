package exersice;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\Deena(Dd)\\Desktop\\new.txt");
		if(f.createNewFile())
		{
			System.out.println("File Created Successfully...");
		}
		else 
		{
			System.out.println("File Already Exist");
		}

	}
}
