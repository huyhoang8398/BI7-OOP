
/**
 * @author ${huyhoang8398}
 *
 * ${Ken illasviel}
 */
package oop;

import org.omg.PortableInterceptor.SUCCESSFUL;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class mainForm extends JFrame {
    public mainForm() {
        JPanel p = new JPanel(new BorderLayout());
        setTitle("Evalate Teaching Quality Application");
        //cant resize app
        setResizable(false);

        p.add(new topPanel(),BorderLayout.NORTH);
        p.add(new leftPanel(),BorderLayout.WEST);
        p.add(new rightPanel(),BorderLayout.EAST);
        //p.add(new b4bottom(),BorderLayout.SOUTH);
        p.add(new bottomPanel(),BorderLayout.SOUTH);
        //p.add(new dev1(),BorderLayout.AFTER_LAST_LINE);
        add(p);

        //Center app to center in Macbook
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        int height = screenSize.height;
        int width = screenSize.width;
        this.setSize((int) (width/1.2), height/2);

        // center the jframe on screen
        this.setLocationRelativeTo(null);

    }


    private String CourseName, LecName;
    private String ques1,ques2,ques3,ques4,ques5,ques6,ques7,value ;

    private JTextField toField;
    private JTextField lecField;

    private JButton send;
    private JButton open;
    private JPanel cardLayout;

    private JLabel courseName;
    private JLabel lecName;
    private JLabel helpLabel;
    private JLabel subLabel;
    private JLabel bug1;
    private JLabel Label2;
    private JLabel Label3;
    private JLabel Label4;
    private JLabel Label5;
    private JLabel Label6;
    private JLabel Label7;
    private JLabel Label8;

    private JLabel bLabel1;
    private JLabel bLabel2;
    private JLabel dev;

    private JComboBox comBox;


    private JRadioButton label1, label2, label3,label4,label5,label6,label7,
            label8,label9,label10,label11,label12,label13,label14,label15,
            label16,label17,label18,label19,label20,label21,label22,label23,
            label24,label25,label26,label27,label28,label29,label30,label31,label32,label33,label34,label35;



    class topPanel extends JPanel {
        public topPanel(){

            GridLayout layout = new GridLayout(4,2,5,5);
            setLayout(layout);

            courseName = new JLabel("  Course Name: ");
            add(courseName).setLocation(100,100);
            courseName.setFont(new Font("Serif", Font.BOLD,18));

            toField = new JTextField();
            toField.setPreferredSize(new Dimension(35,35));

            add(toField);

            lecName = new JLabel("  Lecturer Name: ");
            lecName.setFont(new Font("Serif", Font.BOLD,18));
            add(lecName);

            lecField = new JTextField();
            lecField.setPreferredSize(new Dimension(35,35));
            add(lecField);

            helpLabel = new JLabel("  Rate aspect of the training on 5 scales");
            helpLabel.setFont(new Font("Serif", Font.ITALIC,15));

            add(helpLabel);

            bug1 = new JLabel("                            ");
            add(bug1);

            subLabel = new JLabel("  1. Strongly disagree   2. Disagree   3.Neither agree or disagree   4. Agree   5. Strongly Agree");
            add(subLabel);

            JLabel tLabel4 = new JLabel("                   ");
            add(tLabel4);

        }

    }

    class leftPanel extends JPanel {
        public leftPanel(){
            GridLayout layout = new GridLayout(7,1,10,10);
            setLayout(layout);
            Label2 = new JLabel("  The organization of the lesson were logical and easy to follow ");
            Label2.setFont(new Font("Serif", Font.BOLD,15));
            add(Label2);

            Label3 = new JLabel("  The content of lecture met your expectations ");
            Label3.setFont(new Font("Serif", Font.BOLD,15));
            add(Label3);

            Label4 = new JLabel("  The exercises/assignments/labworks were useful ");
            Label4.setFont(new Font("Serif", Font.BOLD,15));
            add(Label4);

            Label5 = new JLabel("  The lecturer explained things clearly ");
            Label5.setFont(new Font("Serif", Font.BOLD,15));
            add(Label5);

            Label6 = new JLabel("  The lecturer answered student's questions clearly during classes ");
            Label6.setFont(new Font("Serif", Font.BOLD,15));
            add(Label6);

            Label7 = new JLabel("  The lecturer encouraged students participation during classes ");
            Label7.setFont(new Font("Serif", Font.BOLD,15));
            add(Label7);

            Label8 = new JLabel("  This class gave you opportunities to improve your teamworks skills ");
            Label8.setFont(new Font("Serif", Font.BOLD,15));
            add(Label8);

        }
    }

    class rightPanel extends JPanel{
        public rightPanel(){
            GridLayout layout = new GridLayout(7,1,100,5);
            setLayout(layout);
            //question 1 checkbox
            label1= new JRadioButton("1");
            add(label1);
            label2 = new JRadioButton("2");
            add(label2);
            label3 = new JRadioButton("3");
            add(label3);
            label4 = new JRadioButton("4");
            add(label4);
            label5 = new JRadioButton("5");
            add(label5);

            //question 2 checkbox
            label6= new JRadioButton("1");
            add(label6);
            label7= new JRadioButton("2");
            add(label7);
            label8= new JRadioButton("3");
            add(label8);
            label9= new JRadioButton("4");
            add(label9);
            label10= new JRadioButton("5");
            add(label10);
            //question 3 checkbox
            label11= new JRadioButton("1");
            add(label11);
            label12= new JRadioButton("2");
            add(label12);
            label13= new JRadioButton("3");
            add(label13);
            label14= new JRadioButton("4");
            add(label14);
            label15= new JRadioButton("5");
            //question 4 checkbox
            add(label15);
            label16= new JRadioButton("1");
            add(label16);
            label17= new JRadioButton("2");
            add(label17);
            label18= new JRadioButton("3");
            add(label18);
            label19= new JRadioButton("4");
            add(label19);
            label20= new JRadioButton("5");
            add(label20);
            //question 5 checkbox
            label23= new JRadioButton("1");
            add(label23);
            label21= new JRadioButton("2");
            add(label21);
            label22= new JRadioButton("3");
            add(label22);
            label24= new JRadioButton("4");
            add(label24);
            label25= new JRadioButton("5");
            add(label25);
            //question 6 checkbox
            label26= new JRadioButton("1");
            add(label26);
            label27= new JRadioButton("2");
            add(label27);
            label28= new JRadioButton("3");
            add(label28);
            label29= new JRadioButton("4");
            add(label29);
            label30= new JRadioButton("5");
            add(label30);
            //question 7 checkbox
            label31= new JRadioButton("1");
            add(label31);
            label32= new JRadioButton("2");
            add(label32);
            label33= new JRadioButton("3");
            add(label33);
            label34= new JRadioButton("4");
            add(label34);
            label35= new JRadioButton("5");
            add(label35);
        }

    }
    class b4bottom extends JPanel {
        public b4bottom(){
            cardLayout= new JPanel(new CardLayout());
            JButton L = new JButton("Very Low");
            cardLayout.add(L);
            JButton A = new JButton("Average");
            cardLayout.add(A);
            JButton H = new JButton("High");
            cardLayout.add(H);
        }
    }

    class dev1 extends JPanel{
        public dev1(){
            GridLayout layout = new GridLayout(1,1);
            setLayout(layout);
            dev = new JLabel("Created by HuyHoang8398");
            dev.setHorizontalAlignment(JLabel.CENTER);
            dev.setVerticalAlignment(JLabel.CENTER);
            add(dev);
        }
    }

    class bottomPanel extends JPanel implements ActionListener {
        public bottomPanel(){
            GridLayout layout = new GridLayout(4,2,2,2 );
            setLayout(layout);
            //scale
            JLabel bLabel4 = new JLabel("  Please rate the quality of the course *");
            bLabel4.setFont(new Font("Serif", Font.ITALIC,18));
            add(bLabel4);

            bLabel1 = new JLabel("                ");
            add(bLabel1);

            String[] qualityRate = { "Very Poor", "Poor", "Average", "Good", "Very Good" };

            comBox = new JComboBox(qualityRate);
            comBox.setPreferredSize(new Dimension(20,20));

            add(comBox);

            bLabel2 = new JLabel("                ");
            add(bLabel2);


            send = new JButton("Submit");
            send.setPreferredSize(new Dimension(45,45));
            add(send);
            send.setHorizontalTextPosition(SwingConstants.CENTER);
            send.addActionListener(this);

            open = new JButton("Open your text file");
            open.setPreferredSize(new Dimension(45,45));

            add(open);
            open.addActionListener(this);

        }
        //Write to text file
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==send){
                JOptionPane.showMessageDialog(null,"DONE" ,"Successful",JOptionPane.INFORMATION_MESSAGE);
                CourseName = ("");
                LecName = ("");
                CourseName = toField.getText();
                LecName = lecField.getText();
                ques1 = ("");
                ques1 = label1.getText();
                ques2 = ("");
                ques2 = label2.getText();
                ques3 = ("");
                ques3 = label3.getText();
                ques4 = ("");
                ques4 = label4.getText();
                ques5 = ("");
                ques5 = label5.getText();
                ques6 = ("");
                ques6 = label6.getText();
                ques7 = ("");
                ques7 = label7.getText();
                value = ("");
                value = comBox.getSelectedItem().toString();



                try{
                    BufferedWriter reader = new BufferedWriter(new FileWriter(new File("/Users/huyhoang8398/Desktop/EVTF.txt"),true));
                    if(ques1.equals("1"))
                        ques1 ="Strongly disagree";
                    if(ques1.equals("2"))
                        ques1 ="Disagree";
                    if(ques1.equals("3"))
                        ques1 ="Agree";
                    if(ques1.equals("4"))
                        ques1 ="Neither agree or disagree";
                    if (ques1.equals("5"))
                        ques1 ="Strongly Agree";

                    if(ques2.equals("1"))
                        ques2 ="Strongly disagree";
                    if(ques2.equals("2"))
                        ques2 ="Disagree";
                    if(ques2.equals("3"))
                        ques2 ="Agree";
                    if(ques2.equals("4"))
                        ques2 ="Neither agree or disagree";
                    if (ques2.equals("5"))
                        ques2 ="Strongly Agree";

                    if(ques3.equals("1"))
                        ques3 ="Strongly disagree";
                    if(ques3.equals("2"))
                        ques3 ="Disagree";
                    if(ques3.equals("3"))
                        ques3 ="Agree";
                    if(ques3.equals("4"))
                        ques3 ="Neither agree or disagree";
                    if (ques3.equals("5"))
                        ques3 ="Strongly Agree";

                    if(ques4.equals("1"))
                        ques4 ="Strongly disagree";
                    if(ques4.equals("2"))
                        ques4 ="Disagree";
                    if(ques4.equals("3"))
                        ques4 ="Agree";
                    if(ques4.equals("4"))
                        ques4 ="Neither agree or disagree";
                    if (ques4.equals("5"))
                        ques4 ="Strongly Agree";

                    if(ques5.equals("1"))
                        ques5 ="Strongly disagree";
                    if(ques5.equals("2"))
                        ques5 ="Disagree";
                    if(ques5.equals("3"))
                        ques5 ="Agree";
                    if(ques5.equals("4"))
                        ques5 ="Neither agree or disagree";
                    if (ques5.equals("5"))
                        ques5 ="Strongly Agree";

                    if(ques6.equals("1"))
                        ques6 ="Strongly disagree";
                    if(ques6.equals("2"))
                        ques6 ="Disagree";
                    if(ques6.equals("3"))
                        ques6 ="Agree";
                    if(ques6.equals("4"))
                        ques6 ="Neither agree or disagree";
                    if (ques6.equals("5"))
                        ques6 ="Strongly Agree";

                    if(ques7.equals("1"))
                        ques7 ="Strongly disagree";
                    if(ques7.equals("2"))
                        ques7 ="Disagree";
                    if(ques7.equals("3"))
                        ques7 ="Agree";
                    if(ques7.equals("4"))
                        ques7 ="Neither agree or disagree";
                    if (ques7.equals("5"))
                        ques7 ="Strongly Agree";

                    reader.write("----------------------");
                    reader.newLine();

                    reader.write("Course name:\t "+CourseName);
                    reader.newLine();
                    reader.write("Lecturer name:\t "+LecName);
                    reader.newLine();
                    reader.write("The organization of the lesson were logical and easy to follow:\t"+ques1);
                    reader.newLine();
                    reader.write("The content of lecture met your expectations:\t"+ques2);
                    reader.newLine();
                    reader.write("The exercises/assignments/labworks were useful:\t"+ques3);
                    reader.newLine();
                    reader.write("The lecturer explained things clearly:\t"+ques4);
                    reader.newLine();
                    reader.write("The lecturer answered student's questions clearly during classes:\t"+ques5);
                    reader.newLine();
                    reader.write("The lecturer encouraged students participation during classes:\t"+ques6);
                    reader.newLine();
                    reader.write("This class gave you opportunities to improve your teamworks skills:\t"+ques7);
                    reader.newLine();
                    reader.newLine();
                    reader.write("Summary: \t"+value);
                    reader.close();
                    System.out.println("done");


                }
                catch (IOException E){
                    System.out.println("Error is "+E);
                }

            }
            if (e.getSource() == open){
                JFileChooser chooser = new JFileChooser("/Users/huyhoang8398/Desktop/EVTF.txt");
                int c = chooser.showOpenDialog(null);
                if (c == JFileChooser.APPROVE_OPTION){
                    File file = chooser.getSelectedFile();
                    try {
                        Desktop.getDesktop().open(file);
                    }
                    catch (IOException EE){
                        System.out.println("Failed");
                    }
                }
            }

        }
    }
}
