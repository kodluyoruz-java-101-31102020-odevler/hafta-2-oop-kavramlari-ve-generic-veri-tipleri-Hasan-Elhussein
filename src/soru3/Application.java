// N boyutunda , 0-10 arasinda rastgele sayilardan olusan dizi olusturunuz diye yaziyordu soruda ama
// belirsiz boyutta bir dizi olusturamiyorum, bir de verilen ornekte 10'dan buyuk sayilar vardi
// ondan: diziyi 0-100 arasindaki sayilardan olusturdum, ve dizinin boyutu 10 olarak kabul ettim.

package soru3;
import java.lang.Math;

public class Application {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		System.out.println("Array: ");
		
		for(int i = 0 ; i < 10 ; i++) {
			arr[i] += Math.random()*100;
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\nDuplicated numbers: ");
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = i+1; j <arr.length ; j++) {
				if(arr[i] == arr[j]) {
					System.out.print(arr[j] + " ");
					break;
				}
			}
		}
		

	}

}
