
public class PasswordStrength {

	public static void main(String[] args) {
		System.out.println(getStrength("hellomrz", 2));

	}
	
    public static int getStrength(String password, int weight_a) {
    int sum=0;
        for(int i=0;i<password.length();i++)
        {
            sum+=(((int)password.charAt(i))-97+weight_a)%26;
        }

    return sum;
    }
    
    public Integer opeartionCount(Integer[] M, Integer[] N){
    	int count01=0;
    	int count10=0;
    	for(int i=0;i<M.length;i++){
    		if(M[i]==0 && N[i]==1){
    			count01++;
    		}
    		else if (M[i]==1 && N[i]==0){
    			count10++;
    		}
    		else{
    			// Do Nothing as both will be either 00 or 11
    		}
    	}
    	if(count01==count10)
    		return count01;
    	else if (count01>count10){
    		return count01;
    	}
    	else{
    		return count10;
    	}
    	
    }

}
