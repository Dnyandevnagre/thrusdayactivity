//Dnyandev nagre

//Write java program to reverse an array

package Question3;

public class ReverseArray {

	public static void main(String[] args) {
		 
		
        int [] arr = new int [] {0, 1, 2, 3, 4, 5, 6};       //Initialize array  
        
        System.out.println("Original array: ");  
        
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        
        System.out.println(); 
        
        System.out.println("Array in reverse order: ");  
        
       
        for (int i = arr.length-1; i >= 0; i--) {        //Loop through the array in reverse order  
            System.out.print(arr[i] + " ");  
        }  

	}

}
