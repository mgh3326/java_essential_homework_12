import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Frame6 extends JFrame
{
    JPanel p = new JPanel();
    npc n1;
    Thread th;
    ImageIcon imgicon= new ImageIcon("images/apple.jpg");
    JLabel la;
    JLabel la1;
    Frame6()
    {
        this.setTitle("test");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        n1 = new npc();
        th = new Thread(n1);
        p.setLayout(null);
        this.addMouseListener(new my());
        la = new JLabel(imgicon);
        la.setSize(50, 50);
        p.add(la);
        this.add(p);
        this.setVisible(true);
        this.setSize(600, 600);
        th.start();
    }
    class my implements MouseListener
    {

        public void mouseClicked(MouseEvent e)
        {

            la = new JLabel(imgicon);
            la.setSize(50, 50);
            p.add(la);
            la.setLocation(e.getX(), e.getY());

        }

        public void mouseEntered(MouseEvent arg0) {}

        public void mouseExited(MouseEvent arg0) {}

        public void mousePressed(MouseEvent arg0) {}

        public void mouseReleased(MouseEvent arg0) {}

    }




    class npc implements Runnable
    {
        public void run()
        {
            while(true)
            {
                try
                {
                    la.setLocation(la.getX(), la.getY()-5);
                    Thread.sleep(200);
                    if(la.getY() <=0)
                    {
                        la.setVisible(false);
                    }

                }
                catch(InterruptedException e){return;}
            }
        }
    }

}





public class q_6_2
{

    public static void main(String[] args)
    {
        new Frame6();
    }

}
