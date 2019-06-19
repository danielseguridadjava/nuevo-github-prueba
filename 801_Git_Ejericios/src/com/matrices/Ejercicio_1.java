package com.matrices;

public class Ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz[][]=new int[4][4];
        
        //i = filas y j = columnas
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                matriz[i][j]=(i*matriz.length)+(j+1);
                System.out.print(matriz[i][j]+" ");
                 
            }
            System.out.println("");
        }

	}

}
