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
		int ecount=0, ocount = 0;
		for(int i = 0; i<arr.length; i++){
			
			if(arr[i]%2 == 0){
				ecount++;
			}else{
				ocount++;
			}
		}
		System.out.println("No of even count is: "+ ecount);
		System.out.println("No. of odd count is: "+ ocount);
	}
}