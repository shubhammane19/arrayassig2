import java.io.*;

class SearchDemo{
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter array size");
		
		int size = Integer.parseInt(br.readLine());
		
		int arr[] = new int[size];
		
		System.out.println("Enter element in array");
		for(int i = 0; i<arr.length; i++){
			
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Enter element you want to search : ");

		int search = Integer.parseInt(br.readLine());
		for(int i = 0; i<arr.length; i++){
			
			if(arr[i] == search){
				
				System.out.println("Element found at index =  " + i);
			}
		}
	}
}