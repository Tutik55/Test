import javax.sound.sampled.Port;
import java.util.*;
public class Prodavac {
    private String ime,prezime,brojStanda,ID;

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getBrojStanda() {
        return brojStanda;
    }

    public String getID() {
        return ID;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setBrojStanda(String brojStanda) {
        this.brojStanda = brojStanda;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Prodavac(String ime,String prezime,String brojStanda,String ID){
        setIme(ime);
        setPrezime(prezime);
        setBrojStanda(brojStanda);
        setID(ID);
    }

    public boolean Zdravlje(){
        return ID.endsWith("01");
    }


}
