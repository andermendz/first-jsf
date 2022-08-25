package com.controller;

import com.entity.Asociado;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AsociadoController implements Serializable {

    private List<Asociado> asociados = new LinkedList();
    private List<Asociado> asociadosc = new LinkedList();



    public AsociadoController() {
        generarAsociado();
    }
    


    public void consultar(Asociado a) {
        asociadosc.add(a);
    }

    
    public void generarAsociado() {
        getAsociados().add(new Asociado("Receba", "Abrigadomuitupredeu", 0, 10221,1000000, 0,0,0));
        getAsociados().add(new Asociado("Pepe", "Toño", 1, 14242,2000000, 0,0,0));
        getAsociados().add(new Asociado("Marco", "Pres", 2, 10313,3000000, 0,0,0));
        getAsociados().add(new Asociado("Jesus", "Eres", 3, 10452,4000000, 0,0,0));
        getAsociados().add(new Asociado("Paula", "Martinez",4,13133,5000000, 0,0,0));
        getAsociados().add(new Asociado("El", "Chapo",5,13133,6000000, 0,0,0));
        getAsociados().add(new Asociado("Federico", "Gutierrez", 6, 13332,6000000,0,0,0));
        getAsociados().add(new Asociado("Akira", "Toriyama",4, 44241,5000000, 0,0,0));
       
    }


    public List<Asociado> getAsociados() {
        return asociados;
    }


    public void setAsociados(List<Asociado> asociados) {
        this.asociados = asociados;
    }

 
    public List<Asociado> getAsociadosc() {
        return asociadosc;
    }


    public void setAsociadosc(List<Asociado> asociadosc) {
        this.asociadosc = asociadosc;
    }



}
