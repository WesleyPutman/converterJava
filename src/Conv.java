import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 

// Creation de la page 
public class Conv extends JFrame implements ItemListener, ActionListener{
        static JFrame frame; 
        static JComboBox<String> combobox, combobox2; 
        static JLabel l1, l2; 
        static JTextField unité, unité2 ;
        static JButton button;
    public static void main (String[]args)
     {

        
// Création de la frame de base

        JFrame frame = new JFrame("Test de convertisseur");
        
//Panel
        
        JPanel panel =new JPanel();
        panel.setBounds(0,0, 600 , 50);
        panel.setBackground(new Color(128, 128 ,255));
        
//Création de la combobox

        Conv obj = new Conv();
        String s1[] = {"euro","yen","Livre sterling"};
        combobox = new JComboBox<>(s1);
        combobox.addItemListener(obj); 
        combobox2 = new JComboBox<>(s1);
        combobox2.addItemListener(obj);

// étiquettes

        l1 = new JLabel("Convertir");
        l2 = new JLabel("en");

// Jbutton

        button = new JButton("Valider");
        button.setSize(60 , 90);
        button.setVisible(true);
        button.setBounds(180,  100,  200,  60);

// Textfield

        unité = new JTextField();
        unité.setBounds(20,60,200,28);
        unité2 = new JTextField();
        unité2.setBounds(350 , 60 , 200 , 28);


// Switch !! + operations

button.addActionListener (new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
         int selection = combobox.getSelectedIndex();

switch (selection){
        case 0:
                 if(combobox2.getSelectedItem().equals("euro")){
                        String str = (unité.getText());
                        try{
                        double numbers = Double.parseDouble(str);
                        double total = numbers;
                        String total2= Double.toString(total);
                        unité2.setText(total2);
                        
                        }catch(NumberFormatException ex){
                        // The user entered an invalid number, report the error
                        } 
                }
                else if(combobox2.getSelectedItem().equals("yen")){
                        String str = (unité.getText());
                        try{
                        double numbers = Double.parseDouble(str);
                        double yen = 139.77;
                        double total = numbers * yen;
                        String total2= Double.toString(total);
                        unité2.setText(total2);
                        
                        }catch(NumberFormatException ex){
                        // The user entered an invalid number, report the error
                        } 
                }
                else if(combobox2.getSelectedItem().equals("Livre sterling")){
                        String str = (unité.getText());
                        try{
                        double numbers = Double.parseDouble(str);
                        double sterling = 0.86;
                        double total = numbers * sterling;
                        String total2= Double.toString(total);
                        unité2.setText(total2);

                        }catch(NumberFormatException ex){
                        // The user entered an invalid number, report the error
                        } 
                }
                        break;
        case 1 :

                if(combobox2.getSelectedItem().equals("euro")){
                        String str = (unité.getText());
                        try{
                        double numbers = Double.parseDouble(str);
                        double euro = 0.0072;
                        double total = numbers*euro;
                        String total2= Double.toString(total);
                        unité2.setText(total2);
                        
                        }catch(NumberFormatException ex){
                        // The user entered an invalid number, report the error
                        } 
                }
                else if(combobox2.getSelectedItem().equals("yen")){
                        String str = (unité.getText());
                        try{
                        double numbers = Double.parseDouble(str);
                        double total = numbers;
                        String total2= Double.toString(total);
                        unité2.setText(total2);
                        
                        }catch(NumberFormatException ex){
                        // The user entered an invalid number, report the error
                        } 
                }
                else if(combobox2.getSelectedItem().equals("Livre sterling")){
                        String str = (unité.getText());
                        try{
                        double numbers = Double.parseDouble(str);
                        double sterling = 0.0062;
                        double total = numbers * sterling;
                        String total2= Double.toString(total);
                        unité2.setText(total2);

                        }catch(NumberFormatException ex){
                        // The user entered an invalid number, report the error
                        } 
                }
                        break;
        case 2 :

                if(combobox2.getSelectedItem().equals("euro")){
                        String str = (unité.getText());
                        try{
                        double numbers = Double.parseDouble(str);
                        double euro = 1.16;
                        double total = numbers * euro;
                        String total2= Double.toString(total);
                        unité2.setText(total2);
                        
                        }catch(NumberFormatException ex){
                        // The user entered an invalid number, report the error
                        } 
                }
                else if(combobox2.getSelectedItem().equals("yen")){
                        String str = (unité.getText());
                        try{
                        double numbers = Double.parseDouble(str);
                        double yen = 161.72;
                        double total = numbers * yen;
                        String total2= Double.toString(total);
                        unité2.setText(total2);
                        
                        }catch(NumberFormatException ex){
                        // The user entered an invalid number, report the error
                        } 
                }
                else if(combobox2.getSelectedItem().equals("Livre sterling")){
                        String str = (unité.getText());
                        try{
                        double numbers = Double.parseDouble(str);
                        double total = numbers;
                        String total2= Double.toString(total);
                        unité2.setText(total2);

                        }catch(NumberFormatException ex){
                        // The user entered an invalid number, report the error
                        } 
                }
                        break;
                }
        }
});
      
// Intégration étiquettes + combobox au panel

        panel.add(l1);
        panel.add(combobox);
        panel.add(l2);
        panel.add(combobox2);     

//Intégration du panel dans la frame + disposition de la frame

        frame.add(panel);
        frame.add(unité);  
        frame.add(unité2);
        frame.add(button);
        frame.setSize(600,250);
        frame.setLocation(650, 300);
        frame.setResizable(false);
        frame.setLayout(null);  
        frame.setVisible(true); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        }
@Override
public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
}
@Override
public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub


        
        }
        
}