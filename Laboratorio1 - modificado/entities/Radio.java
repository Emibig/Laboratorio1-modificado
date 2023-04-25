package entities;

public class Radio {
    String marcaRadio;
    Double potencia;

    public Radio(String marcaRadio, Double potencia) {
        this.marcaRadio = marcaRadio;
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Radio [marca de la radio=" + marcaRadio + ", potencia=" + potencia + "]";

    }

    public String getMarcaRadio() {
        return marcaRadio;
    }

    public void setMarcaRadio(String marcaRadio) {
        this.marcaRadio = marcaRadio;
    }

    public Double getPotencia() {
        return potencia;
    }

    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }

}
