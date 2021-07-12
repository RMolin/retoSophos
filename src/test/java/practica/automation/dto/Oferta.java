package practica.automation.dto;

import com.google.inject.internal.cglib.core.$DefaultGeneratorStrategy;

public class Oferta {

    private int numero;
    private String nombre;
    private String fecha;
    private String detalle;

    public Oferta(int numero, String nombre, String fecha, String detalle) {
        this.numero = numero;
        this.nombre = nombre;
        this.fecha = fecha;
        this.detalle = detalle;
    }

    public Oferta(){}

    @Override
    public String toString(){
        return "Oferta N°".concat(String.valueOf(numero))
                .concat(":\n").concat(nombre)
                .concat("\n").concat(fecha)
                .concat("\n").concat(detalle);
    }
}
