package javaapplication1;

import nuevoPaquete.ClaseDos;

 
public class JavaApplication1 {
    private int contador;

    public static void main(String[] args) {
        JavaApplication1 jp1=new JavaApplication1 ();
        
        

        for (jp1.contador = 0; jp1.contador < 10; jp1.contador++) {
            System.out.println("imprimiendo el contador \n\n\n" +jp1.contador);
        }
        
        ClaseDos cd1 = new ClaseDos();
        System.out.println("atributos clasedos "+cd1.otraCosa);
        
        ClaseTres ct1 = new ClaseTres();
        System.out.println("atributos clasetres "+ct1.prot);
        System.out.println("atributos clasetres "+ct1.j);

    }

}
