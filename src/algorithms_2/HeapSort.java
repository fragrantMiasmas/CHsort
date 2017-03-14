/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms_2;

import java.util.ArrayList;

/**
 *
 * @author ElizabethReed PC
 */
public class HeapSort {

    RandomGenerator RG = new RandomGenerator();
    
//    public int l(int i){
//        int l = (2 * i) + 1; //off by one error, must add one
//        return l;
//    }
//    
//    public int r(int i){
//        int r = 2 * i + 2;
//        return r;
//    }
    public int[] max_heapify(int[] A, int i) {
        int l = (2 * i) + 1; //off by one error, must add one
        int r = 2 * i + 2;

        // check left child compare it to array(i)
        int greater_index;
        if (l <= A.length-1 && A[l] > A[i]) {
            greater_index = l;
        } else {
            greater_index = i;
        }

        // check right child, compare it to either left child and array(i)
        if (r <= A.length-1 && A[r] > greater_index) {
            greater_index = r;
        }

        
        // exchange subtree's root if necessary
        if (greater_index != i){
            int old_root = A[i];
            int new_largest_node = A[greater_index];
            A[i] = new_largest_node;
            A[greater_index] = old_root;
            max_heapify(A,greater_index);
            
        }

          return A;
    }
    
  
    
    public void build_heap(int[] A) {
        int midpoint = (int)Math.floor((A.length-1) / 2);
//        int temp = A[midpoint];

        for (int i = midpoint; i >= 0; i--) //negative for loop
        {
            max_heapify(A, i); //wants to reset to old array
            RG.printResult(A); 
            System.out.println("");
        }

    }
    
    public ArrayList toArrayList(int[] A){
        ArrayList al = new ArrayList();
        
        for(int i = 0; i<A.length; i++){
            al.add(A[i]);
//            System.out.println( al.get(i));
        }
        return al;
    }
    
//    public int[] heapsort(int[] A){
//               
//        build_heap(A);
//        ArrayList alist = toArrayList(A);
//        int[] finalA = new int[A.length];
//        
//        for(int i = A.length-1; i>=0; i--){
//        int l = (2 * i) + 1; //off by one error, must add one
//        int r = 2 * i + 2;
//        
//        finalA[i] = (int) alist.get(0);
//        alist.remove(0);
//      
//        RG.printResult(finalA);
//        System.out.println("");
//            
//        }
//        
//        return finalA;
//    }
    
     public ArrayList heapsort(int[] A){
               
        build_heap(A);
        ArrayList alist = toArrayList(A);
         
        for(int i = A.length; i>=0; i--){
        int old_root = (int) alist.get(0);
        alist.add(i,old_root);
                
        if( i < A.length-2 &&(int) alist.get(1)< (int) alist.get(2)){
            //exchange
             int old_left = (int) alist.get(1);
             alist.set(1, (int) alist.get(2));
             alist.set(2, old_left);
        }
        alist.remove(0);    
        System.out.println(alist);
        }
        
        return alist;
    }
}
