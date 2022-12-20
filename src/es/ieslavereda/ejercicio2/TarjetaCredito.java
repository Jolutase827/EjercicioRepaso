package es.ieslavereda.ejercicio2;

import es.ieslavereda.ejercicio1.Cuenta;

public class TarjetaCredito {
    private static int next = 0;
    private Cuenta accountAsociated;
    private String cardNumber;
    private String titular;
    private float saldo;
    private float saldoInicial;



    public Cuenta getAsociated(){
        return accountAsociated;
    }
    public String getTitular(){
        return titular;
    }
    public String getCardNumber(){
        return cardNumber;
    }
    public float getSaldo(){
        return saldo;
    }
    public float getSaldoInicial(){
        return saldoInicial;
    }



    public TarjetaCredito(Cuenta accountAsociated, String titular, float saldoInicial){
        this.accountAsociated = accountAsociated;
        cardNumber = "4232 3232 5343 231"+next;
        this.titular = titular;
        saldo = saldoInicial;
        this.saldoInicial = saldoInicial;
    }
    public boolean credit(float cant){
        if (cant>0 && cant<=saldo) {
            saldo -= cant;
            return true;
        }else {
            return false;
        }
    }
    public boolean debit(float cant){
        return accountAsociated.reintegro(cant);
    }

    public boolean SaldarDeuda(){
        if (accountAsociated.reintegro(saldoInicial-saldo)){
            saldo = saldoInicial;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString(){
        return "Titular: " + titular + "\n"+
                "saldo credito: " + saldo+ "\n"+
                "Numero de Targeta " + cardNumber +"\n"+
                "Credito Inical: " + saldoInicial + "\n"+
                "Cuenta Asociada:" + accountAsociated.toString();
    }
}
