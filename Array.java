package ArrayExercise;
import java.util.Scanner;
public class Array {

	 private int[] arr;
	    private int current = 5;
	    private int index = 0;
	    private Scanner input;
	    public Array(){
	        arr = new int[current];
	        input = new Scanner(System.in);
	        int n = 0;

	        do{
	            System.out.println("-------- MyArray ---------");
	            System.out.println("1. Input array");
	            System.out.println("2. View array");
	            System.out.println("0. Exit");
	            System.out.println("--------------------------");
	            System.out.print("Choose : ");
	            n = input.nextInt();
	            switch(n){
	                case 1:
	                    addArray();
	                break;
	                case 2:
	                    viewArray();
	                break;
	            }
	        }while(n!=0);
	    }
	    private boolean isOutOfIndex(){
	        if(index+1==current){
	            return true;
	        }else{
	            return false;
	        }
	    }
	    private void increaseArray(){
	        if(isOutOfIndex()){
	            int newArr[] = new int[current+5];
	            for(int i=0;i<current;i++){
	                newArr[i] = arr[i];
	            }
	            arr = newArr;
	            current+=5;
	        }
	    }
	    private void addArray(){
	        while (true){
	            System.out.print("Enter number to array["+index+"], enter -1 to exit : ");
	            int number = input.nextInt();
	            if(number==-1) break;
	            increaseArray();
	            arr[index++] = number;
	        }
	    }
	    private void viewArray(){
	        System.out.print("Array = [");
	        for(int i=0;i<index;i++){
	            if(i!=0) System.out.print(", ");
	            System.out.print(arr[i]);
	        }
	        System.out.println("]");
	    }
}
