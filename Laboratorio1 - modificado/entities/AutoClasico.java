package entities;


public class AutoClasico extends Vehiculo {

    public AutoClasico(String marca, String modelo, String color, Double precio) {
        super(marca, modelo, color, precio);
    }

    public AutoClasico(String marca, String modelo, String color) {
        super(marca, modelo, color);
    }

    public AutoClasico(String marca, String modelo, String color, String marcaRadio, Double potencia) {
        super(marca, modelo, color, marcaRadio, potencia);
    }

    public AutoClasico(String marca, String modelo, String color, Double precio, String marcaRadio, Double potencia) {
        super(marca, modelo, color, precio, marcaRadio, potencia);
    }

    @Override
    public String toString() {
        return "Auto Clasico " + super.toString();

    }

}
