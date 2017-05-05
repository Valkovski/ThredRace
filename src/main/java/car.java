import com.sun.media.jfxmedia.logging.Logger;

/**
 * Created by Andrii_Valkovskyi on 5/5/2017.
 */
public class car {
    private int speed;
    private int number;
    private int distance = 0;

    private car(){}

    public int getDistance() {
        return distance;
    }

    public void adjustDistance() {
        speed = ((int) Math.round(Math.random() * 10));

        Logger.logMsg(Logger.INFO, "number " + number +" speed " + speed);
        distance += speed;
    }




}
