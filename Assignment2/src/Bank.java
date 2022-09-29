import java.io.Serializable;

class InsufficientAmountException extends Exception{
    public InsufficientAmountException() {
        super();
    }
    public InsufficientAmountException(String m){
        super(m);
    }

}
public abstract class Bank implements Serializable {

    abstract void getDetails();
    abstract void printDetails();


}
