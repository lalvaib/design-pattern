
public class BoundedKnapSack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] weightArray={10,20,30};
		int[] profitArray={60,100,120};
		int capacity=50;
		maximumProfitAndItems(weightArray, profitArray, capacity);

	}
	
	private static void maximumProfitAndItems(int[] weight,int[] profit,int capacity){
		
		int [][] matrix=new int[weight.length+1][capacity+1];
		
		for(int i=0;i<weight.length+1;i++){
			for(int j=0;j<capacity+1;j++){
				if(i==0 || j==0)
					matrix[i][j]=0;
				else if(weight[i-1]<=j){
					matrix[i][j]=Integer.max(matrix[i-1][j],matrix[i-1][j-weight[i-1]]+profit[i-1]);
				}
				else{
					matrix[i][j]=matrix[i-1][j];
				}
			}
		}
		System.out.println("Final Profit:::"+matrix[weight.length][capacity]);
	}

}
