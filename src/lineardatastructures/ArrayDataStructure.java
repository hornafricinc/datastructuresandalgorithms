package lineardatastructures;

public class ArrayDataStructure {
	//Declare an array

	
	//We can directly declare arrays in a single line

	//Allocate size
	public static void main(String[] args) {
	  String[] workerNames=new String[10];
	  int[] ages= {21,22,23,24,45,67,89,12,34};
	  //size of an array in java .length
		workerNames[0]="Cornelius";
		workerNames[1]="KIPKORIR";
		workerNames[2]="EVANS";
		workerNames[3]="KILIMO";
		workerNames[4]="JUSTINE";
		workerNames[5]="KIPLAGAT";
		workerNames[6]="OSCAR";
		workerNames[7]="KIBET";
		workerNames[8]="MILKA";
		workerNames[9]="LINAH";
		
		System.out.println("Total Workers"+workerNames.length);
		//Total ages
		
		System.out.println("Total people:"+ ages.length);
		//Call the loop with forloop method
		System.out.println("====USING FOR LOOP====");
		new ArrayDataStructure().loopArrayElementsUsingForLoop(ages);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("====USING FOR-EACH LOOP====");
		//Call the loop with for-each method
		new ArrayDataStructure().loopArrayElementsUsingForEachLoop(workerNames);
		//Call the Sum of all elements in the age array.
		System.out.println("The Sum of all ages is:"+new ArrayDataStructure().sumofArrayElements(ages));
		//Call the Average of all elements in the age array.
		System.out.println("The Sum of all ages is:"+new ArrayDataStructure().averageofArray(ages));
				
		
	}
	//Loop through array lements using for-loop
	public void loopArrayElementsUsingForLoop(int [] data) {
		for(int i=0;i<data.length;i++) {
			System.out.println("Element "+i+":"+data[i]);			
		}
	}
	//Looping array elements with for-each loop
	public void loopArrayElementsUsingForEachLoop(String [] people) {
		for(String name:people) {
			System.out.println("Your Name:"+name);
		}
	}
	//Computer sum of array elements
	public int sumofArrayElements(int [] ages) {
		int sum=0;
		for(int age:ages) {
			sum+=age;
		}
		return sum;
	}
	//Get the average of all elements in an array
	public double averageofArray(int [] ages) {
		double average=0;
		int sum=0;
		for(int age:ages) {
			sum+=age;
			
		}
		average=(double)sum/(double)ages.length;
		return average;
	}

}
