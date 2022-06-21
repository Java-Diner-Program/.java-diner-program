//Java Packages
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Dimension;
import java.awt.event.WindowEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.util.Random;

//Random Number Generators
public class Order extends JFrame {
Random rand = new Random();
int upperbound = 1000;
int int_random = rand.nextInt(upperbound);

public static boolean cont = true;
JLabel title;
JLabel burgertype;
JLabel size;
JLabel veggie;
JLabel condiment;
JLabel drink;

JRadioButton b1;
JRadioButton b2;
JRadioButton b3;
JRadioButton b4;
JRadioButton b5;
JRadioButton b6;
JRadioButton b7;
JRadioButton b8;
JRadioButton b9;
JRadioButton b10;
JRadioButton b11;
JRadioButton b12;

JCheckBox c1;
JCheckBox c2;
JCheckBox c3;
JCheckBox c4;
JCheckBox c5;
JCheckBox c6;
JCheckBox c7;
JCheckBox c8;
JCheckBox c9;
JCheckBox c10;
JCheckBox c11;
JCheckBox c12;

JButton process;
ButtonGroup group;
JPanel p1;
JPanel p2;
JPanel p3;
JPanel p4;
JPanel p5;
JPanel p6;
JPanel p7;
JPanel p8;
JPanel p9;
JPanel p10;
JPanel p11;
JPanel p12;


double total;
boolean cb1 = false;
boolean cb2 = false;
boolean cb3 = false;
boolean cb4 = false;
boolean cb5 = false;
boolean cb6 = false;
boolean cb7 = false;
boolean cb8 = false;
boolean cb9 = false;
boolean cb10 = false;
boolean cb11 = false;
boolean cb12 = false;


boolean pickles = false;
boolean tomato = false;
boolean lettuce = false;
boolean regularburger = false;
boolean baconburger = false;
boolean veggieburger = false;
boolean mayo = false;
boolean ketchup = false;
boolean mustard = false;
boolean waterbottle = false;
boolean coke = false;
boolean dietcoke = false;

String vegetables = "Vegetables: ";
String burger = "Burger Type: ";
String condiments = "Condiments: ";

double length = 0;
boolean pf = false;
boolean tf = false;
boolean lf = false;
boolean rf = false;
boolean bf = false;
boolean vf = false;
boolean mf = false;
boolean kf = false;
boolean muf = false;
boolean wbf = false;
boolean cf = false;
boolean dcf = false;

String sizeString;
String num;
String price = "Amount Due: ";
String veggies = "";
String burgers = "";
String drinks = "";

DefaultListModel tops;
double tprice;
String listData[] = new String [3];


public Order(){

    super ("");
    this.addKeyListener(new KeyboardInput());
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    p1 = new JPanel();

    title = new JLabel("Welcome to the Java Diner!");
    p1.add(title);

    add(p1, BorderLayout.NORTH);

    p2 = new JPanel();
    p2.setLayout(new GridLayout(4,2));
    
    
    burgertype = new JLabel("Burger Type");
    p2.add(burgertype);

   
    size = new JLabel("Combo Size");
    p2.add(size);
    
    
    veggie = new JLabel("Vegetables");
    p2.add(veggie);
    
    condiment = new JLabel("Condiments");
    p2.add(condiment);
    
drink = new JLabel("Drinks");
    p2.add(drink);


c5 = new JCheckBox("#1- Veggie Burger");
    p2.add(c5);

    c5.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            if(c5.isSelected()){
                veggieburger = true;
            }
            else{
                veggieburger = false;
            }

            if(veggieburger == true){
                length++;
            }
            else{
                length--;
            }
        }
    });


        b1 = new JRadioButton("Small(Drink-16oz): $3.00");
    p2.add(b1);

    b1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            total = 3.00;
            sizeString = "Combo Size: Small";
            
            

        }
    });
    
c1 = new JCheckBox("Traditional Sliced Pickles");
    p2.add(c1);

    c1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            if(c1.isSelected()){
                pickles = true;
            }
            else{
                pickles = false;
            }

            if(pickles == true){
                length++;
            }
            else{
                length--;
            }
        }
    });
    c7 = new JCheckBox("Mayo");
    p2.add(c7);

    c7.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            if(c7.isSelected()){
                mayo = true;
            }
            else{
                mayo = false;
            }

            if(mayo == true){
                length++;
            }
            else{
                length--;
            }
        }
    });
    c10 = new JCheckBox("Water Bottle");
    p2.add(c10);

    c10.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            if(c10.isSelected()){
                waterbottle = true;
            }
            else{
                waterbottle = false;
            }

            if(waterbottle == true){
                length++;
            }
            else{
                length--;
            }
        }
    });


c4 = new JCheckBox("#2- Regular Burger");
    p2.add(c4);

    c4.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            if(c4.isSelected()){
                regularburger = true;
            }
            else{
                regularburger = false;
            }

            if(regularburger == true){
                length++;
            }
            else{
                length--;
            }
        }
    });

     b2 = new JRadioButton("Medium(Drink-22oz): $4.00");
    p2.add(b2);

    b2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            total = 4.00;
            sizeString = "Combo Size: Medium";
        }
    });
    c2 = new JCheckBox("Sliced Tomatoes(Roma)");
    p2.add(c2);

    c2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            if(c2.isSelected()){
                tomato = true;
            }
            else{
                tomato = false;
            }

            if(tomato == true){
                length++;
            }

            else{
                length--;
            }
        }
    });
    c8 = new JCheckBox("Ketchup");
    p2.add(c8);

    c8.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            if(c8.isSelected()){
                ketchup = true;
            }
            else{
                ketchup = false;
            }

            if(ketchup == true){
                length++;
            }
            else{
                length--;
            }
        }
    });
