import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
public class Transaction {
    ICICI b;
    double amt;
    boolean success;
    String failureReason, fileName;
    LocalDateTime time;
    public Transaction(ICICI b,double amt){
        this.b=b;
        this.amt=amt;
        this.success=false;
        this.fileName=b.bankname+".ser";
    }
    void doTransaction(double amt) throws InsufficientAmountException{
        boolean complete=false;
        if(amt>b.balance){
            throw new InsufficientAmountException();
        }
        else{
            b.balance=b.balance+amt;
            complete=true;
        }

    }
     void saveTransaction(boolean complete, double amt){
        try{
            doTransaction(amt);
            success=true;
        }
        catch(InsufficientAmountException e){
            e.printStackTrace();
            failureReason="Insufficient Amount";
        }
        finally{


        }
     void Serializer(){
            try{
                FileOutputStream file=new FileOutputStream(fileName);

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            catch(IOException e){

            }
         }
    }
}
