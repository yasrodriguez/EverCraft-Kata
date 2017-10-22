package gameAssets;


import java.util.Random;

/**
 * Character class for EverCraft.
 * Created by Yasmin and Maclain on 8/12/2017
 */

public class Character {
    private String name;
    private Alignment alignment;
    private int armorClass;
    private int hitPoints;
    private Abilities abilities;

    public Character() {
        name = "";
        alignment = Alignment.NEUTRAL; //default alignment is neutral
        armorClass = 10;  //default armor class is 10
        hitPoints = 5;  //default hit points is 5
        abilities = new Abilities();
    }

    /**
     * Character have abilities that have a score and a modifier depending on the score
     * @return character abilities
     */
    public Abilities getAbilities() {
        return abilities;
    }

    /**
     * Damage amount to be applied to this character after a successful hit.
     *
     * @param damageAmount amount to be subtracted from hit points
     */
    public void applyDamage(int damageAmount) {
        hitPoints -= damageAmount;
    }

    /**
     * Determines if the character is dead based on the hit points.
     * @return true if character is dead
     */
    public boolean isDead() {
        return hitPoints <= 0;
    }

    /**
     * Number of damage points based on a dice roll.
     *
     * @param diceRoll A number from 1 to 20 returned by the dice roll.
     * @return Returns damage points that will affect hit points.
     */
    public int getDamageAmount(int diceRoll) {
        int normalDamage = 1;

        if (isCriticalHit(diceRoll)) {
            return normalDamage * 2;
        } else {
            return normalDamage;
        }
    }

    /**
     * Determines if a hit is critical, which is used when calculating the damage amount.
     * @param diceRoll number returned by the dice roll
     * @return true if hit is critical
     */
    private boolean isCriticalHit(int diceRoll) {
        return (diceRoll == 20);
    }

    /**
     * Determines if attack was successful based on the dice roll and the enemy's armor class.
     * @param diceRoll number returned by the dice roll
     * @param enemyArmorClass number representing the enemy's armor class
     * @return
     */
    public boolean isHitSuccessful(int diceRoll, int enemyArmorClass) {
        return (diceRoll >= enemyArmorClass);
    }

    /**
     * Returns a random number from 1 to 20 representing the dice roll.
     * @return dice roll
     */
    public int rollDice() {
        return new Random().nextInt(20) + 1;
    }

    /**
     * This character's armor class.
     * @return armor class
     */
    public int getArmorClass() {
        return armorClass;
    }

    /**
     * This character's hit points.
     * @return hit points
     */
    public int getHitPoints() {
        return hitPoints;
    }

    /**
     * This character's name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Set this character's name.
     * @param name character's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get this character's alignment, which is one of 3 possible values: good, evil, or neutral.
     * @return Character's alignment
     */
    public Alignment getAlignment() {
        return alignment;
    }

    /**
     * Set this character's alignment.
     * @param alignment good, evil, or neutral
     */
    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }
}
