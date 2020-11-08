package com.example.ej_semana_3.entities;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

import java.io.Serializable;


public class Mascota implements Serializable {

    private String nombre;
    private Bitmap imagen;
    private int rating;


    public Mascota(String nombre, Bitmap imagen, int rating) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.rating = rating;
    }

    public String getNombre() {
        return nombre;
    }

    public Bitmap getImagen() {
        return imagen;
    }

    public int getRating() {
        return rating;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setImagen(Bitmap imagen) {
        this.imagen = imagen;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }




}
