package com.vfislk.training;

public class Student {
public int calcTotal(int m1,int m2,int m3) throws NegValueException,InvalidNumException{
	if(m1<0||m2<0||m3<0) {
		throw  new NegValueException ("Marks should be greater than zero");
	}
	
if(m1>100||m2>100||m3>100){
	throw new InvalidNumException("Marks should be greater than zero");
}
return m1+m2+m3;
}
public String getGrade(int[]marks) throws InvalidNumException {
	int sum=0;
	String grade  = null;
	if(marks == null)
		// return "marks" not initialized
		return null;
	for(int mark : marks) {
		if(mark<0 || mark>100)
			throw new InvalidNumException();
		sum = sum+mark;
	}
	int avg=0;
	avg=sum/marks.length;
	
	if( avg >=90) 
		grade= "A";
	
	 if( avg >80 && avg <=90) 
		grade= "B";
	
	 if(avg >70 && avg <=80) 
		grade= "C";
	
	 if (avg >60 && avg <=70)
		 
		grade= "D";
	 if(avg >50 && avg<=60)
		 grade = "E";
	if(avg < 50)
		grade = "fail";
	
	return grade;

}
}