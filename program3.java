import java.io.*;

class EvenOddCount{
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size");
		int size = Integer.parseInt(br.readLine());
		
		int arr[] = new int[size];
		
		System.out.println("Enter array elements");
		for(int i=0; i<size; i++){
			
			arr[i]= Integer.parseInt(br.readLine());
		}
		int esum= 0, osum = 0;
		//int ecount=0, ocount = 0;
		for(int i = 0; i<arr.length; i++){
			
			if(arr[i]%2 == 0){
		
				esum = esum + arr[i];

			}else{
				//ocount++;
				osum = osum + arr[i];
				//System.out.println("Sum of even count is: "+ sum);
			}
		}
		System.out.println("sum of even count is: "+ esum);
		System.out.println("Sum of odd count is: "+ osum);
	}
}