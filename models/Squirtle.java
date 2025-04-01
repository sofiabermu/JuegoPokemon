/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuegopokemon.models;

/**
 * Clase que representa al Pokémon Squirtle, el cual es de tipo Agua
 * Hereda de la clase abstracta Pokemon e implementa la interfaz pokemonAgua
 * @author SOFIA RUDAS
 * 
 * @version 1.0.0
 * @since 26032025
 */
public class Squirtle extends Pokemon implements pokemonAgua {
    
     /**
     * Constructor de la clase Squirtle
     * 
     * @param nombre Nombre del Pokémon
     * @param numPokedex Número en la Pokédex
     * @param peso Peso del Pokémon
     * @param temporada Temporada en la que aparece
     */
    
    public Squirtle(String nombre, int numPokedex, float peso, int temporada) {
        //constructor clase Pokemón
        super(nombre, numPokedex, peso, temporada);
    }
    
    /**
     * Realiza un ataque básico de placaje
     * Muestra un mensaje indicando que el Pokémon usa este ataque
     */

    @Override
    public void atacarPlacaje() {
        System.out.println("Soy " + getNombre() + " y estoy atacando con Placaje");
    }
    
    /**
     * Realiza un ataque de arañazo
     * Muestra un mensaje indicando que el Pokémon usa este ataque
     */

    @Override
    public void atacarAranazo() {
        System.out.println("Soy " + getNombre() + " y estoy atacando con Arañazo");
    }
    
    /**
     * Realiza un ataque de mordisco
     * Muestra un mensaje indicando que el Pokémon usa este ataque
     */

    @Override
    public void atacarMordisco() {
        System.out.println("Soy " + getNombre() + " y estoy atacando con Mordisco");
    }
    
    /**
     * Realiza un ataque de Hidrobomba, característico de los Pokémon de agua
     * Muestra un mensaje indicando que el Pokémon usa este ataque
     */

    @Override
    public void atacarHidrobomba() {
        System.out.println("Soy " + getNombre() + " y estoy atacando con Hidro Bomba");
    }
    
    /**
     * Realiza un ataque de Pistola Agua, característico de los Pokémon de agua
     * Muestra un mensaje indicando que el Pokémon usa este ataque
     */

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy " + getNombre() + " y estoy atacando con Pistola de agua");
    }
    
    /**
     * Realiza un ataque de Burbuja, característico de los Pokémon de agua
     * Muestra un mensaje indicando que el Pokémon usa este ataque
     */

    @Override
    public void atacarBurbuja() {
        System.out.println("Soy " + getNombre() + " y estoy atacando con Burbuja");
    }
    
     /**
     * Realiza un ataque de Hidropulso, característico de los Pokémon de agua
     * Muestra un mensaje indicando que el Pokémon usa este ataque
     */

    @Override
    public void atacarHidropulso() {
        System.out.println("Soy " + getNombre() + " y estoy atacando con Hidropulso");
    } 
    
}
