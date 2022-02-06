package tablero;

//Ejercicio 1: Construir un programa que calcule el área y el perímetro de un cuadrilátero
//dada la longitud de sus dos lados. 

//Los valores de la longitud deberán introducirse por línea de ordenes. 
//Si es un cuadrado, sólo se proporcionará la longitud de uno de los lados al constructor.

public class Tablero {
       
        //atributos
        private int x;
        private int y;
     
        
        
        // metodo constructor
        public Tablero(int x, int y){
            this.x = x;
            this.y = y;
        }
        // metodos
        
        public void moverArriba(int incremento){
            y += incremento;
        }
        
         public void moverAbajo(int decremento){
            y += decremento;
        }
         
         public void moverDerecha(int incremento){
            x += incremento;
        }
        
         public void moverIzquierda(int decremento){
            y += decremento;
        }

         //getters
    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }
        
     
}
