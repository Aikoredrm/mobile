package com.example.basicui2;


public class MaquinaReciclaje {
    private String codigo;
    private String ubicacion;
    private int nivelGas;

    // Constructor
    public MaquinaReciclaje(String codigo, String ubicacion) {
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        this.nivelGas = 0; // O el valor inicial que desees
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getNivelGas() {
        return nivelGas;
    }

    public void setNivelGas(int nivelGas) {
        this.nivelGas = nivelGas;
    }

}
