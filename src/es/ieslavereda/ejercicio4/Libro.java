package es.ieslavereda.ejercicio4;

public class Libro {
    private static int next = 1;
    private String nombre;

    private int replica;
    private boolean tengoLibro;

    public Libro(String nombre){
        this.nombre = nombre;
        tengoLibro = true;
        replica = next;
        next++;
    }

    public boolean prestamo(){
        if (tengoLibro){
            tengoLibro = false;
        }
        return tengoLibro;
    }

    public boolean devolucion(){
        if (!tengoLibro){
            tengoLibro = true;
            return true;
        }
        return false;
    }

    public int getReplica(){
        return replica;
    }
    public String getNombre(){
        return nombre;
    }
    public boolean getTengoLibro(){
        return tengoLibro;
    }
    public void setTengoLibro(boolean tengoLibro){
        this.tengoLibro = tengoLibro;
    }
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public void setReplica(int replica){
        this.replica = replica;
    }


    @Override
    public String toString(){
        return "Nombre: " + nombre + "\n"+
                "Replica: " + replica + "\n"+
                "Tengo libro: "+ tengoLibro;
    }


}
