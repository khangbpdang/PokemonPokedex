package khangdang.com.pokemonpokedex;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

public class PokemonCollection {
    private ArrayList<Pokemon> mPokemons;
    private static PokemonCollection sPokemonCollection;
    private Context mAppContext;

    private PokemonCollection(Context appContext) {
        mAppContext = appContext;
        mPokemons = new ArrayList<Pokemon>();


        Pokemon p0 = new Pokemon();
        p0.setPokemonName("Charmander");
        p0.setImage(R.mipmap.charmander);
        p0.setHeight("0.6 m");
        p0.setWeight("8.5 kg");
        p0.setCategory("Fire");
        p0.setHP(39);
        p0.setAttack(52);
        p0.setDefense(43);
        p0.setSpAttack(60);
        p0.setSpDefense(50);
        p0.setSpeed(65);
        mPokemons.add(p0);

        Pokemon p1 = new Pokemon();
        p1.setPokemonName("Pikachu");
        p1.setImage(R.mipmap.pikachu);
        p1.setHeight("0.4 m");
        p1.setWeight("6.0 kg");
        p1.setCategory("Electric");
        p1.setHP(35);
        p1.setAttack(55);
        p1.setDefense(30);
        p1.setSpAttack(50);
        p1.setSpDefense(40);
        p1.setSpeed(90);
        mPokemons.add(p1);

        Pokemon p2 = new Pokemon();
        p2.setPokemonName("Rayquaza");
        p2.setImage(R.mipmap.rayquaza);
        p2.setHeight("7.0 m");
        p2.setWeight("206.5 kg");
        p2.setCategory("Dragon - Flying");
        p2.setHP(105);
        p2.setAttack(150);
        p2.setDefense(90);
        p2.setSpAttack(150);
        p2.setSpDefense(90);
        p2.setSpeed(95);
        mPokemons.add(p2);

        Pokemon p3 = new Pokemon();
        p3.setPokemonName("Kyogre");
        p3.setImage(R.mipmap.kyogre);
        p3.setHeight("4.5 m");
        p3.setWeight("352.0 kg");
        p3.setCategory("Water");
        p3.setHP(100);
        p3.setAttack(100);
        p3.setDefense(90);
        p3.setSpAttack(150);
        p3.setSpDefense(140);
        p3.setSpeed(90);
        mPokemons.add(p3);

        Pokemon p4 = new Pokemon();
        p4.setPokemonName("Groudon");
        p4.setImage(R.mipmap.groudon);
        p4.setHeight("3.5 m");
        p4.setWeight("950 kg");
        p4.setCategory("Ground");
        p4.setHP(100);
        p4.setAttack(150);
        p4.setDefense(140);
        p4.setSpAttack(100);
        p4.setSpDefense(90);
        p4.setSpeed(90);
        mPokemons.add(p4);

        Pokemon p5 = new Pokemon();
        p5.setPokemonName("Ho-Oh");
        p5.setImage(R.mipmap.hooh);
        p5.setHeight("3.8 m");
        p5.setWeight("199.0 kg");
        p5.setCategory("Fire - Flying");
        p5.setHP(106);
        p5.setAttack(130);
        p5.setDefense(90);
        p5.setSpAttack(110);
        p5.setSpDefense(154);
        p5.setSpeed(90);
        mPokemons.add(p5);

        Pokemon p6 = new Pokemon();
        p6.setPokemonName("Lugia");
        p6.setImage(R.mipmap.lugia);
        p6.setHeight("5.2 m");
        p6.setWeight("216 kg");
        p6.setCategory("Psychic - Flying");
        p6.setHP(106);
        p6.setAttack(90);
        p6.setDefense(130);
        p6.setSpAttack(90);
        p6.setSpDefense(154);
        p6.setSpeed(110);
        mPokemons.add(p6);

        Pokemon p7 = new Pokemon();
        p7.setPokemonName("Lapras");
        p7.setImage(R.mipmap.lapras);
        p7.setHeight("2.5 m");
        p7.setWeight("220 kg");
        p7.setCategory("Water - Ice");
        p7.setHP(130);
        p7.setAttack(85);
        p7.setDefense(80);
        p7.setSpAttack(85);
        p7.setSpDefense(95);
        p7.setSpeed(60);
        mPokemons.add(p7);

        Pokemon p8 = new Pokemon();
        p8.setPokemonName("Ditto");
        p8.setImage(R.mipmap.charmander);
        p8.setHeight("0.3 m");
        p8.setWeight("4.0kg");
        p8.setCategory("Normal");
        p8.setHP(48);
        p8.setAttack(48);
        p8.setDefense(48);
        p8.setSpAttack(48);
        p8.setSpDefense(48);
        p8.setSpeed(48);
        mPokemons.add(p8);

        Pokemon p9 = new Pokemon();
        p9.setPokemonName("Eevee");
        p9.setImage(R.mipmap.eevee);
        p9.setHeight("0.3 m");
        p9.setWeight("6.5 kg");
        p9.setCategory("Normal");
        p9.setHP(55);
        p9.setAttack(55);
        p9.setDefense(50);
        p9.setSpAttack(45);
        p9.setSpDefense(65);
        p9.setSpeed(55);
        mPokemons.add(p9);

    }

    public static PokemonCollection get(Context c) {
        if (sPokemonCollection == null) {
            sPokemonCollection = new PokemonCollection(c.getApplicationContext());
        }
        return sPokemonCollection;
    }

    public ArrayList<Pokemon> getPokemons() {
        return mPokemons;
    }

    public Pokemon getPokemon(UUID id) {
        for (Pokemon p : mPokemons) {
            if (p.getID().equals(id)) {
                return p;
            }
        }
        return null;
    }
}

