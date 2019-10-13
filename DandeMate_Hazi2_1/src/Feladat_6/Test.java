/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_6;

public class Test {
    public static void main(String[] args) {
        int[] t ={1,2,1,1,2,5,5,5,5};

        System.out.println(isConsecutiveFour(t));
    }
    
    public static boolean isConsecutiveFour(int[] values){

        if(values.length<4)
            return false;
        
        int tmp=1;
        for (int i = 0; i < values.length-1; i++) {
           if(values[i]==values[i+1]){
               tmp++;
               if(tmp==4)
                   return true;
           }
           else{
               tmp=1;
           }
        }
        
        return false;
    }
}
