package practice;

import java.util.Scanner;

public class MatrixTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number_of_rows = scan.nextInt();
		String encodedString = scan.next();
		int number_of_columns = encodedString.length()/number_of_rows;
		int index = 0;
		char[][] encodedMatrix = new char[number_of_rows][number_of_columns];
		for (int i=0; i<number_of_rows; i++) {
			for(int j=0; j<number_of_columns; j++) {
				encodedMatrix[i][j] = encodedString.charAt(index);
				index++;
			}
		}
		StringBuffer originalString = new StringBuffer();
		char c;
		for(int j=0; j<number_of_columns; j++) {
			for(int i=0; i<number_of_rows; i++) {
				if (i+j<number_of_columns) {
					c = encodedMatrix[i][i+j];
					if(c!='_') {
						originalString.append(c);
					}else {
						originalString.append(' ');
					}
				}
			}
		}
		System.out.println("original string is:" + originalString.toString());

	}

}
