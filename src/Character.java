import processing.core.PApplet;
import processing.core.PImage;
import java.util.Timer;
import java.util.TimerTask;

public class Character {
    private PApplet parent;
    private PImage Character;
    private String initialImage;

    public Character(PApplet parent, String initialImage) {
        this.parent = parent;
        this.Character = parent.loadImage(initialImage);

    }

    public void loadCharacter(){
        parent.image(Character,0,0);
    }

    public void breath(){
        System.out.println("timer executed?");
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                changeImage();
            }
        }, 0, 1000); //delay, how many seconds between intervals;

    }

    public void changeImage(){
        System.out.println("should be changing 1");
    }

}


