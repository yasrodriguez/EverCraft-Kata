package gameAssets;

public class Ability {
    public final int DEFAULT_SCORE = 10;
    private int score;
    private AbilityType abilityType;

    public int getScore(){
        return score;
    }
    public Ability(AbilityType abilityType)
    {
        this.abilityType = abilityType;
        this.score = DEFAULT_SCORE;
    }
    public AbilityType getAbilityType() {
        return abilityType;
    }
}
