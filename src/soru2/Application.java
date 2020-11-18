package soru2;

public class Application {

	public static void main(String[] args) {
		
		Integer[][] mOne = {{2,4},
						    {1,4}};
		
		Integer[][] mTwo = {{1,4}
						   ,{1,3}};
		
		Matrix<Integer> mObj = new Matrix<Integer>(mOne,mTwo);
		mObj.multiplyMatrices();
		mObj.printMatrix();
		
		
	}

}
