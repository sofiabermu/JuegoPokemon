/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuegopokemon.models;

/**
 * Clase que representa al Pokémon Pikachu el cual es de tipo Electrico
 * Hereda de la clase abstracta Pokemon e implementa la interfaz pokemonElectrico
 * @author sofia
 * @version 1.0.0
 * @since 26032025
 */
public class Pikachu extends Pokemon implements pokemonElectrico{
    
     /**
     * Constructor de la clase Pikachu
     * 
     * @param nombre Nombre del Pokémon
     * @param numPokedex Número en la Pokédex
     * @param peso Peso del Pokémon
     * @param temporada Temporada en la que aparece
     */
    public Pikachu(String nombre, int numPokedex, float peso, int temporada) {
        //constructor clase Pokemón
        super(nombre, numPokedex, peso, temporada);
    }
    
    /**
     * Realiza un ataque de Impactrueno, característico de los Pokémon de tipo Eléctrico
     * Muestra un mensaje indicando que el Pokémon usa este ataque
     */
    
    @Override
    public void atacarImpactrueno(){
        System.out.println("Soy " + getNombre() + " y estoy atacando con Impactrueno");
    }
    
    /**
     * Realiza un ataque de Puño Trueno, característico de los Pokémon de tipo Eléctrico
     * Muestra un mensaje indicando que el Pokémon usa este ataque
     */
    
    @Override
    public void atacarPunioTrueno(){
        System.out.println("Soy " + getNombre() + " y estoy atacando con Puño Trueno");
    }
    
    /**
     * Realiza un ataque de Rayo, característico de los Pokémon de tipo Eléctrico
     * Muestra un mensaje indicando que el Pokémon usa este ataque
     */
    
    @Override
    public void atacarRayo(){
        System.out.println("Soy " + getNombre() + " y estoy atacando con Rayo");
    }
    
    /**
     * Realiza un ataque de Rayo Carga, característico de los Pokémon de tipo Eléctrico
     * Muestra un mensaje indicando que el Pokémon usa este ataque
     */
    
    @Override
    public void atacarRayoCarga(){
        System.out.println("Soy " + getNombre() + " y estoy atacando con Rayo Carga");
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
}
