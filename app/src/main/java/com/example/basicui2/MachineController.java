package com.example.basicui2;

import java.util.ArrayList;
import java.util.List;

public class MachineController {
    private List<MaquinaReciclaje> maquinas;

    public MachineController() {
        maquinas = new ArrayList<>();
    }

    public void agregarMaquina(MaquinaReciclaje maquina) {
        maquinas.add(maquina);
    }

    public void eliminarMaquina(String maquinaId) {
        for (MaquinaReciclaje maquina : maquinas) {
            if (maquina.getCodigo().equals(maquinaId)) {
                maquinas.remove(maquina);
                break;
            }
        }
    }

    public List<MaquinaReciclaje> obtenerMaquinas() {
        return maquinas;
    }
}