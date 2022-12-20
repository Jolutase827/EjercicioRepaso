package es.ieslavereda.ejercicio1;

public class Cuenta {
    private static int siguient = 0;
    private float saldo;
    private String numeroCuenta;
    private String titular;

    public Cuenta(float saldo, String numeroCuenta, String titular){
        this.numeroCuenta= numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;

    }
    public Cuenta( String titular){
        this.titular=titular;
        this.numeroCuenta = "0182- 1234-32-"+ siguient;
        siguient++;
    }
    public Cuenta( String numeroCuenta, String titular){
        this.numeroCuenta= numeroCuenta;
        this.titular = titular;
    }
    public Cuenta(){
        numeroCuenta = "Desconocido";
        titular = "Desconocido";
        saldo = 0;
    }
     public float getSaldo(){
        return saldo;
     }
     public String getNumeroCuenta(){
        return numeroCuenta;
     }
     public String getTitular(){
        return titular;
     }
     public void setSaldo(float newSaldo){
        saldo = newSaldo;
     }
     public void setNumeroCuenta(String newNumeroCuenta){
        numeroCuenta = newNumeroCuenta;
     }
     public void setTitular(String newTitular){
        titular = newTitular;
     }
     public boolean reintegro(float cant){
        if (cant>0&&cant<=saldo) {
            saldo -= cant;
            return true;
        }else {
            return false;
        }
     }
     public boolean ingreso(float cant){
        if (cant>0) {
            saldo += cant;
            return true;
        }else {
            return false;
        }
     }
     public boolean transferencia( float cant, Cuenta accountDestination){
        if (reintegro(cant)) {
            if (accountDestination.ingreso(cant)) {
                return true;
            }else {
                ingreso(cant);
                return false;
            }
        }else {
            return false;
        }
     }


     @Override
    public String toString(){
        return "Titular: "+ titular +"\n"+
                "Numero de Cuenta: " + numeroCuenta +"\n"+
                "Saldo: " + saldo + "€\n";
     }
}
