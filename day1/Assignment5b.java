/*Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively, write two programs to swap the values of the two variables.*/
/*  second program without using any third variable*/
class Assignment5a{
	public static void main(String []args){
		int value1=6;
		int value2=8;
		System.out.println("Before Swapping Of Two Numbers : ");
		System.out.println("value1 : "+value1+"\n"+"value2 : "+value2);
		value1=value1+value2;
		value2=value1-value2;
		value1=value1-value2;
		System.out.println("After Swapping Of Two Numbers : ");
		System.out.print("value1 : "+value1+"\n"+"value2 : "+value2);
	}
}
		