package com.io;

import java.io.PipedReader;
import java.io.PipedWriter;

public class PipeReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			final PipedReader read = new PipedReader();
			final PipedWriter write = new PipedWriter(read);

			Thread readerThread = new Thread(new Runnable() {
				public void run() {
					try {
						int data = read.read();
						while (data != -1) {
							System.out.print((char) data);
							data = read.read();
						}
					} catch (Exception ex) {
					}
				}
			});

			Thread t2 = new Thread(new Runnable() {
				public void run() {
					try {

						write.write("I love my country\n".toCharArray());
					} catch (Exception ex) {
					}
				}
			});

			readerThread.start();
			t2.start();
			//t2.sleep(4000);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
