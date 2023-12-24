import java.io.*;

class SumOfArray{
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter size of array");
		
		int size = Integer.parseInt(br.readLine());
		
		int arr[] = new int[size];
		
		System.out.println("Enter array elements");
		for(int i = 0; i< size; i++){
			
			arr[i]= Integer.parseInt(br.readLine());
		}
		int sum = 0;
		for(int i = 0; i<arr.length; i++){
			
			sum = sum + arr[i];
		}
		System.out.println("Sum of array is : " + sum);
		
	}
}