package Shogi.piezas;

public class Peon extends Piezas{

    //declaracion de variables

    //constructores
    public Peon(){

    }

    public Peon(boolean muerto){
        super();
    }

    @Override
    public int movPieza(int posicionX,int posicionY) {

        return posicionfinal[posicionX][posicionY];
    }

    @Override
    public void piezaComida(boolean muerto) {

    }
}
