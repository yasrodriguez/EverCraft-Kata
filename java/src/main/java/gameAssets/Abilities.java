package gameAssets;

import java.util.HashMap;

/**
 * Each character has 6 abilities with a score ranging from 1 to 20. Abilities also have modifiers which vary according
 * to the ability score.
 */

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

    /**
     * Score for Strength ability.
     * @return strength score
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Score for Intelligence ability.
     * @return intelligence score
     */
    public int getIntelligence() {
        return intelligence;
    }

    /**
     * Score for Dexterity ability.
     * @return dexterity score
     */
    public int getDexterity() {
        return dexterity;
    }

    /**
     * Score for Wisdom ability.
     * @return wisdom score
     */
    public int getWisdom() {
        return wisdom;
    }

    /**
     * Score for Charisma ability.
     * @return charisma score
     */
    public int getCharisma() {
        return charisma;
    }

    /**
     * Score for Constitution ability.
     * @return constitution score
     */
    public int getConstitution() {
        return constitution;
    }

    /**
     * Each score value has a static modifier value associated with it.
     * @param abilityScore score for an ability
     * @return modifier for the score
     */
    public int getModifier(int abilityScore) {
        return modifiers.get(abilityScore);
    }

    /**
     * Initializes modifiers so it contains the modifier value for each score value.
     */
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
