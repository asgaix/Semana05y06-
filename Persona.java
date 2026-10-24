/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author alan
 */
public class Persona {
    private String nombre, apellidos;
    private int edad;
    private float peso, estatura;
    private int codigo;
    //Exercicio5
    public Persona(String nombre, String apellidos, int codigo, byte edad, float peso, float estatura   ){
        /*Cambio atributos dados de Exercicio 5 por estar en exercicio7 e
        falta de loxica en pedir valores para inicializar desta forma e posuir valores de inicializacion
        */
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.codigo=codigo;
        this.edad=edad;
        this.estatura=estatura;
        this.peso=peso;
        }
    public Persona(){} 
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setEdad(int edad){
        if (esCorrectaEdad(edad)){
                this.edad=edad;
        } else System.err.println("***+++ERROR+++***");
    }
    public int getEdad(){
        return edad;
    }
    public void setPeso(float peso){
        this.peso=peso;
    }
    public float getPeso(){
        return peso;
    }
    public void setEstatura(float estatura){
        this.estatura=estatura;
    }
    public float getEstatura(){
        return estatura;
    }
    //Exercicio 11
    public double calcularImc(){
        return (peso/(estatura*estatura));
    }
    public boolean esMayorDeEdad(){
            return edad>=18;
    }
    private boolean esCorrectaEdad(int edad){
        return 0<=edad && edad<=150;
    }
    public void imprimirDatos(){
        System.out.println("Código: "+getCodigo());
        System.out.println("Nome: "+getNombre());
        System.out.println("Apelidos: "+getApellidos());
        System.out.println("Idade: "+getEdad());
        System.out.println("   -Maior de idade: "+esMayorDeEdad());
        System.out.println("Estatura: "+getEstatura());
        System.out.println("Peso"+getPeso());
        System.out.println("IMC: "+calcularImc());
    }
}
    

