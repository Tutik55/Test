import java.util.*;
public abstract class Namirnica implements Zdravstveno{
    protected String zemljaPorijekla;
    protected List<Double>nutritivneVrijednosti;

    public void setZemljaPorijekla(String zemljaPorijekla){
        this.zemljaPorijekla=zemljaPorijekla;
    }

    public void setNutritivneVrijednosti(List<Double> nutritivneVrijednosti) {
        this.nutritivneVrijednosti = nutritivneVrijednosti;
    }

    public String getZemljaPorijekla(){
        return zemljaPorijekla;
    }

    public List<Double> getNutritivneVrijednosti() {
        return nutritivneVrijednosti;
    }

    public Namirnica(String zemljaPorijekla,List<Double>nutritivneVrijednosti){
        setZemljaPorijekla(zemljaPorijekla);
        setNutritivneVrijednosti(nutritivneVrijednosti);
    }


}
