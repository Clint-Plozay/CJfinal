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
public class gameorigionalcopy
{
    
    
    JFrame frame;
    JLabel player1;
    
    
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;
    
    int x;
    
   gameorigionalcopy()
   {
       frame = new JFrame("KeyBindingDemo");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(420,420);
       frame.setLayout(null);
       
       player1 = new JLabel();
       player1.setBackground(Color.red);
       player1.setBounds(50,50,50,50);
       player1.setOpaque(true);
       
       upAction = new UpAction();
       downAction = new DownAction();
       leftAction = new LeftAction();
       rightAction = new RightAction();
       
       frame.setVisible(true);
       frame.add(player1);
       
       x=0;
       
       
       player1.getInputMap().put(KeyStroke.getKeyStroke("UP"),"upAction");
       player1.getActionMap().put("upAction",upAction);
       
       player1.getInputMap().put(KeyStroke.getKeyStroke("DOWN"),"downAction");
       player1.getActionMap().put("downAction",downAction);
       
       player1.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"leftAction");
       player1.getActionMap().put("leftAction",leftAction);
       
       player1.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"),"rightAction");
       player1.getActionMap().put("rightAction",rightAction);
       
   }
   
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
}
