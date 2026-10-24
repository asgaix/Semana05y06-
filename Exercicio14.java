/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio.pkg14;

/**
 *
 * @author alan
 */
import java.util.Scanner;
public class Exercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
    //Para executar cada un dos exercicios comer con /* */ os outros
    //Exercicio4    
        float base, altura;
        System.out.println("Introduce valor base do rectángulo: ");
        base= teclado.nextFloat();
        System.out.println("Introduce agora a altura: ");
        altura=teclado.nextFloat();
        System.out.println("O área do círculo é: "+(base*altura));
    //Exercicio5    
        float a, b, c;
        System.out.println("Introduce os tres valores a operar separados por espacio:");
        a=teclado.nextFloat();
        b=teclado.nextFloat();
        c=teclado.nextFloat();
        System.out.println("Resultado final es: "+((a+b-c)*(a+b-c)*(a+b-c)));
    //Exercicio6    
        String dni;
        float nota1, nota2, nota3, nota4;
        System.out.println("Introduce dni de alumno: ");
        dni=teclado.nextLine();
        System.out.println("Introduce valor da primeira nota:");
        nota1=teclado.nextFloat();
        System.out.println("Introduce valor da segunda nota:");
        nota2=teclado.nextFloat();
        System.out.println("Introduce valor da terceira nota:");
        nota3=teclado.nextFloat();
        System.out.println("Introduce valor da cuarta nota:");
        nota4=teclado.nextFloat();
        System.out.printf("\n\nO alumno con dni nº: %s.\nTen una nota media de: %.1f\n",dni,((nota1+nota2+nota3+nota4)/4));
    //Exercicio7    
        String nome;
        float peso, altura;
        System.out.println("Introduce nome da persoa: ");
        nome=teclado.nextLine();
        System.out.println("Introduce o peso (en Kg) da persoa:");
        peso=teclado.nextFloat();
        System.out.println("Introduce agora a altura(en cm):");
        altura=teclado.nextFloat();
        System.out.printf("A persoa: %s, ten os seguintes datos: \n peso: %.1f libras \n altura: %.1f pés\nO seu IMC equivale a: %.2f\n",nome,(peso*2.205),(altura*0.033), ((peso/((altura/100)*(altura/100)))));
    //Exercicio8
        float monedaEuros;
        System.out.print("Introduce cantidade de euros: ");
        monedaEuros=teclado.nextFloat();
        System.out.printf("Se tes: %.2f€ , esto equivale a: %.2f dólares.\n", monedaEuros, (monedaEuros*1.1253));
    //Exercicio9
        float radio, altura;
        System.out.print("Introduce radio: ");
        radio=teclado.nextFloat();
        System.out.print("Introduca altura: ");
        altura=teclado.nextFloat();
	System.out.printf("O área do cilindro é: %.3f \n", (2*Math.PI*radio*(radio+altura)));
	System.out.printf("o volumen do cilindro é: %.2f\n", Math.PI*radio*radio*altura);
    //Exercicio10
        short hora, minuto, duracion;
        System.out.print("Introduce hora e minuto de hora de inicio (separa, hora de minutos por espacio): ");
        hora=teclado.nextShort();
        minuto=teclado.nextShort();
        System.out.print("Tempo de duracion (en minutos) do evento: ");
        duracion=teclado.nextShort();
	System.out.print("Cando o evento finalice seran as: " +((hora+((minuto+duracion)/60))%24)+" horas, " + ((minuto+duracion)%60)+" minutos\n");

   
    }
    
}
