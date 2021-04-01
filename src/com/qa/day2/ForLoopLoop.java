package com.qa.day2;

public class ForLoopLoop {
	public static void forLoop(int inp) {
		for(int count = 0; count <= inp;count++) {
			int times = inp * count;
			System.out.println(inp + "*" + count + "=" + times);
		}
	}
}
