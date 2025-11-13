
package appupstairs;



public class Seguimiento {
    
    private String seguirProducto;
    private Direcciones direcciones;
    private Producto enviarProducto;
    
    public void seguimiento (String seguirProducto, Producto enviarProducto){
    
        this.enviarProducto = enviarProducto;
        this.seguirProducto = seguirProducto;
        
        
    }
    
    public String getseguimiento(){
        return seguirProducto;

}
    
    
     public String setseguirProducto(){
    
    return seguirProducto;
    }
    
    
    
}
