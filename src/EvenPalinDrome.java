import java.util.Scanner;

public class EvenPalinDrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int countArray[]=new int[10];
		Long number = s.nextLong();
		long count=0L;
		boolean flag=true;
		long currentCount=9;
		int local=0;
		while(flag){
			if(number>=currentCount){
				count++;
				number-=currentCount;
				currentCount*=10;
			}
			else{
				flag=false;
			}
		}
		while(number>=10){
			local=(int) (number%10);
			countArray[local]+=2;
			number/=10;
		}
		local=(int) (number%9);
		countArray[local]+=2;
		int max=0;
		for(int i=1;i<10;i++){
			if(countArray[i]>countArray[max])
				max=i;
		}
		System.err.println(max);
		}

}
