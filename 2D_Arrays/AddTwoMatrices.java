package BasicToAdvance;

import java.util.Scanner;

public class AddTwoMatrices {

	public static void main(String[] args) {
		int noOfRows;
		int noOfColumns;
		Scanner sc= null;
		try {
			sc= new Scanner(System.in);
			
			System.out.println("ENter number of rows in matrix: ");
			noOfRows= sc.nextInt();
			System.out.println("ENter number of columns in matrix: ");
			noOfColumns=sc.nextInt();
			
			int matrix1[][]= new int[noOfRows][noOfColumns];
			int matrix2[][]= new int[noOfRows][noOfColumns];
			int resultantM[][]= new int [noOfRows][noOfColumns];
			
			System.out.println("Enter Element of first matrix: ");
			
			for(int i = 0; i<noOfRows;i++) {
				for(int j=0;j<noOfColumns;j++) {
					matrix1 [i][j]=sc.nextInt();
				}
			}
			
			System.out.println("First matrix is: ");
			for(int i = 0;i<noOfRows;i++) {
				for(int j=0;j<noOfColumns;j++) {
					System.out.print(" "+matrix1[i][j]+"\t");
				}
				System.out.println();
			}
			
			System.out.println("Enter element of Second matrix: ");
			
			for(int i =0;i<noOfRows;i++) {
				for(int j= 0 ;j<noOfColumns;j++) {
					matrix2[i][j]=sc.nextInt();
					
				}
			}
			
			System.out.println("Second matrix is: ");
			for(int i=0;i<noOfRows;i++) {
				for(int j =0;j<noOfColumns;j++) {
					System.out.print(""+matrix2[i][j]+"\t");
				}
				System.out.println();
			}
			
			for(int i=0;i<noOfRows;i++) {
				for(int j =0;j<noOfColumns;j++) {
					resultantM[i][j]=matrix1[i][j]+matrix2[i][j];
				}
				
			}
			System.out.println("Resultant Mtarix is: ");
			for(int i=0;i<noOfRows;i++) {
				for(int j =0;j<noOfColumns;j++) {
					System.out.print(" "+resultantM[i][j]+"\t");
				}
				System.out.println();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sc!=null) {
				sc.close();
			}
		}

	}

}
