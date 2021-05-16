
public class LongestCommonSubsequence {
	
	
	public static void main(String[] args) {
		
		String str="NAGARRO";
		String str1="SNtArGinARROg";
		int [][] matrix=new int[str.length()+1][str1.length()+1];
		char[][] position=new char[str.length()+1][str1.length()+1];
		// TODO Auto-generated method stub
		int lcs=calculateLCS(str, str1,matrix,position);
		System.out.println(lcs);
		System.out.println(printLCS(str, str1, position, lcs));
	}
	
	private static int calculateLCS(String str,String str1,int[][] matrix,char[][] position){
		
		for(int i=0; i<str.length()+1;i++){
			for(int j=0;j<str1.length()+1;j++){
				if(i==0 || j==0)
					matrix[i][j]=0;
				else if (str.charAt(i-1)==str1.charAt(j-1))
				{
					matrix[i][j]=matrix[i-1][j-1]+1;
					position[i][j]='D';
				}
				else{
					matrix[i][j]=Integer.max(matrix[i][j-1],matrix[i-1][j]);
					if(matrix[i][j-1]>matrix[i-1][j])
						position[i][j]='L';
					else
						position[i][j]='T';
				}
			}
		}
		return matrix[str.length()][str1.length()];
	}
	
	private static char[] printLCS(String str,String str1,char[][] position,int length){
		char[] returningString=new char[length];
		int i=str.length();
		int j=str1.length();
		int index=length-1;
		while(i>=0 && j>=0){
			if(position[i][j]=='D'){
				returningString[index--]=str.charAt(i-1);
				i--;
				j--;
			}
			else if (position[i][j]=='L')
				j--;
			else
				i--;
		}
		return returningString;
		
	}
	

}
