package lineardatastructures;

public class ArrayDataStructureMultidimensional {
	public static void main(String[] args) {
		//Declare the array
		int [][] matrix=new int[4][3];
		//Row 1
		matrix[0][0]=1;
		matrix[0][1]=2;
		matrix[0][2]=3;
		//Row 2		
		matrix[1][0]=4;
		matrix[1][1]=5;
		matrix[1][2]=6;
		//Row 3
		matrix[2][0]=7;
		matrix[2][1]=8;
		matrix[2][2]=9;
		//Row 4
		matrix[3][0]=10;
		matrix[3][1]=11;
		matrix[3][2]=12;
		/*
		matrix[0][1]=13;
		matrix[0][1]=14;
		matrix[0][1]=15;
		matrix[0][1]=16;*/
		new ArrayDataStructureMultidimensional().loopElementsinMultidimensionalArray(matrix);
	}
	
	//Method to print all elements in multidimesional array
	public void loopElementsinMultidimensionalArray(int [][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				System.out.println("Element:"+matrix[i][j]);
			}
		}
	}

}
