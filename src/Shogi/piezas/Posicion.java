package Shogi.piezas;

public class Posicion {

    //declaración de variables
    private int posicionX;
    private int posicionY;

    //contructores
    public Posicion (){}

    public Posicion(int posicionX, int posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }


    //getters y setters de posición de las piezas
    public void setPosicionX (int posicionX){
        this.posicionX = posicionX;
    }

    public int getPosicionX (){
        return posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }
}
