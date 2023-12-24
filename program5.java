import java.io.*;

class ArrayMin{
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter array size");
		
		int size = Integer.parseInt(br.readLine());
		
		int arr[] = new int[size];
		
		System.out.println("Enter array elements:");
		for(int i = 0; i<arr.length; i++){
			
			arr[i] = Integer.parseInt(br.readLine());
		}
		int min = arr[0];
		for(int i = 0; i < arr.length; i++){
			
			if(arr[i]< min){
				
				min = arr[i];
			}	
		}
		System.out.println("Minimum element from the array is " + min);
	}
}