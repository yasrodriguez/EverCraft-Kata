package gameAssets;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.HashMap;

/**
 * Unit tests for Abilities.
 */
public class AbilitiesTest {
    @Test
    public void getStrength_newCharacter_returnsDefaultScore() {
        //arrange
        int defaultScore = 10;

        //act
        Abilities abilities = new Abilities();
        int score = abilities.getStrength();


        //assert
        assertEquals(defaultScore, score);
    }

    @Test
    public void getIntelligence_newCharacter_returnsDefaultScore() {
        //arrange
        int defaultScore = 10;

        //act
        Abilities abilities = new Abilities();
        int score = abilities.getIntelligence();


        //assert
        assertEquals(defaultScore, score);
    }

    @Test
    public void getDexterity_newCharacter_returnsDefaultScore() {
        //arrange
        int defaultScore = 10;

        //act
        Abilities abilities = new Abilities();
        int score = abilities.getDexterity();


        //assert
        assertEquals(defaultScore, score);
    }

    @Test
    public void getWisdom_newCharacter_returnsDefaultScore() {
        //arrange
        int defaultScore = 10;

        //act
        Abilities abilities = new Abilities();
        int score = abilities.getWisdom();


        //assert
        assertEquals(defaultScore, score);
    }

    @Test
    public void getConstitution_newCharacter_returnsDefaultScore() {
        //arrange
        int defaultScore = 10;

        //act
        Abilities abilities = new Abilities();
        int score = abilities.getConstitution();


        //assert
        assertEquals(defaultScore, score);
    }

    @Test
    public void getCharisma_newCharacter_returnsDefaultScore() {
        //arrange
        int defaultScore = 10;

        //act
        Abilities abilities = new Abilities();
        int score = abilities.getCharisma();


        //assert
        assertEquals(defaultScore, score);
    }

    @Test
    public void getModifier_ReturnsCorrectValue() {
        //arrange
        HashMap<Integer, Integer> scoreModifierMap = new HashMap();
        scoreModifierMap.put(1, -5);
        scoreModifierMap.put(2, -4);
        scoreModifierMap.put(3, -4);
        scoreModifierMap.put(4, -3);
        scoreModifierMap.put(5, -3);
        scoreModifierMap.put(6, -2);
        scoreModifierMap.put(7, -2);
        scoreModifierMap.put(8, -1);
        scoreModifierMap.put(9, -1);
        scoreModifierMap.put(10, 0);
        scoreModifierMap.put(11, 0);
        scoreModifierMap.put(12, 1);
        scoreModifierMap.put(13, 1);
        scoreModifierMap.put(14, 2);
        scoreModifierMap.put(15, 2);
        scoreModifierMap.put(16, 3);
        scoreModifierMap.put(17, 3);
        scoreModifierMap.put(18, 4);
        scoreModifierMap.put(19, 4);
        scoreModifierMap.put(20, 5);

        Abilities abilities = new Abilities();

        //act + assert
        scoreModifierMap.entrySet().forEach(i -> {
            int score = i.getKey();
            int actualModifier = abilities.getModifier(score);
            int expectedModifier = i.getValue();

            Assert.assertEquals(expectedModifier, actualModifier);
        });

    }
}
