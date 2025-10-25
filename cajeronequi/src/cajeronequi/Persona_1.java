
package cajeronequi;

/*
 *
 * @author LENOVO
 */

public class Persona_1 {
    private String nombre;
    private String numero;
    private String persona;

    public Persona_1(String nombre) {
        this.nombre = nombre;
        this.numero = "324324";
    }

    public String getNombre() {
        return nombre;
    }

    public String setmostrarInfo() {
        return "Nombre:" + nombre+"\nnumero de cuenta: "+numero;
    }
}
