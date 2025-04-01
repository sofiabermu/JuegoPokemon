/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package videojuegopokemon;

import videojuegopokemon.models.Bulbasaur;
import videojuegopokemon.models.Charmander;
import videojuegopokemon.models.Pikachu;
import videojuegopokemon.models.Pokemon;
import videojuegopokemon.models.Squirtle;

/**
 * Clase principal que ejecuta los ataques realizados por los Pokemón
 * @author SOFIA RUDAS
 */
public class VideojuegoPokemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creacion de instancias de los Pokémon
        Pikachu pikachu = new Pikachu("Pikachu", 25, (float) 6.0, 1);
        Charmander charmander = new Charmander("Charmander", 4, (float) 8.5, 1);
        Squirtle squirtle = new Squirtle("Squirtle", 7, 9.0f, 1);
        Bulbasaur bulbasaur = new Bulbasaur("Bulbasaur", 1, 6.9f, 1);
        
        //ataques pikachu
        System.out.println("\n Ataques de Pikachu");
        pikachu.atacarPlacaje();
        pikachu.atacarAranazo();
        pikachu.atacarMordisco();
        pikachu.atacarImpactrueno();
        pikachu.atacarPunioTrueno();
        pikachu.atacarRayo();
        pikachu.atacarRayoCarga();
        
        //  ataques de Charmander
        System.out.println("\n Ataques de Charmander ");
        charmander.atacarPlacaje();
        charmander.atacarAranazo();
        charmander.atacarMordisco();
        charmander.atacarPunioFuego();
        charmander.atacarAscuas();
        charmander.atacarLanzallamas();
        
        //  ataques de Squirtle
        System.out.println("\n Ataques de Squirtle");
        squirtle.atacarPlacaje();
        squirtle.atacarAranazo();
        squirtle.atacarMordisco();
        squirtle.atacarHidrobomba();
        squirtle.atacarPistolaAgua();
        squirtle.atacarBurbuja();
        squirtle.atacarHidropulso();
        
        //  ataques de Bulbasaur
        System.out.println("\n Ataques de Bulbasaur ");
        bulbasaur.atacarPlacaje();
        bulbasaur.atacarAranazo();
        bulbasaur.atacarMordisco();
        bulbasaur.atacarParalizar();
        bulbasaur.atacarDrenaje();
        bulbasaur.atacarHojaAfilada();
        bulbasaur.atacarLatigoCepa();
        
    }
        
}

    
