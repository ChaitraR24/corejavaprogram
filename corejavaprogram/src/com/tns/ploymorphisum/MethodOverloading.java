package com.tns.ploymorphisum;

class StudentResult{
	void calculateresult(int java,int html,int css) {
		System.out.println("First student result : ");
		int result = java + html + css;
		System.out.println(result);
	}
	
	void calculateresult(double java,double html, double css) {
		System.out.println("second student result");
		double result = java + html + css;
		System.out.println(result);
	}
	
	void calculateresult(int java,int css) {
		System.out.println("Third student result");
		int result = java + css;
		System.out.println(result);
	}
	
	void calculateresult(String name,int roolno,int java,int css,int html) {
		System.out.println("Fourth Student");
		int result = java + css + html;
		System.out.println("Name : " +name);
		System.out.println("Roll No : " +roolno);
		System.out.println(result);
	}
}

public class MethodOverloading {
public static void main(String[] args) {
	StudentResult studentResult = new StudentResult();
	studentResult.calculateresult(90, 70, 98);
	studentResult.calculateresult(90,100 );
	studentResult.calculateresult(2, 3.4, 78);
	studentResult.calculateresult("tanvi", 101, 90, 100, 98);
}
}
