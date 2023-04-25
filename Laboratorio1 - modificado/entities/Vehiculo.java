package entities;

public abstract class Vehiculo {

    // atributos
    private String marca;
    private String modelo;
    private String color;
    private Double precio;
    private Radio radio;

    // sin radio y sin precio

    // vehiculo sin radio y con precio
    public Vehiculo(String marca, String modelo, String color, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    // vehiculo sin radio y sin precio
    public Vehiculo(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    // Un vehiculo con radio y sin precio
    public Vehiculo(String marca, String modelo, String color, String marcaRadio, Double potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.radio = new Radio(marcaRadio, potencia);
    }

    // un Vehiculo siempre tiene radio y esa radio es 1 a 1, con precio
    public Vehiculo(String marca, String modelo, String color, Double precio, String marcaRadio, Double potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.radio = new Radio(marcaRadio, potencia);
        ;
    }

    @Override
    public String toString() {
        return " [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", precio=" + precio
                + ", radio=" + radio + "]";
    }

    public void nuevaRadio(String marcaRadio, Double potencia) {
        radio = new Radio(marcaRadio, potencia);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Radio getRadio() {
        return radio;
    }

    public void setRadio(String marcaRadio, Double potencia) {
        this.radio = new Radio(marcaRadio, potencia);

    }

}
