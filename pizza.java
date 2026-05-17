public class pizza {
   private String nombre;
   private String[] ingredientes;

public pizza(String nombre, String[] ingredientes){
    this.nombre=nombre;
    this.ingredientes=new String[3];
    for(int=i;i<3;i++){
        this.ingredientes[i]=ingredientes[i];
    }
}
public String getNombre(){
    return nombre;
}
public String[] getIngredientes(){
    return ingredientes;
}
}
}
