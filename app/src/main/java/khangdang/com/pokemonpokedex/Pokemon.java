package khangdang.com.pokemonpokedex;

import java.util.Date;
import java.util.UUID;

public class Pokemon {
    private String mPokemonName;
    private int mImage;
    private String mHeight;
    private String mWeight;
    private String mCategory;
    private int mHP;
    private int mAttack;
    private int mDefense;
    private int mSpAttack;
    private int mSpDefense;
    private int mSpeed;
    private UUID mId;

    public Pokemon() {
        mId = UUID.randomUUID();
    }

    public Pokemon(String name, String height, String weight, String category, int HP, int att, int def, int spatt, int spdef, int speed) {
        mId = UUID.randomUUID();
        setPokemonName(name);
        setHeight(height);
        setWeight(weight);
        setCategory(category);
        setHP(HP);
        setAttack(att);
        setDefense(def);
        setSpAttack(spatt);
        setSpDefense(spdef);
        setSpeed(speed);
    }

    public UUID getID() {
        return mId;
    }

    public String getPokemonName() {
        return mPokemonName;
    }

    public void setPokemonName(String mPokemonName) {
        this.mPokemonName = mPokemonName;
    }

    public int getImage() {
        return mImage;
    }

    public void setImage(int mImage) {
        this.mImage = mImage;
    }

    public String getHeight() {
        return mHeight;
    }

    public void setHeight(String mHeight) {
        this.mHeight = mHeight;
    }

    public String getWeight() {
        return mWeight;
    }

    public void setWeight(String mWeight) {
        this.mWeight = mWeight;
    }

    public String getCategory() {
        return mCategory;
    }

    public void setCategory(String mCategory) {
        this.mCategory = mCategory;
    }

    public int getHP() {
        return mHP;
    }

    public void setHP(int mHP) {
        this.mHP = mHP;
    }

    public int getAttack() {
        return mAttack;
    }

    public void setAttack(int mAttack) {
        this.mAttack = mAttack;
    }

    public int getDefense() {
        return mDefense;
    }

    public void setDefense(int mDefense) {
        this.mDefense = mDefense;
    }

    public int getSpAttack() {
        return mSpAttack;
    }

    public void setSpAttack(int mSpAttack) {
        this.mSpAttack = mSpAttack;
    }

    public int getSpDefense() {
        return mSpDefense;
    }

    public void setSpDefense(int mSpDefense) {
        this.mSpDefense = mSpDefense;
    }

    public int getSpeed() {
        return mSpeed;
    }

    public void setSpeed(int mSpeed) {
        this.mSpeed = mSpeed;
    }

    /*
    public String getPokemonInfo() {
        return "Height: " + getHeight() + "\nWeight: " + getWeight() + "\nType: " + getCategory() + "\nHP: " + getHP() +
                "\nAttack: ";
    }*/
}
