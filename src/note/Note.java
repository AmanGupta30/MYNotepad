package note;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.awt.datatransfer.*;
import java.time.LocalTime;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.swing.text.*;
import javax.swing.text.Highlighter;

public class Note extends Frame {

    String s = "";
Font f;
    public Note() {

        Image im = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Aman Gupta\\Documents\\NetBeansProjects\\Notepad\\src\\note\\notepad.png");
        setIconImage(im);
        //setBackground(Color.BLUE);
        Font fa = new Font("Serif", Font.PLAIN, 15);
        MenuBar mb = new MenuBar();
        Menu m1 = new Menu("File");
        Menu m2 = new Menu("Edit");
        Menu m3 = new Menu("Format");
        Menu m6 = new Menu("About");
        Menu m5 = new Menu("Themes");
        m5.setFont(fa);
        m6.setFont(fa);
        m3.setFont(fa);
        m2.setFont(fa);
        m1.setFont(fa);
        Menu m8 = new Menu("Help");
        m8.setFont(fa);
        Menu m9 = new Menu("Typing master");
        m9.setFont(fa);
        Menu m10 = new Menu("Security");
        m10.setFont(fa);
        //Menu m4=new Menu("Open");
        MenuItem open = new MenuItem("Open");
        MenuItem aash = new MenuItem("About Creator");
        MenuItem fs = new MenuItem("Text Size");
        MenuItem t1 = new MenuItem("Pink Mozarella");
        MenuItem t2 = new MenuItem("Oceanic");
        MenuItem t3 = new MenuItem("Silver Voilet");
        MenuItem t4 = new MenuItem("Jacksie");
        MenuItem mi1 = new MenuItem("New");
        MenuItem mi3 = new MenuItem("Save");
        MenuItem mi4 = new MenuItem("Save As");
        MenuItem mi5 = new MenuItem("cut");
        MenuItem del = new MenuItem("Delete");
        MenuItem mi6 = new MenuItem("copy");
        MenuItem selectall = new MenuItem("SelectAll");
        MenuItem td = new MenuItem("Time & Date");
        MenuItem print = new MenuItem("Print");
        MenuItem exit = new MenuItem("Exit               Ctrl+E");
        MenuItem mi11 = new MenuItem("copy all");
        MenuItem Search = new MenuItem("Search");
        
        MenuItem mi7 = new MenuItem("Paste");
        MenuItem mi12 = new MenuItem("Over Paste");
        Menu mi8 = new Menu("font");
        MenuItem f1 = new MenuItem("Tahoma");
        f1.setFont(new Font("Thahoma", Font.ITALIC | Font.BOLD, 14));
        MenuItem f2 = new MenuItem("SERIF");
        f2.setFont(new Font("Serif", Font.ITALIC, 14));
        MenuItem f3 = new MenuItem("SansSerif");
        f3.setFont(new Font("SensSerif", Font.ITALIC, 14));
        MenuItem f4 = new MenuItem("PLAIN");
        f4.setFont(new Font("Serif", Font.PLAIN, 14));
        MenuItem f5 = new MenuItem("MONOSPACED");
        f5.setFont(new Font("MONOSPACED", Font.ITALIC, 14));
        MenuItem f6 = new MenuItem("DIALOG_INPUT");
        f6.setFont(new Font("DIALOG_INPUT", Font.ITALIC, 14));
        MenuItem f7 = new MenuItem("DIALOG");
        f7.setFont(new Font("Tahoma", Font.TRUETYPE_FONT, 14));
        MenuItem f8 = new MenuItem("HANGING_BASELINE");
        f8.setFont(new Font("Serif", Font.HANGING_BASELINE, 14));
        MenuItem f9 = new MenuItem("SERIF BOLD");
        f9.setFont(new Font("Serif", Font.BOLD | Font.PLAIN, 14));
        mi8.add(f1);
        mi8.add(f2);
        mi8.add(f3);
        mi8.add(f4);
        mi8.add(f5);
        mi8.add(f6);
        mi8.add(f7);
        mi8.add(f8);
        mi8.add(f9);
        MenuItem mi10 = new MenuItem("Help For..");
        //typing master
        MenuItem mi19 = new MenuItem("Typing Check");
        //Encryption
        MenuItem mi20 = new MenuItem("Encryption..");
        MenuItem mi21 = new MenuItem("Terminal..");
        CheckboxMenuItem cmi1 = new CheckboxMenuItem("Word Wrap", true);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m5);
        m2.add(del);
        mb.add(m6);
        mb.add(m8);
        mb.add(m9);
        mb.add(m10);
        m6.add(aash);
        m3.add(fs);
        m1.add(open);
        m1.add(mi1);
        //m1.add(m4);
        m1.add(mi3);
        m1.add(mi4);
        m1.add(mi4);
        m1.add(td);
        m1.add(print);
        m1.add(exit);
        m2.add(mi5);
         m2.add(selectall);
        m2.add(mi6);
        m2.add(mi11);
       // m2.add(mi12);
        m2.add(mi7);
       
