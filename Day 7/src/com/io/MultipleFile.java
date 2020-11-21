package com.io;

//import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class MultipleFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fo = null;
		FileOutputStream fo1 = null;
		FileOutputStream fo2 = null;
		Scanner s = new Scanner(System.in);
		System.out.println("enter a string:");
		String s1 = s.nextLine();
		try {
			fo = new FileOutputStream("abc.txt");
			byte b[] = s1.getBytes();
			fo.write(b);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fo.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("H:\\java\\day 8\\abc.txt");
			int i;
			String s2 = "";
			while ((i = fis.read()) != -1) {
				fo1 = new FileOutputStream("1.txt");
				fo2 = new FileOutputStream("2.txt");
				//char b=(char) i;
				s2=s2+(char)i;
				byte[] b=s2.getBytes();
				fo1.write(b);
				fo2.write(b);
			}
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				fo.close();
				fis.close();
				fo1.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
