package com.doctum.tbd;
public class ContaCorrenteEspecial extends ContaCorrete {
    private double limite;

    public ContaCorrenteEspecial(int numero, String nome, double saldo,double limite) {
        super(numero, nome, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    @Override
       public void sacar(double valorSaque){
       if (valorSaque > 0 ){
           if (valorSaque <= this.limite){
               this.setSaldo(this.getSaldo() - valorSaque);
               System.out.println("Saque realizado na conta de " + this.getNome());
           }
           else{
               System.out.println("Impossivel SACAR!!!");
           }
       }
       else{
           System.out.println("Impossivel SACAR!!!");
       }
   }
}
