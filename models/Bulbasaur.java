/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuegopokemon.models;

/**
 * Clase que representa al Pokémon Bulbasaur el cual es de tipo planta
 * Hereda de la clase abstracta Pokemon e implementa la interfaz pokemonPlanta
 * @author sofia
 * @version 1.0.0
 * @since 26032025
 */
public class Bulbasaur extends Pokemon implements pokemonPlanta{
    
     /**
     * Constructor de la clase Bulbasaur
     * 
     * @param nombre Nombre del Pokémon
     * @param numPokedex Número en la Pokédex
     * @param peso Peso del Pokémon
     * @param temporada Temporada en la que aparece
     */
    public Bulbasaur(String nombre, int numPokedex, float peso, int temporada) {
        //Constructor de la clase pokemón
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
        System.out.println("Soy " + getNombre() + " y estoy atacando con Aranazo");
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
     * Realiza un ataque de Paralizar, característico del Pokémon de tipo Planta
     * Muestra un mensaje indicando que el Pokémon usa este ataque
     */

    @Override
    public void atacarParalizar() {
        System.out.println("Soy " + getNombre() + " y estoy atacando con Paralizar");
    }
    
    /**
     * Realiza un ataque de Drenaje, característico de los Pokémon de tipo Planta
     * Muestra un mensaje indicando que el Pokémon usa este ataque
     */

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy " + getNombre() + " y estoy atacando con Drenaje");
    }
    
    /**
     * Realiza un ataque de Hoja Afilada, característico de los Pokémon de tipo Planta
     * Muestra un mensaje indicando que el Pokémon usa este ataque
     */
    
    @Override
    public void atacarHojaAfilada() {
        System.out.println("Soy " + getNombre() + " y estoy atacando con Hoja afilada");
    }
    
    /**
     * Realiza un ataque de Látigo Cepa, característico de los Pokémon de tipo Planta
     * Muestra un mensaje indicando que el Pokémon usa este ataque
     */

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Soy " + getNombre() + " y estoy atacando con Latigo cepa");
    }
    
}
