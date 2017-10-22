package gameAssets;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.HashMap;

public class Abilities {

    private final int DEFAULT_SCORE = 10;
    private int strength;
    private int intelligence;
    private int dexterity;
    private int wisdom;
    private int constitution;
    private int charisma;
    private HashMap<Integer, Integer> modifiers;

    public Abilities() {
        strength = DEFAULT_SCORE;
        intelligence = DEFAULT_SCORE;
        dexterity = DEFAULT_SCORE;
        wisdom = DEFAULT_SCORE;
        constitution = DEFAULT_SCORE;
        charisma = DEFAULT_SCORE;
        modifiers = new HashMap<>();
        setModifiers();
    }

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getModifier(int abilityScore) {
        return modifiers.get(abilityScore);
    }

    public void setModifiers() {
        modifiers.put(1, -5);
        modifiers.put(2, -4);
        modifiers.put(3, -4);
        modifiers.put(4, -3);
        modifiers.put(5, -3);
        modifiers.put(6, -2);
        modifiers.put(7, -2);
        modifiers.put(8, -1);
        modifiers.put(9, -1);
        modifiers.put(10, 0);
        modifiers.put(11, 0);
        modifiers.put(12, 1);
        modifiers.put(13, 1);
        modifiers.put(14, 2);
        modifiers.put(15, 2);
        modifiers.put(16, 3);
        modifiers.put(17, 3);
        modifiers.put(18, 4);
        modifiers.put(19, 4);
        modifiers.put(20, 5);
    }
}
