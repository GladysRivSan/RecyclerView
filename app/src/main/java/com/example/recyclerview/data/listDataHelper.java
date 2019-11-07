package com.example.recyclerview.data;

import java.util.ArrayList;

public class listDataHelper {

    public static ArrayList<PokemonShort> provideElements() {
        ArrayList<PokemonShort> pokemons = new ArrayList<>();
        pokemons.add(new PokemonShort("bulbasaur", "001"));
        pokemons.add(new PokemonShort("ivysaur", "002"));
        pokemons.add(new PokemonShort("venusaur", "003"));
        pokemons.add(new PokemonShort("charmander", "004"));
        pokemons.add(new PokemonShort("charmeleon", "005"));
        pokemons.add(new PokemonShort("charizard", "006"));
        pokemons.add(new PokemonShort("squirtle", "007"));
        pokemons.add(new PokemonShort("wartortle", "008"));
        pokemons.add(new PokemonShort("blastoise", "009"));
        pokemons.add(new PokemonShort("caterpie", "010"));
        pokemons.add(new PokemonShort("metapod", "011"));
        pokemons.add(new PokemonShort("butterfree", "012"));
        pokemons.add(new PokemonShort("weedle", "013"));
        pokemons.add(new PokemonShort("kakuna", "014"));
        pokemons.add(new PokemonShort("beedrill", "015"));
        pokemons.add(new PokemonShort("pidgey", "016"));
        pokemons.add(new PokemonShort("pidgeotto", "017"));
        pokemons.add(new PokemonShort("pidgeot", "018"));
        pokemons.add(new PokemonShort("rattata", "019"));
        pokemons.add(new PokemonShort("raticate", "020"));
        pokemons.add(new PokemonShort("spearow", "021"));
        pokemons.add(new PokemonShort("fearow", "022"));
        pokemons.add(new PokemonShort("ekans", "023"));
        pokemons.add(new PokemonShort("arbok", "024"));
        pokemons.add(new PokemonShort("pikachu", "025"));
        return pokemons;
    }
}
