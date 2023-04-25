package entities;
public class AutoNuevo extends Vehiculo {

    public AutoNuevo(String marca, String modelo, String color, String marcaRadio, Double potencia) {
        super(marca, modelo, color, marcaRadio, potencia);
    }

    public AutoNuevo(String marca, String modelo, String color, Double precio, String marcaRadio, Double potencia) {
        super(marca, modelo, color, precio, marcaRadio, potencia);
    }

    @Override
    public String toString() {
        return "Auto Nuevo " + super.toString();

    }

}
