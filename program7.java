import java.io.*;

class CompareArray{
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter array1 size:");
		int size = Integer.parseInt(br.readLine());
		
		int arr1[] = new int[size];
		System.out.println("Enter array1 elements:");
		for(int i = 0; i<arr1.length; i++){
			
			arr1[i]= Integer.parseInt(br.readLine()); 
		}
		
		System.out.println("Enter array2 size:");
		int size2 = Integer.parseInt(br.readLine());
		
		int arr2[] = new int[size2];
		System.out.println("Enter array2 elements:");
		for(int i = 0; i<arr2.length; i++){
			
			arr2[i]= Integer.parseInt(br.readLine()); 
		}
		System.out.println("the common elements from both the arrays are:");
		for(int i= 0; i<arr1.length; i++){
			
			for(int j = 0; j<arr2.length; j++){
				
				if(arr1[i] == arr2[j]){
					
					System.out.println(arr1[i]);
					break;
				}
			}
		}
	}
}