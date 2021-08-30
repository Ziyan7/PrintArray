package PrintArray;

public class PrintArray {
	

	public static void main(String[] args) {
		
		Integer[] intArray= {1,2,3,4};  //integer array
		Double[] doubleArray= {1.1,2.2,3.3,4.4};//double array
		Character[] charArray= {'A','B','C','D'}; //character array
		
		PrintArray.printArray(intArray);		//function call with integer array
		PrintArray.printArray(doubleArray);		//function call with double array
		PrintArray.printArray(charArray);		//function call with character array
	}
	//@method to display  values using generic approach
	public static <E> void printArray(E[] array)     
	{
		for(E i :array)
		{
			System.out.printf("%s ",i);
		}
			
	}
		
}	