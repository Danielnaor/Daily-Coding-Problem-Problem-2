/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.daily_coding_problem_problem2;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author carmitnaor
 */
public class Daily_Coding_Problem_Problem2 {

static int[] newArray;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("what would be the list? (example: 10,15,3,7) :" );
        
        String[] listArrystring = scan.nextLine().split(",");
        

    
        int[] input = new int[listArrystring.length];

        // Loop trough the String array and convet each value to int and adds int to the int[] list 
        for (int i = 0; i < listArrystring.length; i++) {
            input[i] = Integer.parseInt(listArrystring[i].trim());
        }
        
        
            Daily_Coding_Problem_Problem2 ref = new Daily_Coding_Problem_Problem2();
            ref.solve(input);
            System.out.println(Arrays.toString(newArray));

    }
    public  void solve(int[] input){
        Daily_Coding_Problem_Problem2.newArray = new int[input.length];
        for(int i = 0; i < input.length; i++){
                    int result = 1;

            for(int j = 0; j < input.length; j++){
                if(!(j == i)){

                    result  *= input[j];
                    
                    
                }
                
                
            }
            newArray[i] = result;
            
        }
    }

    public Daily_Coding_Problem_Problem2() {
    }
}
