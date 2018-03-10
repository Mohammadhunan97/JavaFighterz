import processing.core.PApplet;
import processing.core.PImage;

public class MainApp extends PApplet {
    //private PImage Piccolo1;
    private Character Piccolo1;
    public static void main(String args[]){
        PApplet.main("MainApp",args);
    }
    public void settings(){
        size(720, 480);
    }
    public void setup(){
        background(255);
        Piccolo1 = new Character(this,"assets/piccolo.png");
       // Piccolo1 = loadImage("assets/piccolo.png");

//        img.resize(121, 131);
    }
    public void draw(){
        Piccolo1.loadCharacter();
        //image(Piccolo1,0,0);
    }
    void reset(){
    }

}