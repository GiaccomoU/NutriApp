package com.example.giaccomo.controlnutricional;

/**
 * Created by Giaccomo on 05/04/2016.
 */
public class Persona {
    int idPersona;
    String nombre;
    String correo;
    String contrasenia;
    int edad;
    String sexo;
    int estatura;
    int peso;
    int idActividadFisica;

    public Persona(int pIdPersona, String pNombre, String pCorreo, String pContrasenia, int pEdad,
                   String pSexo, int pEstatura, int pPeso, int pIdActividadFisica){
        this.idPersona = pIdPersona;
        this.nombre = pNombre;
        this.correo = pCorreo;
        this.contrasenia = pContrasenia;
        this.edad = pEdad;
        this.sexo = pSexo;
        this.estatura = pEstatura;
        this.peso = pPeso;
        this.idActividadFisica = pIdActividadFisica;
    }



}


