/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuegopokemon.models;

/**
 * Clase abstracta que representa un Pokémon
 * Contiene atributos básicos y métodos abstractos para ataques comunes
 * 
 * @author SOFIA RUDAS
 * @version 1.0.0
 * @since 26032025
 */
public abstract class Pokemon {
    
    private String nombre;
    private int numPokedex;
    private float peso;
    private int temporada;

    public Pokemon(String nombre, int numPokedex, float peso, int temporada) {
        this.nombre = nombre;
        this.numPokedex = numPokedex;
        this.peso = peso;
        this.temporada = temporada;
    }
    
    /**
     * Obtiene los nombres del Pokemón
     *
     * @return nombre del Pokemón
     */
    
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Obtiene el numero en la pokédex
     *
     * @return numero en la Pokédex
     */
    
    public int getNumPokedex() {
        return numPokedex;
    }
    
    /**
     * Obtiene el peso del Pokemón
     *
     * @return el peso del Pokemón
     */
    
    public float getPeso() {
        return peso;
    }
    
    /**
     * Obtiene la temporada
     *
     * @return la temporada
     */
    
    public int getTemporada() {
        return temporada;
    }
    
    /**
     * Establece el nombre del pokemon
     *
     * @param nombre - nombre del pokemon
     */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece un nuevo número en la Pokédex
     *
     * @param numPokedex - Número en la Pokédex
     */
    
    public void setNumPokedex(int numPokedex) {
        this.numPokedex = numPokedex;
    }
    
    /**
     * Establece el peso del Pokemón
     *
     * @param peso - Peso del pokemón
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    /**
     * Establece la temporada
     *
     * @param temporada - temporada
     */
    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
    
    // metodos abstractos de ataque
    public abstract void atacarPlacaje();
    public abstract void atacarAranazo();
    public abstract void atacarMordisco();
    
}
