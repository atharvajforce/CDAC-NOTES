import java.util.Scanner;

public class TestArray {
	public static void main(String[] args) {
		int[][] arr=new int[3][];
		//int[][][] arr1=new int[3][][];
		//int[][][] arr1=new int[3][][5];#error
		Array2DService.acceptData(arr);
		Array2DService.displayData(arr);
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
		System.out.println("1. find max of all data\n2. find max rowwise");
		System.out.println("3. find max column wise\n4. find addition rowwise");
        System.out.println("5. find addition columnwise\n6.exit\n choice:");
        choice=sc.nextInt();
        switch(choice) {
        case 1:
        	int max=Array2DService.findMax(arr);
        	System.out.println("Maximum of array : "+max);
        	break;
        case 2:
        	int[] maxarr=Array2DService.findMaxRowwise(arr);
        	for(int x:maxarr) {
        		System.out.println("Max : "+x);
        	}
        	
        	break;
        case 3:
        	int[] maxarr1=Array2DService.findMaxColumnwise(arr);
        	for(int x:maxarr1) {
        		System.out.println("Max : "+x);
        	}
        	
        	break;
        	
       
        case 4:
         int [] temp=Array2DService.addRowwise(arr);
        	for(int i=0;i<temp.length;i++) {
        		System.out.println("Sum of row " + i + " = " + temp[i]);
        	}
           break;
        case 5:
        	int [] temp1 =Array2DService.addColumnwise(arr);
			for(int i=0;i<temp1.length;i++) {
			System.out.println("Sum of column " + i + " = " + temp1[i]);
			}
			
        	break;
        case 6:
        	System.out.println("Thank you for visiting......");
        	sc.close();
        	break;
        default:
        	System.out.println("wrong choice");
        		
        }
		}while(choice!=6);
	}
}
