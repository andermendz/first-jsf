
package com.entity;

public class Asociado {
 
    private String nombre;
    private String apellido;
    private int tiempo;
    private int id;
    private int salario;
    private int espc;
    private int insti;
    private float prestaya;

    public Asociado() {
    }

    public Asociado(String nombre, String apellido, int tiempo, int id,int salario, int espc, int insti, float prestaya) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tiempo = tiempo;
        this.id = id;
        this.salario = salario;
        this.espc = espc;
        this.insti = insti;
        this.prestaya = prestaya;
    }

    
    
    public int getSalario(){
        return salario;
    }
    public void setSalario(){
        this.salario = salario;
    }
    
    public float getPrestaya(){
          if (tiempo >= 1 && tiempo < 3) {
            prestaya = salario;
        } else if (tiempo >=3 && tiempo <=5){
            prestaya = (float) (salario*1.2);
            
        } else if (tiempo > 5){
            prestaya = (float) (salario * 1.5);
        } else if (tiempo < 1){
            prestaya = (float) (salario * 0.8);
        }
        return prestaya;
    }
    public void setPrestaya(){
        this.prestaya = prestaya;
    }
    
    public int getInsti(){
       if (tiempo >= 1 && tiempo < 3) {
            insti = salario*0;
        } else if (tiempo >=3 && tiempo <= 5){
            insti = salario*50;
            
        } else if (tiempo > 5){
            insti = salario * 60;
        }
       
        return insti;
    }
    
    public void setInsti(){
        this.insti = insti;
    }
    
    public int getEspc(){
        if (tiempo >= 1 && tiempo < 3) {
            espc = salario*15;
        } else if (tiempo >=3 && tiempo <=5){
            espc = salario*15;
            
        } else if (tiempo > 5){
            espc = salario * 25;
        }
        return espc;
    }
    
    public void setEspc(){
        this.espc = espc;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setPlaca(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public int getTiempo() {
        
        return tiempo;
    }
   

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
     
    }

 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
