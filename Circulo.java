/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alan
 */
public class Circulo {
    private final double pi=Math.PI;
    private float radio;
    //Exercicio 6
    public Circulo(){}
    //Exercicio 8
    public Circulo(float radio){
        this.radio=radio;
        }
    public void setRadio(float radio){
        if (radio>0) this.radio=radio; else System.err.printf("%20s\n%20s\n","****error****","Radio debe ser positivo");
        }
    //DUDA: porque con operador ?: non funciona a operación
    public float getRadio (){
        return radio;
    }
    public float areaCirculo(){
                return(float)(radio*radio*pi);

    }
    public float lonxitudeCirculo(){
        return(float)(2*pi*radio);
    }
    public float aumentoRadio(float aumento){
       return radio+=aumento;
    }
    public void imprimirDatos(){
        System.out.println("Radio: "+radio);
    }
}
