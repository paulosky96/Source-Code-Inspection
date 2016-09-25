package br.calebe.ticketmachine.exception;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class SaldoInsuficienteException extends Exception {
    private static final String SaldoInsuficiente="Saldo insuficiente";
    
    public SaldoInsuficienteException(){
        super(SaldoInsuficiente);
    }
    
}
