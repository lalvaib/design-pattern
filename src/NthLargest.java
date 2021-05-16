
public class NthLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 NthLargest.buildHeap(new int[]{1,57}, new int[]{5,78,59}, new int[]{1,56});
		int i=4;
		Integer inte=new Integer(4);
		Integer inte1=4;
		System.out.println(i==inte);
		System.out.println(inte1==inte);
		System.out.println(i==inte1);
		
		System.out.println(inte.equals(i));
		System.out.println(inte1.equals(inte));
		System.out.println(inte1.equals(i));
	}
	

	
	private static void buildHeap(int [] A,int [] B,int [] C){
		int b=0;
		while(Math.pow(2, b)<=A.length+B.length+C.length+1){
			b++;
		}
		b--;
		int heap[]=new int[(int)Math.pow(2, b)];
		int index=0;
		for(int i=0;i<A.length;i++){
			heap[index++]=A[i];
		}
		for(int i=0;i<B.length;i++){
			heap[index++]=B[i];
		}
		for(int i=0;i<C.length;i++){
			heap[index++]=C[i];
		}
		
		for(int j=(int)Math.floor(index/2);j>=0;j--){
			maxHeapify(heap, j,index);
		}
		System.out.println(evict(heap, index));
		System.out.println(evict(heap, index));
		System.out.println(evict(heap, index));
		
	}
	
	private static void maxHeapify(int [] heap, int index,Integer heapSize){
		int value=heap[index];
		int largest=index;
		if(2*index+1<heapSize && heap[(2*index+1)]>value)
			largest=2*index+1;
		if (2*index+2<heapSize && heap[(2*index+2)]>heap[largest])
			largest=2*index+2;
		
		if(largest!=index)
		{
			heap[index]=heap[largest];
			heap[largest]=value;
			maxHeapify(heap, largest,heapSize);
		}
	}
	
	private static int evict(int [] heap,Integer heapSize){
		int temp=heap[0];
		heap[0]=heap[heapSize-1];
		heapSize-=1;
		maxHeapify(heap, 0, heapSize);
		return temp;
	}
	
}