c11 = new JCheckBox("Coke");
    p2.add(c11);

    c11.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            if(c11.isSelected()){
                coke = true;
            }
            else{
                coke = false;
            }

            if(coke == true){
                length++;
            }
            else{
                length--;
            }
        }
    });


    c6 = new JCheckBox("#3- Bacon Burger");
    p2.add(c6);

    c6.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            if(c6.isSelected()){
                baconburger = true;
            }
            else{
                baconburger = false;
            }

            if(baconburger == true){
                length++;
            }
            else{
                length--;
            }
        }
    });
b3 = new JRadioButton("Large(Drink-32oz): $5.00");
    p2.add(b3);

    b3.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            total = 5.00;
            sizeString = "Combo Size: Large";
        }
    });
    c3 = new JCheckBox("Lettuce(Romaine)");
    p2.add(c3);

    c3.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            if(c3.isSelected()){
            lettuce = true;

            }
            else{
                lettuce = false;
            }

            if(lettuce == true){
                length++;
            }

            else{
                length--;
            }
        }
    });
    c9 = new JCheckBox("Mustard");
    p2.add(c9);

    c9.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            if(c9.isSelected()){
                mustard = true;
            }
            else{
                mustard = false;
            }

            if(mustard == true){
                length++;
            }
            else{
                length--;
            }
        }
    });

  c12 = new JCheckBox("Diet Coke");
    p2.add(c12);

    c12.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            if(c12.isSelected()){
                dietcoke = true;
            }
            else{
                dietcoke = false;
            }

            if(dietcoke == true){
                length++;
            }
            else{
                length--;
            }
        }
    });


    group = new ButtonGroup();
    group.add(b1);
    group.add(b2);
    group.add(b3);
    group.add(b4);
    
    
    group.add(b5);
    group.add(b6);
    group.add(b7);
    group.add(b8);
    group.add(b9);
    group.add(b10);
    group.add(b11);
    group.add(b12);

    add(p2, BorderLayout.CENTER);

    p3 = new JPanel();
    p3.setLayout(new BorderLayout());
    process = new JButton("Process Order");
    p3.add(process, BorderLayout.NORTH);

    process.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            if(pickles == true){
                pf = true;
                if( pf == true && tf == false && lf == false ){
                    veggies = veggies + "Traditional Sliced Pickles";
                }
                else{
                    veggies = veggies + ", Traditional Sliced Pickles";
                }
            }
            if(tomato == true){
                tf = true;
                if((pf != true)&&(tf == true)&&(lf != true)){
                    veggies = veggies + "Sliced Tomatoes(Roma)";
                }
                else{
                    veggies = veggies + ", Sliced Tomatoes(Roma)";
                }
            }
            if(lettuce == true){
                lf = true;
                if((pf != true)&&(tf != true)&&(lf == true)){
                    veggies = veggies + "Lettuce(Romaine)";
                }
                else{
                    veggies = veggies + ", Lettuce(Romaine)";
                }
            }
            if(regularburger == true){
                lf = true;
                if((rf != true)&&(tf != true)&&(rf == true)){
                    burgers = burgers + "#2- Regular Burger";
            }
            }
            if(veggieburger == true){
                vf = true;
                if((vf != true)&&(vf != true)&&(vf == true)){
                    burgers = burgers + "#1- Veggie Burger";
            }
            }
            if(baconburger == true){
                bf = true;
                if((bf != true)&&(bf != true)&&(bf == true)){
                    burgers = burgers + "#3- Bacon Burger";
            }
            }

             if (rf == true){
               burgers+= " #2-Regular Burger";
            }
            if (vf == true){
               burgers+= " #1-Veggie Burger";
            }
            if (bf == true){
               burgers+= " #3-Bacon Burger";
            }

            if (tf == true){
               vegetables+= " Sliced Tomatoes(Roma)";
            }
            
            if (lf == true){
               vegetables+= ", Lettuce(Romaine)";
            }else{
               if (pf == true){
                  vegetables+= ", Traditional Sliced Pickles.";
               }else{
                  vegetables+= ".";
               }
            }
            tprice = 0.00 * length;

            total = total + tprice;
            num = Double.toString(total);

            price = price + "$" + num;
            
            listData [0] = sizeString;
            listData [1] = veggies;
            listData [2] = price;


            System.out.println(listData[0]);
            System.out.println(listData[1]);
            System.out.println(listData[2]);


System.out.println("Your confirmation code # is: " + int_random);

        }
    });
    


    JList<String> list = new JList<>();
    list.setSelectedIndex(0);
    list.setVisibleRowCount(3);


    add(p3, BorderLayout.SOUTH);

}

public static void main(String[]args){

    Order frame = new Order();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(350,220);
    frame.setVisible(true);
    
    while (true){
    frame.repaint();
    frame.revalidate();
    if (!cont){
        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
    }
    }

}

}

class KeyboardInput implements KeyListener{
    @Override
    public void keyPressed(KeyEvent e){
        if (e.getKeyCode() == 80){
            Order.cont = false;
        }
    }

    @Override
    public void keyReleased(KeyEvent e){

    }

    @Override
    public void keyTyped(KeyEvent e){

    }
}
