package Battleship;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author Janani
 */
public class GameGrid extends JFrame{

    private JPanel initPage = new JPanel();
    private JPanel gridPage = new JPanel();
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
        JPanel setup = new JPanel();
        initPage.setLayout(new FlowLayout());
        setup.setLayout(new BoxLayout(setup, BoxLayout.Y_AXIS));
        initPage.setVisible(true);
        gridPage.setVisible(false);
        ImageIcon icon = new ImageIcon("rsz_ship.png");
        JLabel iconLabel = new JLabel("", icon, JLabel.CENTER);
        JLabel msg1 = new JLabel("There are 3 ships on the game board, try to sink them all!");
        setup.add(iconLabel);
        setup.add(msg1);
        
        JButton startButton = new JButton("Start Game");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                initPage.setVisible(false);
                gridPage.setVisible(true);
            }
        });

        JPanel empty1 = new JPanel(new GridLayout(1,4));
        JLabel spc1 = new JLabel(" ");
        JLabel spc2 = new JLabel(" ");
        JLabel spc3 = new JLabel(" ");

        empty1.add(spc1);
        empty1.add(spc2);
        empty1.add(startButton);
        empty1.add(spc3);

        setup.add(empty1);
        initPage.add(setup);
        add(initPage);

    }

    public void playGame(){
        BattleShip game = new BattleShip();

        JPanel setup = new JPanel();
        gridPage.setLayout(new FlowLayout());
        setup.setLayout(new GridLayout(3,3));

        JLabel msg1 = new JLabel("Sink all 3 ships!");
        gridPage.add(msg1);

        JLabel shipsFound = new JLabel("Ships found: " + game.getShipsFound());
       
        JPanel guesses = new JPanel();
        JLabel totalGuesses = new JLabel();
        guesses.add(totalGuesses);
        totalGuesses.setVisible(false);
        
        JButton A0 = new JButton("A0");
        A0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(game.checkGuess("A0").equals("hit")){
                    A0.setBackground(Color.RED);
                    A0.setEnabled(false);
                    shipsFound.setText("Ships found: " + game.getShipsFound());
                    if(game.getShipsFound() == 3){
                        totalGuesses.setText("Congrats! You found all the ships with: " + game.getNumGuesses() + " guesses");
                        totalGuesses.setVisible(true);
                        msg1.setVisible(false);
                    }
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
                    A1.setBackground(Color.RED);
                    A1.setEnabled(false);
                    shipsFound.setText("Ships found: " + game.getShipsFound());
                    if(game.getShipsFound() == 3){
                        totalGuesses.setText("Congrats! You found all the ships with: " + game.getNumGuesses() + " guesses");
                        totalGuesses.setVisible(true);
                        msg1.setVisible(false);
                    }
                }else{
                    A1.setBackground(Color.WHITE);
                    A1.setEnabled(false);
                }
            }
        });

        JButton A2 = new JButton("A2");
        A2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(game.checkGuess("A2").equals("hit")){
                    A2.setBackground(Color.RED);
                    A2.setEnabled(false);
                    shipsFound.setText("Ships found: " + game.getShipsFound());
                    if(game.getShipsFound() == 3){
                        totalGuesses.setText("Congrats! You found all the ships with: " + game.getNumGuesses() + " guesses");
                        totalGuesses.setVisible(true);
                        msg1.setVisible(false);
                    }
                }else{
                    A2.setBackground(Color.WHITE);
                    A2.setEnabled(false);
                }
            }
        });
        
        JButton B0 = new JButton("B0");
        B0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(game.checkGuess("B0").equals("hit")){
                    B0.setBackground(Color.RED);
                    B0.setEnabled(false);
                    shipsFound.setText("Ships found: " + game.getShipsFound());
                    if(game.getShipsFound() == 3){
                        totalGuesses.setText("Congrats! You found all the ships with: " + game.getNumGuesses() + " guesses");
                        totalGuesses.setVisible(true);
                        msg1.setVisible(false);
                    }
                }else{
                    B0.setBackground(Color.WHITE);
                    B0.setEnabled(false);
                }
            }
        });

        JButton B1 = new JButton("B1");
        B1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(game.checkGuess("B1").equals("hit")){
                    B1.setBackground(Color.RED);
                    B1.setEnabled(false);
                    shipsFound.setText("Ships found: " + game.getShipsFound());
                    if(game.getShipsFound() == 3){
                        totalGuesses.setText("Congrats! You found all the ships with: " + game.getNumGuesses() + " guesses");
                        totalGuesses.setVisible(true);
                        msg1.setVisible(false);
                    }
                }else{
                    B1.setBackground(Color.WHITE);
                    B1.setEnabled(false);
                }
            }
        });

        JButton B2 = new JButton("B2");
        B2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(game.checkGuess("B2").equals("hit")){
                    B2.setBackground(Color.RED);
                    B2.setEnabled(false);
                    shipsFound.setText("Ships found: " + game.getShipsFound());
                    if(game.getShipsFound() == 3){
                        totalGuesses.setText("Congrats! You found all the ships with: " + game.getNumGuesses() + " guesses");
                        totalGuesses.setVisible(true);
                        msg1.setVisible(false);
                    }
                }else{
                    B2.setBackground(Color.WHITE);
                    B2.setEnabled(false);
                }
            }
        });

        JButton C0 = new JButton("C0");
        C0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(game.checkGuess("C0").equals("hit")){
                    C0.setBackground(Color.RED);
                    C0.setEnabled(false);
                    shipsFound.setText("Ships found: " + game.getShipsFound());
                    if(game.getShipsFound() == 3){
                        totalGuesses.setText("Congrats! You found all the ships with: " + game.getNumGuesses() + " guesses");
                        totalGuesses.setVisible(true);
                        msg1.setVisible(false);
                    }
                }else{
                    C0.setBackground(Color.WHITE);
                    C0.setEnabled(false);
                }
            }
        });

        JButton C1 = new JButton("C1");
        C1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(game.checkGuess("C1").equals("hit")){
                    C1.setBackground(Color.RED);
                    C1.setEnabled(false);
                    shipsFound.setText("Ships found: " + game.getShipsFound());
                    if(game.getShipsFound() == 3){
                        totalGuesses.setText("Congrats! You found all the ships with: " + game.getNumGuesses() + " guesses");
                        totalGuesses.setVisible(true);
                        msg1.setVisible(false);
                    }
                }else{
                    C1.setBackground(Color.WHITE);
                    C1.setEnabled(false);
                }
            }
        });

        JButton C2 = new JButton("C2");
        C2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(game.checkGuess("C2").equals("hit")){
                    C2.setBackground(Color.RED);
                    C2.setEnabled(false);
                    shipsFound.setText("Ships found: " + game.getShipsFound());
                    if(game.getShipsFound() == 3){
                        totalGuesses.setText("Congrats! You found all the ships with: " + game.getNumGuesses() + " guesses");
                        totalGuesses.setVisible(true);
                        msg1.setVisible(false);
                    }
                }else{
                    C2.setBackground(Color.WHITE);
                    C2.setEnabled(false);
                }
            }
        });

        setup.add(A0);
        setup.add(A1);
        setup.add(A2);
        setup.add(B0);
        setup.add(B1);
        setup.add(B2);
        setup.add(C0);
        setup.add(C1);
        setup.add(C2);

        gridPage.add(setup, FlowLayout.CENTER);
        gridPage.add(shipsFound);
        gridPage.add(guesses, FlowLayout.CENTER);
        add(gridPage);

        validate();
        
    }


}