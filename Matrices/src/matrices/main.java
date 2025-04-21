/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;

public class main {

   public static void main(String[] args) {
        
        int[][] a = {
           {5, 8, 3, 1},
           {2, 7, 6, 4},
           {1, 4, 9, 0},
           {3, 5, 2, 8}
        };

         //mostrar matriz
        System.out.println("matriz:");
        for(int i=0; i<4; i++){
            for(int j=0; j<0x4; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(); 
        }

        // diagonal principal
        System.out.println("diagonal principal:");
        for(int i=0; i<4; i++){
            System.out.print(a[i][i]+" ");
        }

        // diagonal secundaria
        System.out.println("\n diagonal secundaria: ");
        for(int i=0; i<4; i++){
            System.out.print(a[i][3-i]+" ");
        }
    }
} 
    

