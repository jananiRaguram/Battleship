package Battleship;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author Janani
 */
public class GameGrid extends JFrame{

    private JPanel initPage, gridPage;
    public static final int WIDTH =  800;
    public static final int HEIGHT = 600;

    public static void main(String[] args) {
        GameGrid game = new GameGrid();
        game.setVisible(true);
    }

    /**
     * Creates new form gameGrid
     */
    public GameGrid() {
        super("Battleship");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));

        initWindow();
        
        playGame();

    }

    public void initWindow(){
        initPage = new JPanel();
        initPage.setLayout(new BoxLayout(initPage, BoxLayout.Y_AXIS));
        initPage.setVisible(true);

        ImageIcon icon = new ImageIcon("rsz_ship.png");
        JLabel iconLabel = new JLabel("", icon, JLabel.CENTER);
        JLabel msg1 = new JLabel("There are 3 ships on the game board, try to sink them all!");
        initPage.add(iconLabel);
        initPage.add(msg1);

        JButton startButton = new JButton("Start Game");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                initPage.setVisible(false);
                gridPage.setVisible(true);
            }
        });
         
        initPage.add(startButton);
        add(initPage);

    }

    public void playGame(){
        BattleShip game = new BattleShip();
        gridPage = new JPanel();
        gridPage.setLayout(new GridLayout(3,3));
        JButton A0 = new JButton("A0");
        A0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(game.checkGuess("A0").equals("hit")){
                    A0.setBackground(Color.RED);
                    A0.setEnabled(false);
                }else{
                    A0.setBackground(Color.WHITE);
                    A0.setEnabled(false);
                }
            }
        });

        JButton A1 = new JButton("A1");
        A1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(game.checkGuess("A1").equals("hit")){
                    A0.setBackground(Color.RED);
                    A0.setEnabled(false);
                }else{
                    A0.setBackground(Color.WHITE);
                    A0.setEnabled(false);
                }
            }
        });

        JButton A2 = new JButton("A2");
        A2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(game.checkGuess("A2").equals("hit")){
                    A0.setBackground(Color.RED);
                    A0.setEnabled(false);
                }else{
                    A0.setBackground(Color.WHITE);
                    A0.setEnabled(false);
                }
            }
        });
        
        JButton B0 = new JButton("B0");
        B0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(game.checkGuess("B0").equals("hit")){
                    A0.setBackground(Color.RED);
                    A0.setEnabled(false);
                }else{
                    A0.setBackground(Color.WHITE);
                    A0.setEnabled(false);
                }
            }
        });

        JButton B1 = new JButton("B1");
        B1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(game.checkGuess("B1").equals("hit")){
                    A0.setBackground(Color.RED);
                    A0.setEnabled(false);
                }else{
                    A0.setBackground(Color.WHITE);
                    A0.setEnabled(false);
                }
            }
        });

        JButton B2 = new JButton("B2");
        B2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(game.checkGuess("B2").equals("hit")){
                    A0.setBackground(Color.RED);
                    A0.setEnabled(false);
                }else{
                    A0.setBackground(Color.WHITE);
                    A0.setEnabled(false);
                }
            }
        });

        JButton C0 = new JButton("C0");
        C0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(game.checkGuess("C0").equals("hit")){
                    A0.setBackground(Color.RED);
                    A0.setEnabled(false);
                }else{
                    A0.setBackground(Color.WHITE);
                    A0.setEnabled(false);
                }
            }
        });

        JButton C1 = new JButton("C1");
        C1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                game.checkGuess("C1");
            }
        });

        JButton C2 = new JButton("C2");
        C2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                game.checkGuess("C2");
            }
        });

        gridPage.add(A0);
        gridPage.add(A1);
        gridPage.add(A2);
        gridPage.add(B0);
        gridPage.add(B1);
        gridPage.add(B2);
        gridPage.add(C0);
        gridPage.add(C1);
        gridPage.add(C2);


        add(gridPage);
	    game.finishGame();
    }

}