// Generic siniflari ve metodleri arithmetic hesaplamalar icin uygun degildir!
// T degeri her sey olabildigi icin, onun uzerinden arithmetic islemler yapamayiz 
// sorunu cozmek icin <T extends Number> yapmaya calistim, gelecek T degerleri Number subclass'tan oldugunu belirlemeye calistim,
// ama sorun cozulmedi, hala o degiskenler uzerinde calismak icin, mecbur .intValue() .doubleValue() . floatValue()...
// gibi fonksiyonlar kullanmak zorunda kaldim.
// Daha iyi bir cozum bulana kadar, su anlik program sadece INTEGER degerler icin test edildi.

package soru2;

public class Matrix<T extends Number> {
	
	T[][] newMatrix;
	
	T[][] mOne;
	T[][] mTwo;
	public Matrix(T[][] mOne, T[][] mTwo) {
		
		this.mOne = mOne;
		this.mTwo = mTwo;
		
	}
	
	@SuppressWarnings("unchecked")
	public T[][] multiplyMatrices() {
		
		//n the height of first matrix
		//m the width of first matrix (also the height of the second matrix)
		//t the width of the second matrix
		int nn = mOne.length;
		int mm = mTwo.length;
		int tt = mTwo[0].length;
		this.newMatrix = (T[][]) new Number[nn][tt];
		
		for(int n = 0 ; n < nn ; n++) {
			for(int t = 0 ; t < tt ; t++) {
				newMatrix[n][t] = (T)(Number) 0;
				for(int m = 0 ; m < mm ; m++) {
					//.intValue() fonksiyonu kullanmadan hata olusur!
					newMatrix[n][t] = (T)(Number) (newMatrix[n][t].intValue() + (mOne[n][m].intValue() * mTwo[m][t].intValue()));
				}
			}
		}
		
		return newMatrix;
	}
	
	
	public void printMatrix() {
		for(T[] row : newMatrix) {
			for(T column : row) {
				System.out.print(column + " ");
			}
			System.out.println();
		}
	}
	
	
}
