/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;


public class main {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {

        Perro perro = new Perro("Doki","Comida Casera",13,"Blanco-Negro");
        Gato gato = new Gato("Pantera","Wishkas",5,"Verdes");
        Gallo gallo = new Gallo("Lucas","Semillas",2,"Negras");
        Hamster hamster = new Hamster("Toto","Lechuga",2,0);

        //-->Nos muestra los detalles del objeto
        System.out.println("Mascotas");
        System.out.println("");
        perro.mostrar();
        System.out.println("--------------------------------------------------");
        gato.mostrar();
        System.out.println("--------------------------------------------------");
        gallo.mostrar();
        System.out.println("--------------------------------------------------");
        hamster.mostrar();

    }
    
}
