package revaturecodingexcercise;

public class Matrixadiition {
	public static void main(String[] args) {
		int arr1 [][] = {{1,2,3},{6,5,4},{9,8,7}};
		int arr2 [][] = {{1,2,3},{4,5,6},{9,8,7}};
		int arr3 [][] = new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	}

}
