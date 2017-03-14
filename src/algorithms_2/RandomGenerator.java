/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms_2;

import java.util.Random;

/**
 *
 * @author ElizabethReed PC
 */
public class RandomGenerator {
    
     
    Random randomNumbers = new Random();
    
    public int[] randomArray(int n){
        
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            //changes random number for each iteration
            int rand = randomNumbers.nextInt(n); 
            input[i] = rand;
        }
        
        return input;
    }
    
    public int r(int[] randA){
        return randA.length-1;
    }
    
    public void printResult(int[] result){
        for (int j = 0; j < result.length; j++) {
             System.out.print(result[j] + ", ");
        }
    }
}

