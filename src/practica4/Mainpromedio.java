/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Mainpromedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int Numero[];
        int N;
        float promedio = 0;
        System.out.println("Cuantos numeros quieres promediar:");
        N = sc.nextInt();
        Numero = new int[N];
        try {
            for (int i = 0; i < N; i++) {
                System.out.print("Ingresa el numero:");
                Numero[i] = (sc.nextInt());
            }
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        float suma = 0;
        for (int i = 0; i < N; i++) {
            suma += Numero[i];
        }
        for (double i = 0; i < N; i++) {
            promedio = suma / N;
        }
        System.out.println("-----------------");
        for (int i = 0; i < N; i++) {
            System.out.println("El arreglo original es:" + Numero[i]);
        }
        System.out.println("-----------------");
        System.out.print("El Promedio es:" + promedio);
    }

}


