package Shogi.tablero;

public class Tablero { //esta clase es para generar un tablero ya que no se puede trabajar sin un lugar donde poder colocar nuestras piezas

    //contructor
    public Tablero (){}

    public void generarTablero (){

        System.out.print("--------------------------");
        System.out.println();
        for (int i = 0; i < 9; i++){ //este doble bucle ayuda a generar la matriz (que es nuestro tablero)
            System.out.print(i+1+" | ");
            for (int j = 0; j < 9; j++){
                System.out.print(" -");
            } System.out.println(" | ");
        }System.out.print("--------------------------");
    }
}
