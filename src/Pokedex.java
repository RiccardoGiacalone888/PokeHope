public class Pokedex {
    private Pokemon[] pokemonList;
    public Pokedex (Pokemon[] pokemonList){
        this.pokemonList = pokemonList;
    }
    public void viewPokemon() {
        for (Pokemon pokemon : pokemonList){
            pokemon.setDetails();
            System.out.println("................");
        }
    }


    }

