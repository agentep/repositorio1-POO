
package appupstairs;

public class Usuario{
    
    private String correo;
    private Persona usuario;
    private int telefono;
    private Producto producto;
    private String contraseña;
    
    
    public Usuario(String correo, Persona usuario,int telefono, String contraseña){
    
    this.correo = correo;
    this.usuario = usuario;
    this.telefono = telefono;
    this.contraseña = contraseña;
    
    }
    
    
    public String getcorreo(){
        return correo;
}
    
    public String setcorreo(){
    return correo;
    
    }
    
    public Persona getusuario(){
    return usuario;
    
    }
    
    public Persona setusuario(){
    return usuario;
    
    }
    
    public String setinformacionUsuario(){
    
    return  "el usuario "+usuario+" te envio: "+producto;
    
    }
    
    
    
    
}
