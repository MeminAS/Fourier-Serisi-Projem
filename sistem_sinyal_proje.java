import java.awt.Color;
import javax.swing.*;


public class sistem_sinyal_proje extends JFrame {
    JButton btn1,btn2,btn3;
    JLabel lbl1,lbl2,lbl3;
    JTextField mtn1,mtn2,mtn3;
    JPanel dalgaPaneli = new JPanel();

    sistem_sinyal_proje(){
        setLayout(null);

        btn1 = new JButton();
        btn2 = new JButton();
        btn3 = new JButton();
        mtn1 = new JTextField();
        mtn2 = new JTextField();
        mtn3 = new JTextField();
        lbl1 = new JLabel();
        lbl2 = new JLabel();
        lbl3 = new JLabel();

        mtn1.setText(" ");
        mtn2.setText(" ");
        mtn3.setText(" ");

        mtn1.setBounds(20, 50, 52,20);
        mtn1.setBorder(new javax.swing.border.LineBorder(Color.black, 2, true));
        mtn2.setBounds(20, 81, 52,20);
        mtn2.setBorder(new javax.swing.border.LineBorder(Color.black, 2, true));
        mtn3.setBounds(20, 112, 52,20);
        mtn3.setBorder(new javax.swing.border.LineBorder(Color.black, 2, true));

        dalgaPaneli.setBounds(300, 50, 400,200); 
        dalgaPaneli.setBorder(new javax.swing.border.LineBorder(Color.CYAN, 3, true));  
        dalgaPaneli.setBackground(Color.lightGray);

        lbl1.setBounds(90,50,92,20);
        lbl1.setText("FREKANS GİR");
        lbl2.setBounds(90,81,92,20);
        lbl2.setText("PERİYOT GİR");
        lbl3.setBounds(90,112,92,20);
        lbl3.setText("GENLİK GİR");

        btn1.setBounds(20,171,200,25);
        btn1.setText("Fourier Serisini Çizdir");
        btn1.setFocusPainted(false);
        //btn1.setRolloverEnabled(false); parlama efektini kaldırma
        btn2.setBounds(20, 198,200,25);
        btn2.setText("Fourier Dönüşümünü Çizdir");
        btn2.setFocusPainted(false);
        btn3.setBounds(20,225,200,25);
        btn3.setText("Ekranı Temizle");
        btn3.setFocusPainted(false);
        


        add(mtn1);
        add(mtn2);
        add(mtn3);
        add(dalgaPaneli);
        add(btn1);
        add(btn2);
        add(btn3);
        add(lbl1);
        add(lbl2);
        add(lbl3);


    }
    public static void main(String[] args) {
        sistem_sinyal_proje proj = new sistem_sinyal_proje();
        proj.setTitle("SİSTEM VE SİNYAL İŞLEME PROJESİ");
        proj.setSize(750,400);
        proj.setLocationRelativeTo(null);
        proj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        proj.setVisible(true);

        
    }
}