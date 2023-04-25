package test;

import entities.Vehiculo;
import entities.Radio;
import entities.AutoNuevo;
import entities.AutoClasico;
import entities.Colectivo;



public class testVehiculo {
    public static void main(String[] args) {

        System.out.println("--------------radio1-----------");
        Radio radio1 = new Radio("Sony AM", 123.00);
        System.out.println("radio 1 " + radio1.toString());

        System.out.println("--------------radio2------------");
        Radio radio2 = new Radio("Panasonic FM", 456.00);
        System.out.println("radio 2 " + radio2.toString());

        System.out.println("------------------------------auto clasico1 con radio----------------------------");
        AutoClasico autoclasico1 = new AutoClasico("Citroen", "Corsa", "celeste", 1000.00, "Noblex", 678.00);
        System.out.println("auto clasico 1 con radio " + autoclasico1.toString());

        System.out.println("----------------------------auto clasico2 sin radio-------------------------------");
        AutoClasico autoclasico2 = new AutoClasico("Chevrolet", "Aveo", "Azul", 5000.00);
        System.out.println("auto clasico 2 sin radio " + autoclasico2.toString());

        // Un Auto Clásico se puede fabricar sin Radio, después se puede agregar 1 Radio

        System.out.println("--------------auto clasico 2 con la radio agregada---------------------------------");
        autoclasico2.setRadio("Philip", 789.00);
        System.out.println("se agrega " + autoclasico2.getRadio());
        System.out.println("nuevo estado de auto clasico 2 con radio " + autoclasico2.toString());

        System.out.println("---------------Auto Nuevo 1 siempre tiene  radio----------");
        AutoNuevo autonuevo1 = new AutoNuevo("BMW", "Bora", "bordo", 5000.00, "Exon", 543.00);
        System.out.println(autonuevo1.toString());

        System.out.println("----------------Auto Nuevo 1----se le cambia la radio----------");
        autonuevo1.setRadio("Dawei", 987.00);
        System.out.println("auto nuevo con otra radio " + autonuevo1.toString());

        System.out.println("----------------Colectivo viene sin radio ----------");
        Colectivo colectivo1 = new Colectivo("107", "tres puertas", "blanco y azul", 10000.00);
        System.out.println(colectivo1.toString());

        System.out.println("----------------Colectivo--se le agrega la radio ----------");
        colectivo1.setRadio("Panasonic 2", 321.00);
        System.out.println("se agrega " + colectivo1.getRadio());
        System.out.println("nuevo estado de colectivo1 con radio " + colectivo1.toString());

        /*
         * 
         * // para testear vehiculo
         * 
         * // Un Vehículo no siempre tiene precio.
         * System.out.
         * println("-------------------vehiculo 1 sin precio y sin radio .---------");
         * Vehiculo vehiculo1 = new Vehiculo("Fiat", "Foca", "floreado", null, null);
         * System.out.println(vehiculo1);
         * // En todos los vehículos se puede agregar una Radio.
         * vehiculo1.nuevaRadio("Noblex 3 ", 222.00);
         * System.out.println("se agrega " + vehiculo1.getRadio());
         * System.out.println("nuevo estado de vehiculo 1 con radio " + vehiculo1);
         * 
         * // Todos los vehículos pueden cambiar de radio.
         * System.out.println("-------------------vehiculo 1 cambio de radio .---------"
         * );
         * vehiculo1.setRadio("Panasonic 3", 111.00);
         * System.out.println("Vehiculo 1 " + vehiculo1);
         */

    }

}
