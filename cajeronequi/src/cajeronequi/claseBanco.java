
package cajeronequi;

/**
 *
 * @author LENOVO
 */

public class claseBanco  {

    private Persona_1 persona;
    private String cuentaID;
    

    public claseBanco(String cuentaID, Persona_1 persona) {

        this.cuentaID = cuentaID;
        this.persona = persona;
  

    }

    private Persona_1 getpersona() {
        return persona;

    }

   

    public String getcuentaID() {
        return cuentaID;
    }

}
