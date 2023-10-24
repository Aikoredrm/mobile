package com.example.basicui2;

public class Persona {
    private String rut;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    // Constructor
    public Persona(String rut, String nombre, String apellido, String email, String telefono) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    // Getters y Setters
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public class Administrador extends Persona {
        private String id;
        private String username;
        private String password;

        // Constructor
        public Administrador(String rut, String nombre, String apellido, String email, String telefono,
                             String id, String username, String password) {
            super(rut, nombre, apellido, email, telefono);
            this.id = id;
            this.username = username;
            this.password = password;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        // ... Resto de Getters y Setters
    }

    public class FinalUser extends Persona {
        private int id;
        private String username;
        private String password;
        private int puntos;

        // Constructor
        public FinalUser(String rut, String nombre, String apellido, String email, String telefono,
                         int id, String username, String password) {
            super(rut, nombre, apellido, email, telefono);
            this.id = id;
            this.username = username;
            this.password = password;
            this.puntos = 0; // O el valor inicial que desees
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public int getPuntos() {
            return puntos;
        }

        public void setPuntos(int puntos) {
            this.puntos = puntos;
        }

        // ... Resto de Getters y Setters
    }

}
