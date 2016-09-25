package br.calebe.ticketmachine.exception;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoedaInvalidaException extends Exception {
    
    private static final String PapelInvalido="Papel moeda invalida";
    
    public PapelMoedaInvalidaException(){
        super(PapelInvalido);
    }
    
}
