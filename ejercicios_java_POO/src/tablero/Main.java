
package tablero;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int x;
        int y;
        int opcion;
        int incremento = 0;
        
        
       
        System.out.println("Digite la posicion inicial de x: ");
        x = input.nextInt();
        
        
        System.out.println("Digite la posicion inicial de y: ");
        y = input.nextInt();
        
        
        Tablero tablero = new Tablero(x, y);
        
        do{
                
            System.out.println("\t Menu");
            System.out.println("1. Mover hacia arriba");
            System.out.println("2. Mover hacia abajo");
            System.out.println("3. Mover hacia la derecha");
            System.out.println("4. Mover hacia la izquierda");
            System.out.println("5. Opcion Salir");
            
            System.out.print("Digite una opcion: ");
            opcion = input.nextInt();
            
            if (opcion != 5){
                System.out.println("\nDigite el incremento o decremento de la coordenada: ");
                incremento = input.nextInt();
            }
            
            switch (opcion){
                
                case 1: 
                    tablero.moverArriba(incremento);
                    break;
                case 2: 
                    tablero.moverAbajo(incremento);
                    break;
                case 3: 
                    tablero.moverDerecha(incremento);
                    break;
                case 4: 
                    tablero.moverIzquierda(incremento);
                    break;
                case 5:
                    System.out.println("La posicion actual es (" + tablero.getX() + ","
                    + tablero.getY()+ ")");
                    break;
                default: 
                    System.out.println("\nLa opcion no existe, vualva a digitar");
                    break;
                
            }
        }while(opcion != 5);
        
        
    
}
}