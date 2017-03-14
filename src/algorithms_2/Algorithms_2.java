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
public class Algorithms_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Quicksort QS = new Quicksort();
        HeapSort HS = new HeapSort();
        RandomGenerator RG = new RandomGenerator();
//        int[] A = {9,7,5,11,12,2,14,3,10,6};
        int[] A = {5,2,8,3,1};
//        int[] A = {13,7,1,11,2,2,4,3,5,6};
        
        int[] input1 = RG.randomArray(100);
        int[] input2 = RG.randomArray(1000);
        int[] input3 = RG.randomArray(10000);
        int[] input4 = RG.randomArray(100000);

//        int q = QS.partition(A, 0, A.length-1);

//        QS.quicksort(A, 0, A.length-1);
        
        
        HS.heapsort(A);

        

    }
    
}
