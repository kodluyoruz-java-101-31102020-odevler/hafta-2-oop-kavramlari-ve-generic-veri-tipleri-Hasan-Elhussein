package soru1;

public class Application {

	public static void main(String[] args) {
		
		int[][] arr  = {{1 ,2 ,3 ,4 ,5},
						{16,17,18,19,6},
						{15,24,25,20,7},
						{14,23,22,21,8},
						{13,12,11,10,9}};
		
		
		int rowSize = arr[0].length;
		int columnSize = arr.length;
		int startPoint = 0;
		
		
		for(int k = 0 ; k < 3 ; k++) {
			
			for(int i = startPoint ; i < rowSize ; i++) {
				System.out.print(arr[startPoint][i] + " ");
			}
			for(int i = startPoint+1 ; i < columnSize ; i++) {
				System.out.print(arr[i][rowSize-1] + " ");
			}
			for(int i = rowSize-1 ; i > startPoint ; i--) {
				System.out.print(arr[columnSize-1][i-1] + " ");
			}
			for(int i = columnSize-1 ; i > startPoint+1 ; i--) {
				System.out.print(arr[i-1][startPoint] + " ");
			}
			
			startPoint++;
			columnSize--;
			rowSize--;
			
		}
		

		
	}

}
