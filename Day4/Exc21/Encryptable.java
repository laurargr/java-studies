package Day4.Exc21;

public class Encryptable {

    protected String data;
    public Encryptable () {

    }
    public String encrypt(String data){
        this.data = data;
        return data;
    }
    public String decrypt(String encryptedData){
        this.data = encryptedData;
        return encryptedData;
    }
}
