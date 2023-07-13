package model.exception;

public class DomainException extends RuntimeException{ // Exception obriga a tratar o erro, Runtime não
    private static final long serialVersionUID = 1L;

    public DomainException(String msg){
        super(msg);
    }
}


