public class Main {
    public static void main(String[] args) {
        Pokemon pokemon1 = new Pokemon("Bulbasaur", "Grass", "Ivysaur");
        Pokemon pokemon2 = new Pokemon("Ivysaur", "Grass", "Vanusaur");
        Pokemon pokemon3 = new Pokemon("Venusaur", "Grass", ".");
        Pokemon pokemon4 = new Pokemon("Squirtle", "Water", "Wartartle");
        Pokemon pokemon5 = new Pokemon("Wartartle", "Water", "Blastoise");
        Pokemon pokemon6 = new Pokemon("Blastoise", "Water", ".");
        Pokemon pokemon7 = new Pokemon("Charmander", "Fire", "Charmaleon");
        Pokemon pokemon8 = new Pokemon("Charmaleon", "Fire", "Charizard");
        Pokemon pokemon9 = new Pokemon("Charizard", "Fire", ".");
        Pokemon pokemon10 = new Pokemon("Caterpie", "Beetle", "Metapod");
        Pokemon pokemon11 = new Pokemon("Metapod", "Beetle", "Butterfree");
        Pokemon pokemon12 = new Pokemon("Butterfree", "Beetle ", ".");

        Pokemon[] pokemonList = {pokemon1, pokemon2, pokemon3, pokemon4, pokemon5, pokemon6,
                pokemon7, pokemon8, pokemon9, pokemon10, pokemon11, pokemon12};

        Pokedex pokedex = new Pokedex(pokemonList);
        pokedex.viewPokemon();
    }
}