        m2.add(Search);
        m3.add(mi8);
        m3.add(cmi1);
        //m4.add(mi9);
        //m4.add(mi10);
        m5.add(t1);
        m5.add(t2);
        m5.add(t3);
        m5.add(t4);
        //helping
        m8.add(mi10);
        //typing master
        m9.add(mi19);
        //Encryption
        m10.add(mi20);
        //add terminal
        m10.add(mi21);
        setMenuBar(mb);

        TextArea ta = new TextArea("What you have to type today?", 23, 34, TextArea.SCROLLBARS_VERTICAL_ONLY);
        Color clr = new Color(200, 100, 150);

        //mb.setBackground(clr);
        //mb.setForeground(Color.YELLOW); 
        ta.setFont(new Font("Roboto", Font.PLAIN, 14));
        add(ta);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        mi3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String st = ta.getText();
                Save ss = new Save(st);
            }
        });
        //Selectall
        selectall.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ta.selectAll();
            }
        }
        );
        mi1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
                ta.setText("");
            }
        });
        mi4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String fname = JOptionPane.showInputDialog("Enter File Name");
                String st = ta.getText();
                Save sa = new Save(st, fname);

            }

        });
        //help
        mi10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Created by:Aman Gupta \n Email-Akum96392@gmail.com \n http://localhost:8080/ChatBot/ :)");

            }
        });
        //time & Date
        td.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ta.insert(new Date().toString(), ta.getSelectionStart());

            }
        }
        );
        //Exit

        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);

            }
        }
        );

        print.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(Note.this.add(ta),
                        "Get ur printer repaired first! It seems u dont have one!",
                        "Bad Printer",
                        JOptionPane.INFORMATION_MESSAGE
                );

            }
        }
        );
        //font Name
        f1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f = new Font("Thahoma", Font.ITALIC | Font.BOLD, 14);
                ta.setFont(f);
            }
        });
        f2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f = new Font("Serif", Font.ITALIC, 14);
                ta.setFont(f);
            }
        });
        f3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f = new Font("SensSerif", Font.ITALIC, 14);
                ta.setFont(f);
            }
        });
        f4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f = new Font("Serif", Font.PLAIN, 14);
                ta.setFont(f);
            }
        });
        f5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f = new Font("MONOSPACED", Font.ITALIC, 14);
                ta.setFont(f);
            }
        });
        f6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f = new Font("DIALOG_INPUT", Font.ITALIC, 14);
                ta.setFont(f);
                ta.setForeground(Color.black);
            }
        });
        f7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f = new Font("Tahoma", Font.TRUETYPE_FONT, 14);
                ta.setFont(f);
                ta.setForeground(Color.BLACK);
            }
        });
        f8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f = new Font("Serif", Font.HANGING_BASELINE, 14);
                ta.setFont(f);
                ta.setForeground(Color.blue);
            }
        });
        f9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f = new Font("Serif", Font.BOLD | Font.PLAIN, 14);
                ta.setFont(f);
                ta.setForeground(Color.blue);
            }
        });
        
//Typing Master
        mi19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    WPM();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
