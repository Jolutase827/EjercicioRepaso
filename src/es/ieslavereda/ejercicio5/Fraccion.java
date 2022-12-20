package es.ieslavereda.ejercicio5;

public class Fraccion {
    private int nominador;
    private int denominador;

    public Fraccion(int nominador, int denominador){
        this.nominador = nominador;
        this.denominador = denominador;
    }

    public int getDenominador() {
        return denominador;
    }

    public int getNominador() {
        return nominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void setNominador(int nominador) {
        this.nominador = nominador;
    }

    public Fraccion sumar(Fraccion fraccion2){
        if (denominador==fraccion2.getDenominador()){

            return new Fraccion(nominador+fraccion2.getNominador(),denominador);
        }
        int nuevoNominadorFraccion1= nominador*fraccion2.getDenominador();
        int nuevoNominadorFraccion2 = fraccion2.getNominador()*denominador;
        return new Fraccion(nuevoNominadorFraccion1+nuevoNominadorFraccion2,denominador*fraccion2.getDenominador());
    }

    public Fraccion restar(Fraccion fraccion2){
        if (denominador==fraccion2.getDenominador()){

            return new Fraccion(nominador-fraccion2.getNominador(),denominador);
        }
        int nuevoNominadorFraccion1= nominador*fraccion2.getDenominador();
        int nuevoNominadorFraccion2 = fraccion2.getNominador()*denominador;
        return new Fraccion(nuevoNominadorFraccion1-nuevoNominadorFraccion2,denominador*fraccion2.getDenominador());
    }

    public Fraccion dividir(Fraccion fraccion2){
        return new Fraccion(nominador*fraccion2.getDenominador(), denominador*fraccion2.getNominador());
    }

    public Fraccion multiplicar(Fraccion fraccion2){
        return new Fraccion(nominador*fraccion2.getNominador(), denominador*fraccion2.getDenominador());
    }

    @Override
    public String toString(){
        return ""+nominador+"\n"+
                "-"+"\n"+
                denominador;
    }

}
