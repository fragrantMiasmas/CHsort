/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms_2;

/**
 *
 * @author ElizabethReed PC
 */
public class Quicksort {
    
       
    public int partition(int[] A, int p, int r){
        int i = p-1;

        for(int j = 0; j<r; j++){
            
            int old_value = A[j];
            if(A[j] <= A[r]){
                i = i+1;
                A[j] = A[i];
                A[i] = old_value;
            }
        }
        //switch next spot with pivot
        int final_swap = A[i+1];
        A[i+1] = A[r]; //debug
        A[r] = final_swap;
        
        printResult(A); //debugging
        return i+1;
    }
    
    public int[] quicksort(int[] A, int p, int r){
        
        int q = partition(A, p, r);
        System.out.println("q = " + q + ", p = " + p); //debugging
    
        int[] subA = quicksort(A,p,q-1); //left side of pivot
        subA = quicksort(A, q+1,r); //right side of pivot

        
        return A;
    }
 
    public void printResult(int[] result){
        for (int j = 0; j < result.length; j++) {
             System.out.print(result[j] + ", ");
        }
    }
}
