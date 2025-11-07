import java.util.*;
public class Povrce extends Namirnica{
    private String latinskiNaziv;

    public void setLatinskiNaziv(String latinskiNaziv){
        this.latinskiNaziv=latinskiNaziv;
    }

    public String getLatinskiNaziv(){
        return latinskiNaziv;
    }

    public Povrce(String zemljaPorijekla,List<Double>nutritivneVrijednosti,String latinskiNaziv){
        super(zemljaPorijekla,nutritivneVrijednosti);
        setLatinskiNaziv(latinskiNaziv);
    }

    public Double DajBrojKalorija(){
        Double kalorije=0.0;
        for(Double vrijednost:nutritivneVrijednosti){
            kalorije+=vrijednost;
        }
        return kalorije;
    }

    public boolean Zdravlje(Double koeficijentZdravlja){
        return (DajBrojKalorija()<100 && (koeficijentZdravlja>0.5 && koeficijentZdravlja<0.7));
    }


}
