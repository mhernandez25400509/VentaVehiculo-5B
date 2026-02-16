
public class Cliente {
    private String rs;
    private String rfc;
    private String email;
    
   public Cliente(String rs, String rfc, String email){
        this.rs = rs; 
        this.rfc = rfc; 
        this.email = email; 
   }
   
   public String getRs(){ 
       return rs; 
   } 
    public void setRs(String rfc){ 
        this.rs = rs; 
    }
    
    public String getRfc(){ 
       return rfc;
   } 
    public void setRfc(String rfc){ 
        this.rfc = rfc; 
    }
    
    public String getEmail(){ 
       return email; 
   } 
    public void setEmail(String email){ 
        this.email = email; 
    }
    
     @Override 
    public String toString(){ 
        return "Responsabilidad Social" + rs + "\n" + 
               " Registro Federal de Contribuyentes: " + rfc + "\n" + 
               "Email: " + email + "\n" ;
    } 
      
}
