
import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Song {

    private static final int WIDTH = 875;
    private static final int HEIGHT = 650;
    public ImageIcon my_icon = new ImageIcon("Gifs\\Background.gif");
    public JLabel my_background = new JLabel(my_icon);
    public ImageIcon icon = new ImageIcon("Icon\\Underworld.png");
    public JFrame my_frame = new JFrame("UNDERCITY");


    Song(){

        my_background.setSize(new Dimension(WIDTH,HEIGHT));


        my_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        my_frame.setSize(new Dimension(WIDTH,HEIGHT));
        my_frame.setLayout(null);
        my_frame.setIconImage(icon.getImage());
        my_frame.setResizable(false);
        my_frame.setLocationRelativeTo(null);
        my_frame.getContentPane().add(my_background);
        my_frame.setVisible(true);


    }

    public void music() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        String audio = "sound\\Phonk.wav";

        File my_File = new File(audio);


        AudioInputStream stream = AudioSystem.getAudioInputStream(my_File);
        Clip my_clip = AudioSystem.getClip();
        my_clip.open(stream);
        my_clip.loop(Clip.LOOP_CONTINUOUSLY);
        my_clip.start();


    }

}
