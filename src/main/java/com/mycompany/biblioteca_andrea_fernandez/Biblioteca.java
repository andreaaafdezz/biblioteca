/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca_andrea_fernandez;

/**
 *
 * @author jvifdz-PORTATIL
 */

/**
 *
 * @author angel
 */
public class Biblioteca {
    private String bibliotecario;
    private int librosDisponibles;
    private static final int LIMITE_PRESTAMO_ADULTO = 20;
    private static final int LIMITE_PRESTAMO_MENOR = 10;
    private static final int EDAD_MINIMA_ADULTO = 18;

    // Constructor
    public Biblioteca(String bibliotecario, int stockInicial) {
        if (stockInicial < 0) {
            throw new IllegalArgumentException("El stock inicial no puede ser negativo");
        }
        this.bibliotecario = bibliotecario;
        this.librosDisponibles = stockInicial;
    }
    
    // Método para prestar libros
    public String prestarLibros(Usuario usuario, int cantidad) {
        // Validación de usuario nulo
        if (usuario == null) {
            return "Error: Usuario no válido";
        }

        // Validación de cantidad negativa o cero
        if (cantidad <= 0) {
            return "Error: No se pueden prestar cantidades negativas o cero";
        }

        // Validación de usuario penalizado
        if (usuario.isPenalizado()) {
            return "Error: Usuario penalizado, no puede realizar préstamos";
        }

        // Determinar límite según edad y validar
        int limitePermitido;
        if (usuario.getEdad() >= EDAD_MINIMA_ADULTO) {
            limitePermitido = LIMITE_PRESTAMO_ADULTO;
        } else {
            limitePermitido = LIMITE_PRESTAMO_MENOR;
        }

        // Validación de límite de préstamo según edad
        if (usuario.getLibrosPrestados() + cantidad > limitePermitido) {
            return String.format("Error: Excede el límite de préstamos permitidos (%d libros)", limitePermitido);
        }

        // Validación de stock disponible
        if (cantidad > librosDisponibles) {
            return String.format("Error: No hay suficientes libros disponibles. Stock actual: %d", librosDisponibles);
        }

        // Realizar préstamo
        librosDisponibles -= cantidad;
        usuario.actualizarLibrosPrestados(cantidad);
        
        return String.format("Préstamo realizado a %s. Libros prestados: %d. Stock disponible: %d", usuario.getNombre(), usuario.getLibrosPrestados(), librosDisponibles);
    }

    // Método para consultar libros disponibles
    public int getLibrosDisponibles() {
        return librosDisponibles;
    }

    // Método para obtener bibliotecario
    public String getBibliotecario() {
        return bibliotecario;
    }
    
   
    
}



