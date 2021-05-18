import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.EnumMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;  
public class game2p
{
    
    
    JFrame frame;
    JLabel player1;
    JLabel player2;
    JLabel keyReader;
    
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;
    
    Action upAction2;
    Action downAction2;
    Action leftAction2;
    Action rightAction2;
    int x;
    
   game2p()
   {
       ///////////////frame///////////////////////
       frame = new JFrame("KeyBindingDemo");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(420,420);
       frame.setLayout(null);
       //////////////movement obj///////////////////
       keyReader = new JLabel();
       keyReader.setBackground(Color.red);
       keyReader.setBounds(50,50,50,50);
       keyReader.setOpaque(false);
       /////////////players////////////////////////
       player1 = new JLabel();
       player1.setBackground(Color.red);
       player1.setBounds(50,50,50,50);
       player1.setOpaque(true);
       
       player2 = new JLabel();
       player2.setBackground(Color.blue);
       player2.setBounds(50,50,50,50);
       player2.setOpaque(true);
       ////////////Actions////////////////////////
       upAction = new UpAction();
       downAction = new DownAction();
       leftAction = new LeftAction();
       rightAction = new RightAction();
       
       upAction2 = new UpAction2();
       downAction2 = new DownAction2();
       leftAction2 = new LeftAction2();
       rightAction2 = new RightAction2();
       ///////////add components to frame//////////
       frame.setVisible(true);
       frame.add(keyReader);
       frame.add(player1);
       frame.add(player2);
       
       ////////////p1 keybinds///////////////////
       
       keyReader.getInputMap().put(KeyStroke.getKeyStroke("UP"),"upAction");
       keyReader.getActionMap().put("upAction",upAction);
       
       keyReader.getInputMap().put(KeyStroke.getKeyStroke("DOWN"),"downAction");
       keyReader.getActionMap().put("downAction",downAction);
       
       keyReader.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"leftAction");
       keyReader.getActionMap().put("leftAction",leftAction);
       
       keyReader.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"),"rightAction");
       keyReader.getActionMap().put("rightAction",rightAction);
       ///////////p2 keybinds////////////////////////
       
       
       keyReader.getInputMap().put(KeyStroke.getKeyStroke("W"),"upAction2");
       keyReader.getActionMap().put("upAction2",upAction2);
       
       keyReader.getInputMap().put(KeyStroke.getKeyStroke("S"),"downAction2");
       keyReader.getActionMap().put("downAction2",downAction2);
       
       keyReader.getInputMap().put(KeyStroke.getKeyStroke("A"),"leftAction2");
       keyReader.getActionMap().put("leftAction2",leftAction2);
       
       keyReader.getInputMap().put(KeyStroke.getKeyStroke("D"),"rightAction2");
       keyReader.getActionMap().put("rightAction2",rightAction2);
       
   }
   
   ////////////////p1 action set/////////////////
   public class UpAction extends AbstractAction
   {
       @Override
       public void actionPerformed(ActionEvent e)
       {
           player1.setLocation(player1.getX(),player1.getY()-10);
           
       }
   }
   
   public class DownAction extends AbstractAction
   {
       @Override
       public void actionPerformed(ActionEvent e)
       {
           player1.setLocation(player1.getX(),player1.getY()+10);
       }
   }
   
   public class LeftAction extends AbstractAction
   {
       @Override
       public void actionPerformed(ActionEvent e)
       {
           player1.setLocation(player1.getX()-10,player1.getY());
       }
   }
   
   public class RightAction extends AbstractAction
   {
       @Override
       public void actionPerformed(ActionEvent e)
       {
           player1.setLocation(player1.getX()+10,player1.getY());
       }
   }
   //////////////////p2 action set/////////////////////////////
   
   public class UpAction2 extends AbstractAction
   {
       @Override
       public void actionPerformed(ActionEvent event)
       {
           player2.setLocation(player2.getX(),player2.getY()-10);
           
       }
   }
   
   public class DownAction2 extends AbstractAction
   {
       @Override
       public void actionPerformed(ActionEvent event)
       {
           player2.setLocation(player2.getX(),player2.getY()+10);
       }
   }
   
   public class LeftAction2 extends AbstractAction
   {
       @Override
       public void actionPerformed(ActionEvent event)
       {
           player2.setLocation(player2.getX()-10,player2.getY());
       }
   }
   
   public class RightAction2 extends AbstractAction
   {
       @Override
       public void actionPerformed(ActionEvent event)
       {
           player2.setLocation(player2.getX()+10,player2.getY());
       }
   }
   
   
   
   
   
   
   
}
