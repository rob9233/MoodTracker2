package robfernandes.xyz.moodtracker.Utils;

/**
 * Created by Roberto Fernandes on 07/11/2018.
 */
public class MoodType {
    private int moodTypeID;
    private int widthPercentage;
    private int backgroundColor;
    private int faceImage;

    MoodType(int widthPercentage, int backgroundColor, int faceImage, int moodTypeID) {
        this.widthPercentage = widthPercentage;
        this.backgroundColor = backgroundColor;
        this.faceImage = faceImage;
        this.moodTypeID = moodTypeID;
    }

    //For EmptyMood there is no need for a image
    MoodType(int moodTypeID, int widthPercentage, int backgroundColor) {
        this(widthPercentage, backgroundColor, -1, moodTypeID);
    }

    public int getWidthPercentage() {
        return widthPercentage;
    }

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public int getFaceImage() {
        return faceImage;
    }

    public int getMoodTypeID() {
        return moodTypeID;
    }
}
