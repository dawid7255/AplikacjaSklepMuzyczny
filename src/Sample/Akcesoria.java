package Sample;

public class Akcesoria extends Produkt {
    private String rodzaj;
    private String producent;


    public Akcesoria(String nazwa, Float cena, String producent, String rodzaj) {
        super(nazwa, cena);
        this.producent = String.valueOf(producent);
        this.rodzaj=rodzaj;
    }

    public Akcesoria() {
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getRodzaj(){ return rodzaj;}

    public void setRodzaj(String rodzaj) {this.rodzaj=rodzaj;}
}