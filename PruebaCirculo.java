/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author alan
 */
public class PruebaCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo obxetoProba=new Circulo();
        /* Comentamos todo este codigo porque tras exercicio 10 daria fallo
        
        //Exercicio4
        Circulo circulo2=new Circulo();
        obxetoProba.radio=3;
        //Efectivamente, si poñemos en privado os atributos da Clase Circulo, non podemos acceder a eles despois
        System.out.println("");//Exercicio6
        Circulo circulo3=new Circulo();
        System.out.println("Valores de circulo3 tras ser unicamente instanciado:" );
        System.out.println("\tradio: " +circulo3.radio);
        System.out.println("");//Exercicio8
        Circulo circulo4=new Circulo((float) 3.23);
        System.out.println("Valores de circulo4:");
        System.out.println("\tRadio: "+circulo4.radio);
        System.out.printf("\tConstante pi: %.4f\n", circulo4.pi);
        */
        obxetoProba.setRadio(3);
        //System.out.println("radio: "+ obxetoProba.getCirculo());
        System.out.println(obxetoProba.areaCirculo());
        System.out.println(obxetoProba.lonxitudeCirculo());
        System.out.println(obxetoProba.aumentoRadio((float)-0.7836493345));
        obxetoProba.imprimirDatos();
    }
    
}
