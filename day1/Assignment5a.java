/*Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively, write two programs to swap the values of the two variables.*/
/*A - first program by using a third variable*/
class Assignment5a{
	public static void main(String []args){
		int value1=6;
		int value2=8;
		int temp;
		System.out.println("Before Swapping Of Two Numbers : ");
		System.out.println("value1 : "+value1+"\n"+"value2 : "+value2);
		temp=value1;
		value1=value2;
		value2=temp;
		System.out.println("After Swapping Of Two Numbers : ");
		System.out.print("value1 : "+value1+"\n"+"value2 : "+value2);
	}
}
		