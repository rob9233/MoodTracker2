package robfernandes.xyz.moodtracker;

import org.junit.Assert;
import org.junit.Test;

import robfernandes.xyz.moodtracker.Model.Mood;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ModelTest {

    @Test
    public void doesEmptyNoteReturnFalse() {
        Mood mood = new Mood(1, "");
        Assert.assertFalse(mood.hasNote());
    }

    @Test
    public void doesANoteNoteReturnTrue() {
        Mood mood = new Mood(1, "test note");
        Assert.assertTrue(mood.hasNote());
    }
}