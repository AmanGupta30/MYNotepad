package note;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.*;

public class ImageOperation {
    public static void operate(int key){
        JFileChooser fc=new JFileChooser();
        fc.showOpenDialog(null);
        File file=fc.getSelectedFile();
        //file input stream
        
        try{
            FileInputStream fis=new FileInputStream(file);
            byte []data=new byte[fis.available()];
            fis.read(data);
            int i=0;
            for(byte b:data){
                System.out.println(b);
                data[i]=(byte)(b^key);//xor b and key
                i++;
            }
            FileOutputStream fos=new FileOutputStream(file);
            fos.write(data);
            fos.close();
            fis.close();
            JOptionPane.showMessageDialog(null, "Done");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    public static void main(String[] args){
        System.out.println("This is Testing:");
        JFrame f=new JFrame();
        f.setTitle("File Encryption");
        f.setBounds(550, 250, 700, 400);
        f.setBackground(Color.lightGray);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font=new Font("Roboto",Font.BOLD,24);
        JButton b=new JButton();
        b.setText("Set Secuity");
        b.setFont(font);
        b.setBackground(Color.CYAN);
        b.setForeground(Color.BLACK);
       
        
        
       JTextField t=new JTextField(10);
       t.setFont(font);
       f.add(t);
        b.addActionListener(e->{
            System.out.println("Remember Your Keys");
            String text=t.getText();
            int temp=Integer.parseInt(text);
            operate(temp);//key   });
       f.setLayout(new FlowLayout());
               });
       
       f.add(b);
       f.setVisible(true);
    }
}
