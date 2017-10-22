package gameAssets;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Unit tests for Character.
 * Created by Yasmin and Maclain on 8/12/2017
 */


public class CharacterTest {

    @Test
    public void TestGetNameReturnsWhatISetNameTo() {
        //arrange
        Character c = new Character();
        String expectedName = "Bob";
        c.setName(expectedName);

        //Act+Assert
        assertEquals(c.getName(), expectedName);
    }

    @Test
    public void TestGetAlignmentReturnsWhatISetAlignmentTo() {
        //arrange
        Character c = new Character();
        Alignment expectedAlignment = Alignment.EVIL;
        c.setAlignment(expectedAlignment);

        //act+assert
        assertEquals(c.getAlignment(), Alignment.EVIL);
    }

    @Test
    public void TestArmorClassDefaultIs10() {
        //arrange
        Character c = new Character();
        int expectedArmorClass = 10;

        //act
        int actualArmorClass = c.getArmorClass();

        //assert
        assertEquals(expectedArmorClass, actualArmorClass);
    }

    @Test
    public void TestHitPointsDefaultIs5() {
        //arrange
        Character c = new Character();
        int expectedHitPoints = 5;

        //act
        int actualHitPoints = c.getHitPoints();

        //assert
        assertEquals(expectedHitPoints, actualHitPoints);
    }

    @Test
    public void TestThatRollingDieIsAlwaysBetween1And20() {
        //arrange
        Character c = new Character();
        int upper = 20;
        int lower = 1;

        //act
        int actualRoll = c.rollDice();

        //assert
        assertTrue((lower <= actualRoll && actualRoll <= upper));
    }

    @Test
    public void TestThatRollThatEqualsArmorClassHits() {
        //arrange
        Character c = new Character();
        int diceRoll = 5;
        int enemyArmorClass = 5;

        //act
        boolean hit = c.isHitSuccessful(diceRoll, enemyArmorClass);

        //assert
        assertTrue(hit);
    }

    @Test
    public void TestThatRollThatExceedsArmorClassHits() {
        //arrange
        Character c = new Character();
        int diceRoll = 6;
        int enemyArmorClass = 5;

        //act
        boolean hit = c.isHitSuccessful(diceRoll, enemyArmorClass);

        //assert
        assertTrue(hit);
    }

    @Test
    public void TestThatRollThatIsLessThanArmorClassDoesNotHit() {
        //arrange
        Character c = new Character();
        int diceRoll = 4;
        int enemyArmorClass = 5;

        //act
        boolean hit = c.isHitSuccessful(diceRoll, enemyArmorClass);

        //assert
        assertFalse(hit);
    }

    @Test
    public void TestThatA1To19DiceRollGives1damage() {
        //arrange
        Character c = new Character();
        int expectedDamage = 1;

        //act
        for (int i = 1; i < 20; i++) {
            int actualDamage = c.getDamageAmount(i);
            assertEquals(expectedDamage, actualDamage); //assert
        }
    }

    @Test
    public void TestThat20DiceRollGives2damage() {
        //arrange
        Character c = new Character();
        int expectedDamage = 2;
        int diceRoll = 20;

        //act
        int actualDamage = c.getDamageAmount(diceRoll);

        //assert
        assertEquals(expectedDamage, actualDamage);
    }

    @Test
    public void TestThatApplyDamageReducesHitPointsByDamageAmount() {
        //arrange
        Character c = new Character();
        Character enemy = new Character();
        int currentHitPoints = enemy.getHitPoints();
        int damageAmount = 2;
        int expectedHitPoints = currentHitPoints - damageAmount;

        //act
        enemy.applyDamage(damageAmount);

        //assert
        assertEquals(expectedHitPoints, enemy.getHitPoints());
    }

    @Test
    public void TestThatCharacterIsDeadWhenHitPointsIs0() {
        //arrange
        Character c = new Character();
        int currentHitPoints = c.getHitPoints();

        //act
        c.applyDamage(currentHitPoints);

        //assert
        assertTrue(c.isDead());
    }

    @Test
    public void TestThatCharacterIsDeadWhenHitPointsIsNegative() {
        //arrange
        Character c = new Character();
        int currentHitPoints = c.getHitPoints();

        //act
        c.applyDamage(currentHitPoints + 1);

        //assert
        assertTrue(c.isDead());
    }


}