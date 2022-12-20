package es.ieslavereda.ejercicio6;

import es.ieslavereda.ejercicio5.Fraccion;

public class Fecha {
    private int dia;
    private int mes;
    private int anyo;

    public Fecha(int dia,int mes,int anyo){
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    public int getAnyo() {
        return anyo;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public boolean comprobarFecha(){
        if (dia>0)
            switch (mes) {
                case (1):
                case (3):
                case (5):
                case (7):
                case (8):
                case (10):
                case (12):
                    if (dia <= 31)
                        return true;

                    return false;
                case (2):
                    if (comprobeBisiesto())
                        if (dia <= 29)
                            return true;

                    if (dia<=28)
                        return true;
                    return false;

                case (4):
                case (6):
                case (9):
                case (11):
                    if (dia<=30)
                        return true;
                    return false;

                default:
                    return false;
            }

        return false;
    }

    public void diaMas(){
        if (!comprobarFecha()){
           dia=1;
           mes = 1;
           anyo =1;
        }
        dia++;
        if (!comprobarFecha()){
            dia = 1;
            mes++;
            if (!comprobarFecha()) {
                mes = 1;
                anyo++;
            }
        }

    }

    private boolean comprobeBisiesto(){
        if (anyo%4==0){
            if (anyo%100==0){
                if (anyo%400==0)
                    return true;
                return false;
            }
            return true;
        }
        return false;
    }


    @Override
    public String toString(){
        return dia+"/"+mes+"/"+anyo;
    }
}
