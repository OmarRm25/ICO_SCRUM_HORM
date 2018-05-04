/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICO.kata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Omar
 */
public class Conversion {
    
    public static void main(String Arg[ ]) throws IOException{
	Texto numero;
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	int num;
	String res;
        System.out.print("Ingrese numero : ");
        num = Integer.parseInt(in.readLine( ));
		numero = new Texto(num);
		res = numero.convertirLetras(num);
		System.out.print(res);
		System.out.println("\n");
	}	
}

