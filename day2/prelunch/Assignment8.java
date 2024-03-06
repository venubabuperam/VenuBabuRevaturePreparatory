/*A three digit number is called Armstrong number if sum of cube of its digit is equal to number itself.*/
class Assignment8{
	public static void main(String []args){
		for(int i=100;i<=500;i++){
			int rem=0;
			int sumOfCubes=0;
			int ams=i;
			while(ams!=0){
				rem=ams%10;
				sumOfCubes+=(rem*rem*rem);
				ams=ams/10;
			}
			if(sumOfCubes==i){
				System.out.println(i);
			}
		}
	}
}
				
