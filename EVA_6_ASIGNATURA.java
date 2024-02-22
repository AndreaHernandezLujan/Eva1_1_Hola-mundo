/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_6_asignatura;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class EVA_6_ASIGNATURA {

    public static void main(String[] args) {
    //clave, nombre, creditos, hrTeo. hrPr, carrera
    //tipoMat
    String clave, nombre, carrera;
    int creditos, horasTeo, horasPrac;
    boolean tipoMat;
    //CAPTURAR
    Scanner captu = new Scanner (System.in);
    System.out.println ("Introduce la clave de la asignatura:");
    clave = captu.nextLine();
    System.out.println ("Introduce el nombre de la asignatura:");
    nombre = captu.nextLine();
    System.out.println ("Introduce la carrera de la asignatura");
    carrera = captu.nextLine();
    System.out.println ("Introduce la clave de la asignatura");
    creditos = captu.nextInt();
    System.out.println("Introduce los creditos dela asignatura");
    horasTeo = captu.nextInt();
    System.out.println ("Introduce las horas practicas de la asignatura");
    horasPrac = captu.nextInt();
    System.out.println ("Introduce el tipo de asignatura");
    tipoMat = captu.nextBoolean();
    
//HACER ALGO CON LOS TIPOS CAPTURADOS
System.out.println(clave);
System.out.println(nombre);
System.out.println(carrera);
System.out.println(creditos);
System.out.println(horasTeo);
System.out.println(horasPrac);
System.out.println(tipoMat);




    }
}
