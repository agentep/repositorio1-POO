
package appupstairs;

public class Trabajador extends Seguimiento {
    
    
   private Persona identificacion;
    private Producto enviarProducto;
   
    
    public void producto(Producto enviarProducto, Persona identificacion){
        
       
        this.enviarProducto = enviarProducto;
        this.identificacion = identificacion;
        
    
    }
    
    
 
    
    public Producto setenviarProducto(){
    return enviarProducto;
    
    }
    
   
    
    
    
    
    
    
    
    
}
