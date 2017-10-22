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
        alignment = Alignment.NEUTRAL;
        armorClass = 10;
        hitPoints = 5;
        abilities = new Abilities();


    }

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

    private boolean isCriticalHit(int diceRoll) {
        return (diceRoll == 20);
    }

    public boolean isHitSuccessful(int diceRoll, int enemyArmorClass) {
        return (diceRoll >= enemyArmorClass);
    }

    public int rollDice() {
        return new Random().nextInt(20) + 1;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }
}
