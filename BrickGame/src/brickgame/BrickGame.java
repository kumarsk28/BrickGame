package brickgame;
import javax.swing.*;
public class BrickGame {

    public static void main(String[] args) {
        JFrame obj = new JFrame();
        GamePlay gplay = new GamePlay();
        obj.setBounds(100,100,700,600);
        obj.setTitle("BreakABrick");
        obj.setResizable(false); 
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gplay);
        
    }
    
}
