import java.util.*;
public class Meso extends Namirnica{
    private VrstaMesa vrsta;

    public VrstaMesa getVrsta() {
        return vrsta;
    }

    public void setVrsta(VrstaMesa vrsta) {
        this.vrsta = vrsta;
    }

    public Meso(String zemljaPorijekla,List<Double>nutritivneVrijednosti,VrstaMesa vrsta){
        super(zemljaPorijekla,nutritivneVrijednosti);
        this.vrsta=vrsta;
    }

    public Double DajBrojKalorija(){
        Double kalorije=0.0;
        for(Double vrijednost:nutritivneVrijednosti){
            kalorije+=vrijednost;
        }
        return kalorije*1.20;
    }

    public boolean Zdravlje(Double koeficijentZdravlja){
        return koeficijentZdravlja>0.95;
    }
}
