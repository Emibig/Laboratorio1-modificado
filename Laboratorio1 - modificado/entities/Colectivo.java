package entities;

public  class Colectivo extends Vehiculo {

    public Colectivo(String marca, String modelo, String color, Double precio) {
        super(marca, modelo, color, precio);
    }

    public Colectivo(String marca, String modelo, String color) {
        super(marca, modelo, color);
    }

    public Colectivo(String marca, String modelo, String color, String marcaRadio, Double potencia) {
        super(marca, modelo, color, marcaRadio, potencia);
    }

    public Colectivo(String marca, String modelo, String color, Double precio, String marcaRadio, Double potencia) {
        super(marca, modelo, color, precio, marcaRadio, potencia);
    }

    @Override
    public String toString() {
        return "Colectivo " + super.toString();
    }
    
}
