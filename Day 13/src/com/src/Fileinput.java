package com.src;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Fileinput {
		FileOutputStream fos=null;
		public void files(String name)
		{
		try
		{
			String s=name;
			//System.out.println("enter file name");
			//s=sc.next();
			String filename=s+".txt";
			fos=new FileOutputStream(filename);
			byte[] b=s.getBytes();
			fos.write(b);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
