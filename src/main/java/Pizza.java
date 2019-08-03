public class Pizza {

    public String getNazwa() {
        return nazwa;    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    private double cena;
    private String nazwa;

    public Pizza(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }
}
