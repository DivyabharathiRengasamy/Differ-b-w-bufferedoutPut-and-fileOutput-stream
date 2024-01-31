package com.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		long startTime = System.currentTimeMillis();
		
		FileOutputStream fout=new FileOutputStream("C:\\Users\\LENOVO\\Desktop\\java\\divya.txt");
		fout.write(25);
		System.out.println("sucess");
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;

		System.out.println("Execution Time:  for fout " + executionTime + " milliseconds");
		
		double startTimes = System.currentTimeMillis();
		
		BufferedOutputStream bf=new BufferedOutputStream(fout);
		
		double endTimes = System.currentTimeMillis();
		double executionTimes = endTimes - startTimes;

		System.out.println("Execution Time: for bf " + executionTimes + " milliseconds");
		
		fout.close();
		bf.close();
		
	}

}
