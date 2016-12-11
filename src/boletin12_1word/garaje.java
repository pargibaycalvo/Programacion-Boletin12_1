/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12_1word;

import javax.swing.JOptionPane;

/**
 *
 * @author Ped90
 */
public class garaje {
    
    private String matricula;
    private int ncar; 
    private int capmax=5;
    private final float menor3h = (float) 1.5;
    private final float mayor3h = (float) 0.2;

    public garaje() {
    }

    public garaje(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getNcar() {
        return ncar;
    }

    public int getCapmax() {
        return capmax;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
public boolean espacio(){
       if(capmax>=(ncar+1)){
            System.out.println((capmax-ncar+1)+"Su plza está disponible");
            ncar++;
            return true;
        }else{
            System.out.println("Lo sentimos el parking está completo");
            return false;
        }
    }
public float precio(float hora){
    if(hora<3){
            return menor3h; 
        }else{
            hora=hora-3;
            if((int)hora==0)
               return (menor3h+mayor3h);
            else
                return (menor3h+(int)hora*mayor3h); 
        }
    }
public void factura (){
        System.out.println("Factura");
        System.out.println("Matricula: "+matricula);
        System.out.println("Tiempo total de estacionamiento:");
        System.out.println("Precio total:");
       
    }
    
}

    