//Encrpyprion
        mi20.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ImageOperation();
            }
        });
        //terminal
        mi21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    // Just one line and you are done ! 
                    // We have given a command to start cmd
                    // /K : Carries out command specified by string
                    Runtime.getRuntime().exec(new String[]{"cmd", "/K", "Start"});

                } catch (Exception e) {
                    System.out.println("HEY Buddy ! U r Doing Something Wrong ");
                    e.printStackTrace();
                }
            }
        });
        del.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ta.setText("");
            }
        }
        );
        //Open File Using.
        open.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
                int result = fileChooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File fi = new File(fileChooser.getSelectedFile().getAbsolutePath());
                    try {
                        // String
                        String s1 = "", sl = "";

                        // File reader
                        FileReader fr = new FileReader(fi);

                        // Buffered reader
                        BufferedReader br = new BufferedReader(fr);

                        // Initialize sl
                        sl = br.readLine();

                        // Take the input from the file
                        while ((s1 = br.readLine()) != null) {
                            sl = sl + "\n" + s1;
                        }

                        // Set the text
                        ta.setText(sl);
                    } catch (Exception evt) {
                        JOptionPane.showMessageDialog(fileChooser, evt.getMessage());
                    }

                }
            }
        });

         Search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                JFrame fr = new JFrame("Search");
                fr.setBounds(250, 20, 300, 150);
                fr.setBackground(Color.darkGray);
                fr.setLocationRelativeTo(null);
                //fr.setDefaultCloseOperation(JFrame);
                fr.setLayout(new FlowLayout(56));
                JTextField fg = new JTextField(10);
                //fg.setBounds(150, 150, 250, 50);
                Font f = new Font("Roboto", Font.BOLD, 24);
                fg.setBackground(Color.WHITE);
                fg.setForeground(Color.BLACK);
                fg.setFont(f);
                fr.add(fg);
                JButton b = new JButton("Search");
                b.setBackground(Color.CYAN);
                b.setForeground(Color.BLACK);
                b.setFont(f);
                b.addActionListener(e -> {
                    String s = ta.getText().toLowerCase();
                    String s1 = fg.getText().toLowerCase();

                    if (s.contains(s1)) {
                        JOptionPane.showMessageDialog(null, s1 + " is Available Your TXT File");
                    } else {
                        JOptionPane.showMessageDialog(null, s1 + " is not Available Your TXT File");
                    }
                }
                );

                fr.add(b);
                fr.setVisible(true);
            }
        });
        mi6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                s = ta.getSelectedText();
                // System.out.println(st); //come here

            }
        });
        mi11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                s = ta.getText();
                System.out.println(s);
                //  ta.setText(st);
            }
        });
        mi7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ta.insert(s, ta.getCaretPosition());
            }
        });
        mi12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                try {
                    Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
                    ta.append((String) c.getData(DataFlavor.stringFlavor));
                    //System.out.println(c.getData(DataFlavor.stringFlavor));
                } catch (Exception e) {
                }
            }
        });
        mi5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
                    StringSelection testData;
                    String selt = ta.getSelectedText();
                    if ((selt.length() > 0)) {
                        testData = new StringSelection(selt);
                    } else {
                        testData = new StringSelection("Test Data");
                    }

                    c.setContents(testData, testData);
                    ta.setText(ta.getText().replace(ta.getSelectedText(), ""));

                } catch (Exception e) {
                }
            }
        });
        t1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Color clr = new Color(200, 100, 150);
                ta.setBackground(clr);
                ta.setForeground(Color.YELLOW);
                ta.setFont(new Font("Harrington", Font.PLAIN, 24));
            }
        });
        t2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Color clr = new Color(200, 200, 250);
                ta.setBackground(clr);
                ta.setForeground(Color.BLACK);
                ta.setFont(new Font("Arial Unicode MS", Font.PLAIN, 24));

            }
        });
        t3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Color clr = new Color(50, 40, 50);
                ta.setBackground(clr);
                ta.setForeground(Color.WHITE);
                ta.setFont(new Font("Roboto", Font.PLAIN, 14));
            }
        });
        t4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Color clr = new Color(0, 0, 0);
                ta.setBackground(clr);
                ta.setForeground(Color.WHITE);
                ta.setFont(new Font("Roboto", Font.BOLD, 20));
            }
        });
        fs.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String size = JOptionPane.showInputDialog(null, "Enter Numeric Values Only!");
                Float fsize = Float.parseFloat(size);
                Font font = ta.getFont();
                float nsize = fsize;
                ta.setFont(font.deriveFont(nsize));
            }
        });
        aash.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Created by:Aman Gupta \n Email-Akum96392@gmail.com \n Thanks for using it :)");
            }
        });
        try {
            GraphicsEnvironment ge
                    = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("A.ttf")));
        } catch (IOException | FontFormatException e) {
            //Handle exception
        }
    }

    public static void main(String[] args) {
        Note m = new Note();
        m.setTitle("NotePad");
        m.setSize(300, 300);
        m.setResizable(true);
        m.setVisible(true);
        Dimension dim = m.getToolkit().getScreenSize();
        int screenWidth = dim.width;
        int screenHeight = dim.height;
        int frameWidth = screenWidth / 3;
        int frameHeight = screenHeight / 3;
        m.setLocation((screenWidth - frameWidth) / 2, (screenHeight - frameHeight) / 2);

    }

    private static void WPM() throws InterruptedException {
        JFrame f = new JFrame();
        f.setTitle("Typing Master");
        f.setBounds(550, 250, 700, 400);
        f.setBackground(Color.white);
        f.setLocationRelativeTo(null);
        f.setLayout(new FlowLayout(56));

        //f.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
        Font font = new Font("Roboto", Font.BOLD, 24);
//
        System.out.println("Welcome");
        TimeUnit.SECONDS.sleep(1);
        Random r = new Random();
//create button
        JButton b = new JButton();
        b.setText("Check Typing Speed.");
        b.setFont(font);
        b.setBackground(Color.CYAN);
        b.setForeground(Color.BLACK);

        //create textField
        double start = LocalTime.now().toNanoOfDay();
        TextArea t = new TextArea(8, 35);
        t.setBackground(Color.WHITE);
        t.requestFocusInWindow();

        t.setFont(font);
        JScrollPane s = new JScrollPane();
        s.add(t);
        f.add(t);

        //button action
        b.addActionListener(e -> {

            String text = t.getText();
            String words[] = text.split("\\s");
            int n = words.length;
            double end = LocalTime.now().toNanoOfDay();
            double elsetime = end - start;
            double sec = elsetime / 1000000000.0;
            int numc = text.length();
            String w = "Words";
            int wps = (int) (((double) (numc / 5) / sec) * 60);
            System.out.println("WPS");
            System.out.println(wps);
            System.out.println("text No.");
            System.out.println(n);
            JOptionPane.showConfirmDialog(null, wps);
            //  JOptionPane.showInternalConfirmDialog(null, wps, "speed", n);
            JOptionPane.showConfirmDialog(null, n);
        });
        f.add(b);
        f.setVisible(true);

    }

    //Encryption Operation 
//Encyption key are passed in this function.

    public static void operate(int key) {
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        File file = fc.getSelectedFile();
        //file input stream

        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] data = new byte[fis.available()];
            fis.read(data);
            int i = 0;
            for (byte b : data) {
                System.out.println(b);
                data[i] = (byte) (b ^ key);//xor b and key
                i++;
            }
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(data);
            fos.close();
            fis.close();
            JOptionPane.showMessageDialog(null, "Done");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void ImageOperation() {
        System.out.println("This is Testing:");
        JFrame f = new JFrame();
        f.setTitle("File Encryption");
        f.setBounds(550, 250, 700, 400);
        f.setBackground(Color.lightGray);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font = new Font("Roboto", Font.BOLD, 24);
        JButton b = new JButton();
        b.setText("Set Secuity");
        b.setFont(font);
        b.setBackground(Color.CYAN);
        b.setForeground(Color.BLACK);

        JTextField t = new JTextField(10);
        t.setFont(font);
        f.add(t);
        b.addActionListener(e -> {
            System.out.println("Remember Your Keys");
            String text = t.getText();
            int temp = Integer.parseInt(text);
            operate(temp);//key   });

        });
        f.setLayout(new FlowLayout());
        f.add(b);
        f.setVisible(true);
    }


}
