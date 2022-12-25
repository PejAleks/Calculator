import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calculator implements ActionListener {
    Frame f=new Frame("mini AWT calculator");
    Label l1=new Label("Unesite prvi broj:");
    Label l2=new Label("Izaberite operaciju:");
    Label l3= new Label("Unesite drugi broj:");
    Label l4=new Label("Rezultat:");
    Label l5=new Label();
    TextField tf1=new TextField();
    TextField tf2=new TextField();
    TextField tf3=new TextField();
    Choice c=new Choice();
    Button b=new Button("Izračunaj");
    Calculator(){
        f.setLayout(new GridLayout(0,2,10,20));
        f.setSize(800,400);
        c.add("+");
        c.add("-");
        c.add("*");
        c.add("/");
        f.setBackground(Color.lightGray);
        c.setBackground(Color.cyan);
        l4.setBackground(Color.cyan);
        l1.setBackground(Color.white);
        l2.setBackground(Color.white);
        l3.setBackground(Color.white);
        f.add(l1);
        f.add(tf1);
        f.add(l2);
        f.add(c);
        f.add(l3);
        f.add(tf2);
        f.add(l5);
        f.add(b);
        f.add(l4);
        f.add(tf3);

        b.addActionListener(this);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       try {  Double x=Double.parseDouble(tf1.getText());
           Double y=Double.parseDouble(tf2.getText());

           if (c.getItem(c.getSelectedIndex())=="+"){
               tf3.setText(String.valueOf(x+y));
           }
           else if(c.getItem(c.getSelectedIndex())=="-"){
               tf3.setText(String.valueOf(x-y));
           }
           else if (c.getItem(c.getSelectedIndex())=="*"){
               tf3.setText(String.valueOf(x*y));
           }
           else  if(c.getItem(c.getSelectedIndex())=="/"){
               if (y==0){
                   tf3.setText("Nije dozvoljeno dijeliti sa nulom!");
               }
               else {
                   tf3.setText(String.valueOf(x/y));
               }
       }
        }catch (NumberFormatException exception){
           tf3.setText("Unesite brojeve!");
       }
        }
        }




