/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author alan
 */
public class PruebaPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona obxetoPersoa=new Persona();
        /*Por exercicio 9 deixo todo esto comentado para poder executar:
        obxetoPersoa.nombre="Jose María";
        obxetoPersoa.apellidos= "Castro Pelaez";
        obxetoPersoa.edad=12;
        obxetoPersoa.estatura=1.70f;
        obxetoPersoa.peso=72.66f;
        System.out.printf("A persoa chamada %s, con apelidos %s,\nten por idade %d anos, da uns %.1f Kg de peso e ten uns %.2fm de estatura\n", obxetoPersoa.nombre,obxetoPersoa.apellidos, obxetoPersoa.edad, obxetoPersoa.peso, obxetoPersoa.estatura);
        System.out.println("Proceso de cambio de nome: ...\n...\n...\n...");
        obxetoPersoa.nombre="Xoan";
        obxetoPersoa.apellidos="Castrinho Pereira";
        System.out.println("O novo nome que escolleu foi: "+ obxetoPersoa.nombre+ "\ncon apelidos: "+obxetoPersoa.apellidos);
        System.out.println("");//Exercicio 3
        Persona usuario=new Persona();
        usuario.nombre="Maria Elena";
        System.out.println("Nome do usuario (Exercicio 3): "+usuario.nombre);
        usuario.nombre="Pepa";
        System.out.println("Cambio de nome de usuario a: "+usuario.nombre);
        //Non podemos asignar desde fora da clase donde esta o campo codigo como variable privada valores
        //Exercicio5
        System.out.println("");//Espacio para diferenciar resultados exercicio por consola
        Persona usuario2=new Persona();
        System.out.printf("Valores de usario codigo: %d\n\tNome: %s\n\tApelidos: %s\n\tIdade: %d\n\tEstatura: %.2f\n\tPeso: %.1f\n",usuario2.codigo, usuario2.nombre, usuario2.apellidos, usuario2.edad, usuario2.estatura, usuario2.peso);
        // PREGUNTA:    seria mellor evitar estas lineas tan longas dividindoo en varios mensaxes de saida?
        System.out.println("");//Exercicio7
        Persona usuario3=new Persona("Jaime", "Cortizo Pinton", 526038, (byte) 31,(float) 76.543,(float) 1.6946);
        System.out.println("Listado de valores usuario codigo: "+usuario3.codigo);
        System.out.println("\tNome: "+usuario3.nombre);
        System.out.println("\tApelidos: "+usuario3.apellidos);
        System.out.println("\tIdade: "+usuario3.edad);
        System.out.println("\tEstatura: "+usuario3.estatura);
        System.out.println("\tPeso: "+usuario3.peso);
        */
        obxetoPersoa.setNombre("Eustaquio");
        System.out.println("nome: "+obxetoPersoa.getNombre());
        obxetoPersoa.setCodigo(754578);
        System.out.println("Proba codigo: "+obxetoPersoa.getCodigo());
        obxetoPersoa.setEdad((byte) 56);
        System.out.println("Proba byte idade: "+obxetoPersoa.getEdad());
        Persona personaProbaExer9=new Persona("Jose Maria", "De Los Santos De La Torre", 836786,(byte) 67,(float) 89.700,(float) 1.77);
        System.out.println("Valores del bueno de Josema:");
        System.out.println("\tCódigo: "+personaProbaExer9.getCodigo());
        System.out.println("\tNome: "+personaProbaExer9.getNombre());
        System.out.println("\tApelidos: "+personaProbaExer9.getApellidos());
        System.out.printf("\tIdade: %d\n\tEstatura: %.2f\n\tPeso: %.1f\n", personaProbaExer9.getEdad(), personaProbaExer9.getEstatura(), personaProbaExer9.getPeso());
        
        System.out.println(personaProbaExer9.esMayorDeEdad());
        obxetoPersoa.setEdad (120);
        System.out.println(obxetoPersoa.getEdad());
        personaProbaExer9.imprimirDatos();
        // PREGUNTA: mensaxe error que produce o setEdade
    }   
    
    
}
