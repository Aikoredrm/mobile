package com.example.basicui2;

import java.util.ArrayList;
import java.util.List;

public class AdminController {
    private List<Persona.Administrador> admins;

    public AdminController() {
        admins = new ArrayList<>();
    }

    public void agregarAdmin(Persona.Administrador admin) {
        admins.add(admin);
    }

    public void eliminarAdmin(String adminId) {
        for (Persona.Administrador admin : admins) {
            if (admin.getId().equals(adminId)) {
                admins.remove(admin);
                break;
            }
        }
    }

    public List<Persona.Administrador> obtenerAdmins() {
        return admins;
    }
}