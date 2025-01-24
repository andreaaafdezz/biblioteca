/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca_andrea_fernandez;

/**
 *
 * @author jvifdz-PORTATIL
 */
public class Usuario {
        private final int edad;
        private final String nombre;
        private boolean penalizado;
        private int librosPrestados;
       

        public Usuario(String nombre, int edad) {
            if (edad < 0) {
                throw new IllegalArgumentException("La edad no puede ser negativa");
            }
            this.nombre = nombre;
            this.edad = edad;
            this.penalizado = false;
            this.librosPrestados = 0;
        }

        public void actualizarLibrosPrestados(int cantidad) {
            this.librosPrestados += cantidad;
        }
        
    }
        public void getNombre() {
        
    }
 public void getEdad() {
        
      }
    
 

}
