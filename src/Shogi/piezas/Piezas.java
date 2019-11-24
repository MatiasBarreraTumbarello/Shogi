package Shogi.piezas;


//esta clase debería controlar los movimientos para cada pieza, y en sus respectivas clases deberían poder sobrescrivir los metodos de esta
public class Piezas extends Posicion{
    //declaración de variables
    private Posicion posicion;
    private boolean muerto = false;
    public int posicionfinal [][];

    //contructor
    public Piezas(){}

    //metodos
    public int movPieza(int posicionX, int posicionY){ //este método va a definir el movimiento de cada pieza, que varía segun de cual pieza se trate

        return posicionfinal[posicionX][posicionY];
    }


    public void piezaComida (boolean muerto){
        muerto = true;
    }//este metodo nos indica si la pieza fue comida por otra (falta desarrollo


    //setters y getters
    public void setPosicion (Posicion posicion){
        this.posicion = posicion;
    }

    public Posicion getPosicion (){
        return posicion;
    }

    public void setMuerto (boolean muerto){
        this.muerto = muerto;
    }

    public boolean getMuerto (){
        return muerto;
    }

   /* public int[][] getPosicionfinal() {
        return posicionfinal;
    }

    public void setPosicionfinal(int[][] posicionfinal) {
        this.posicionfinal = posicionfinal;
    }*/
}
