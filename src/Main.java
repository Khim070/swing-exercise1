import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        try{
            JFrame j = new JFrame();
            JLabel label_khmer = new JLabel("Khmer:");
            JTextField textfield_khmer = new JTextField();
            JButton btn_Exchange = new JButton("Exchange");

            label_khmer.setBounds(40,50,100, 40);
            textfield_khmer.setBounds(100,50,100,40);
            btn_Exchange.setBounds(200,50,100,40);

            JLabel label_english = new JLabel("English:");
            JTextField textField_english = new JTextField();
            JButton btn_Clear = new JButton("Clear");
            ActionListener actionListener_khmer = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    float khmer_text = Float.parseFloat(textfield_khmer.getText());
                    float result = khmer_text/4000;
                    textField_english.setText(String.valueOf(result)+" $");
                }
            };
            //btn_Exchange.addActionListener(actionListener_khmer);

            label_english.setBounds(40,100,100, 40);
            textField_english.setBounds(100,100,100,40);
            btn_Clear.setBounds(200,100,100,40);
            ActionListener actionListener_english = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    float english_text = Float.parseFloat(textField_english.getText());
                    float result = english_text*4000;
                    textfield_khmer.setText(String.valueOf(result)+" ៛");
                }
            };
            btn_Exchange.addActionListener(actionListener_english);

            ActionListener clear_the_value = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textfield_khmer.setText("");
                    textField_english.setText("");
                }
            };
            btn_Clear.addActionListener(clear_the_value);

            j.setLayout(null);

            j.add(label_khmer);
            j.add(textfield_khmer);
            j.add(btn_Exchange);

            j.add(label_english);
            j.add(textField_english);
            j.add(btn_Clear);

            j.setSize(350,250);
            j.setVisible(true);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}