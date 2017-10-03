package com.doctum.tbd;
public class Principal {

    public static void main(String[] args) {
       ContaCorrete p1 = new ContaCorrete(237,"Josi", 1500);
       System.out.println("~~~~Conta Corrente~~~~");
       System.out.println("Saldo: " + p1.getSaldo());
       p1.depositar(500);
       System.out.println("Saldo: " + p1.getSaldo());
       
       
        ContaCorrenteEspecial p11 = new ContaCorrenteEspecial(1, "Thássio", 2000, 5000);
        
        System.out.println("~~~~Conta Corrente Especial~~~~ ");
        System.out.println("Numero da Conta: " + p11.getNumero() + ", " + p11.getNome() + ", Limite: " + p11.getLimite());
        System.out.println("Saldo: " + p11.getSaldo());
        p11.depositar(1000);
        System.out.println("Saldo: " + p11.getSaldo());
        p11.sacar(1000);
        System.out.println("Saldo: " + p11.getSaldo());
    }
    
}
