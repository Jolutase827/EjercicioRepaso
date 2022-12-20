package es.ieslavereda.ejercicio3;

public class Contador {
    private int amount;

    public Contador(){
        amount=0;
    }

    public void  increase(){
        amount++;
    }
    public void decrease(){
        amount--;
    }
    public int getAmount(){
        return amount;
    }
    public void setAmount(int newAmount){
        this.amount= newAmount;
    }

    @Override
    public String toString(){
        return "Ammount="+ amount;
    }
}
