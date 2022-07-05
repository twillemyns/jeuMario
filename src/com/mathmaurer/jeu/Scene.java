package com.mathmaurer.jeu;

import javax.swing.*;
import java.awt.*;

public class Scene extends JPanel {
    private ImageIcon icoFond;
    private Image imgFond1;

    private ImageIcon icoMario; //* code provisoire
    private Image imgMario; //* code provisoire

    private int xFond1;

    //**** CONSTRUCTEUR ****//
    public Scene(){
        super();
        this.xFond1 = -50;
        icoFond = new ImageIcon(getClass().getResource("/images/fondEcran.png"));
        this.imgFond1 = this.icoFond.getImage();
        icoMario = new ImageIcon(getClass().getResource("/images/marioMarcheDroite.png"));
        this.imgMario = this.icoMario.getImage();
    }

    //**** METHODES ****//
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics g2 = (Graphics2D)g;

        g2.drawImage(this.imgFond1, this.xFond1, 0, null); // Dessin de l'image de fond
        g2.drawImage(imgMario, 300, 245, null); //code provisoire
    }
}
