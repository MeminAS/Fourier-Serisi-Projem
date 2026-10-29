import java.awt.Color;
import javax.swing.*;


public class sistem_sinyal_proje extends JFrame {
    JButton btn1,btn2;
    JLabel lbl1,lbl2;
    JPanel dalgaPaneli = new JPanel();

    sistem_sinyal_proje(){
        setLayout(null);
        btn1 = new JButton("ONAYLA");
        btn1.setBounds(40, 400, 100, 20);
        btn1.setForeground(Color.CYAN);
        btn1.setBackground(Color.black);
        btn1.setFocusPainted(false);
        dalgaPaneli.setBounds(300, 50, 400,200); 
        dalgaPaneli.setBorder(new javax.swing.border.LineBorder(Color.CYAN, 2, true));  
        dalgaPaneli.setBackground(Color.lightGray);
        



        add(btn1);
        //add(btn2);
        //add(lbl1);
        //add(lbl2);
        add(dalgaPaneli);


    }
    public static void main(String[] args) {
        sistem_sinyal_proje proj = new sistem_sinyal_proje();
        proj.setTitle("SİSTEM VE SİNYAL İŞLEME PROJESİ");
        proj.setSize(700,500);
        proj.setLocationRelativeTo(null);
        proj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        proj.setVisible(true);

        
    }
}