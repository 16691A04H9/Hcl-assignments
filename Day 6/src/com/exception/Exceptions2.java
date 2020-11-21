package com.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exceptions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int[] v = new int[n];
		BufferedReader in=null;
		FileReader f=null;
		
		try {
			 f = new FileReader("dati.txt");
			try {
			 in = new BufferedReader(f);
			}
			catch(Exception e)
			{
				System.out.println("dati.txt not existing");
			}
		} catch (Exception e) {
			System.out.println("Filenotfound exception");
		}
		finally {
		int i = 0;
		try
		{
		String linea = in.readLine();
		}
		catch(Exception e)
		{
			System.out.println("IO exception");
		}
		try
		{
		String linea = null;
		while (linea != null) {
			v[i] = Integer.parseInt(linea);
			linea = in.readLine();
			i++;
		}
		}
		catch(Exception e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception");
		}
		try
		{
		f.close();
		}
		catch(Exception e)
		{
			System.out.println("FileNotFound Exception");
		}
	}
}
}
