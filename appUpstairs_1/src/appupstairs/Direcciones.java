package appupstairs;

public class Direcciones {

    private String ciudad;
    private String direccion;
    private String fechaEntrega;
    private String calle;

    //las direccion donde se va a mandar el paquete
    public void direcciones(String ciudad, String direccion, String fechaEntrega, String calle) {

        this.ciudad = "cali";
        this.direccion = "jorge";
        this.fechaEntrega = "4/17/2035";
        this.calle = "martilld";

    }

    public String getciudad() {

        return ciudad;
    }

    public String getdireccion() {
        return direccion;

    }
       public String setdirecciones(){
    
    return direccion;
    }
    

    public String getfechaEntrega() {
        return fechaEntrega;

    }

    public String getcalle() {
        return calle;

    }
    
    
    public String setinformacion(){
        
        return "tu producto esta en la ciudad "+ciudad+"\ndireccion :"+direccion+"\ncalle :"+calle+"\nsu producto se entrega en: "+fechaEntrega;
    
    }

}
