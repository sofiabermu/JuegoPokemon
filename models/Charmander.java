/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuegopokemon.models;

/**
 *Clase que representa al Pokémon Charmander, el cual es de tipo Fuego
 * Hereda de la clase abstracta Pokemon e implementa la interfaz pokemonFuego
 * @author sofia
 * @version 1.0.0
 * @since 26032025
 */
public class Charmander extends Pokemon implements pokemonFuego {
    
     /**
     * Constructor de la clase Charmander
     * 
     * @param nombre Nombre del Pokémon
     * @param numPokedex Número en la Pokédex
     * @param peso Peso del Pokémon
     * @param temporada Temporada en la que aparece
     */
    
    public Charmander(String nombre, int numPokedex, float peso, int temporada) {
        // constructor de la clase Pokemón
        super(nombre, numPokedex, peso, temporada);
    }
    
    
    /**
     * Realiza un ataque físico de Placaje
     * Muestra un mensaje indicando que el Pokémon usa este ataque
     */
    
    @Override
    public void atacarPlacaje() {
        System.out.println("Soy " + getNombre() + " y estoy atacando con Placaje");
    }
    
    /**
     * Realiza un ataque físico de Arañazo
     * Muestra un mensaje indicando que el Pokémon usa este ataque
     */
    
    @Override
    public void atacarAranazo() {
        System.out.println("Soy " + getNombre() + " y estoy atacando con Arañazo");
    }
    
    /**
     * Realiza un ataque físico de Mordisco
     * Muestra un mensaje indicando que el Pokémon usa este ataque
     */

    @Override
    public void atacarMordisco() {
        System.out.println("Soy " + getNombre() + " y estoy atacando con Mordisco");
    }
    
     /**
     * Realiza un ataque de Puño de Fuego, característico de los Pokémon de tipo Fuego
     * Muestra un mensaje indicando que el Pokémon usa este ataque
     */

    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy " + getNombre() + " y estoy atacando con Puño de fuego");
    }
    
     /**
     * Realiza un ataque de Ascuas, característico de los Pokémon de tipo Fuego
     * Muestra un mensaje indicando que el Pokémon usa este ataque
     */

    @Override
    public void atacarAscuas() {
        System.out.println("Soy " + getNombre() + " y estoy atacando con Ascuas");
    }
    
    /**
     * Realiza un ataque de Lanzallamas, característico de los Pokémon de tipo Fuego
     * Muestra un mensaje indicando que el Pokémon usa este ataque
     */

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy " + getNombre() + " y estoy atacando con lanzallamas");
    } 
}
