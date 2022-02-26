package proyecto.programacion;
public class Empleado {
    
    private String nombre;
    private String apellido;
    private int ID;
    private char sexo;
    private int fechaNacimiento;
    
    public Empleado(){
        nombre = " ";
        apellido = " ";
        ID = 0;
        sexo = ' ';
        fechaNacimiento=0;
    }
    
    public Empleado(String nombreEmp,String apellidoEmp,int IDEmp, char sex,int fecha){
        nombre = nombreEmp;
        apellido = apellidoEmp;
        ID = IDEmp;
        sexo = sex;
        fechaNacimiento = fecha;
    }

    
    //Metodos de Modificar el Nombre del Empleado
    public void setNombre(String _nombre){
        this.nombre = _nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    //Metodos de Modificar el Apellido del Empleado
    public void setApellido(String _apellido){
        this.apellido = _apellido;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    //Metodos para modificar el ID del Empleado
    public void setID(int _ID){
        this.ID = _ID;
    }
    
    public int getID(){
        return this.ID;
    }
        
    // Metodos para modificar el Sexo del Empleado
    public void setSexo(char _sexo){
        this.sexo = _sexo;
    }
    
    //Metodo para saber si el Empleado es hombre o mujer.  
    public String getSexo(){
        char sex = "M".charAt(0);
        
        if(sex == this.sexo) {
            return "MASCULINO";
            
        }else{
            return "FEMENINO";
        }
    }

    
    
    //Metodo para Modificar la Fecha de Nacimiento del Empleado
    public void setFechaNacimiento(int _fechaNacimiento){
        this.fechaNacimiento = _fechaNacimiento;
    }
    
    
    
    // Metodo para Calcular la Edad del Empleado
    public int getEdad(){
        int edad;
        edad = 2022 -fechaNacimiento;
        return edad;
 
    }
    
    
}
