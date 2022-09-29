import java.io.*;

public class BOB extends Bank{
    public BOB( long accNumber, double balance) {
        this.ifsc = "BOB0000039";
        this.bankName = "BOB";
        this.rateOfInterest = 3.25;
        this.balance = balance;
        this.accNumber = accNumber;
        this.t=accType.CURRENT;
    }
    @Override
    public void saveToFile(String s) {
        try{
            File file=new File("files/"+bankName+".txt");
            if(!file.exists()){
                file.createNewFile();
            }
            BufferedWriter b=new BufferedWriter(new FileWriter(file,true));
            b.write(s);
            b.newLine();
            b.close();
        } catch (IOException e) {
            System.out.println("Error Occured");
        }

    }

    @Override
    public void readFile() {
        System.out.println("\nBOB BANK LOGS: ");
        try(BufferedReader b=new BufferedReader(new FileReader( "files/"+bankName+".txt"))){
            String line;
            while((line=b.readLine())!=null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not Found");
        }
        catch (IOException e) {
            System.out.println("Error Occurr ed");
        }
    }

}
