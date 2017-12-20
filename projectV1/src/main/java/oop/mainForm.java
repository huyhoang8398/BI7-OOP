package oop;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class mainForm extends JFrame {
    public mainForm() {
        JPanel p = new JPanel(new BorderLayout());
        setTitle("Evalate Teaching Application");
        p.add(new topPanel(),BorderLayout.NORTH);
        p.add(new leftPanel(),BorderLayout.WEST);
        p.add(new rightPanel(),BorderLayout.EAST);
        //p.add(new b4bottom(),BorderLayout.SOUTH);
        p.add(new bottomPanel(),BorderLayout.SOUTH);
        add(p);
    }
    private String CourseName, LecName;

    private JTextField toField;
    private JTextField lecField;

    private JButton send;
    private JPanel cardLayout;

    private JLabel courseName;
    private JLabel lecName;
    private JLabel helpLabel;
    private JLabel subLabel;
    private JLabel bug1;
    private JLabel Label1;
    private JLabel Label2;
    private JLabel Label3;
    private JLabel Label4;
    private JLabel Label5;
    private JLabel Label6;
    private JLabel Label7;
    private JLabel Label8;

    private JLabel bLabel1;

    private


    class topPanel extends JPanel {
        public topPanel(){
            GridLayout layout = new GridLayout(4,2,5,5);
            setLayout(layout);

            courseName = new JLabel("  Course Name: ");
            add(courseName).setLocation(100,100);

            toField = new JTextField();
            add(toField);

            lecName = new JLabel("  Lecturer Name: ");
            add(lecName);

            lecField = new JTextField();
            add(lecField);

            helpLabel = new JLabel("  Rate aspect of the training on 5 scales");
            add(helpLabel);

            bug1 = new JLabel("                            ");
            add(bug1);

            subLabel = new JLabel("  1. Strongly disagree   2. Disagree   3.Neither agree or disagree   4. Agree   5. Strongly Agree   ");
            add(subLabel);

            JLabel tLabel4 = new JLabel("                   ");
            add(tLabel4);

        }

    }

    class leftPanel extends JPanel {
        public leftPanel(){
            GridLayout layout = new GridLayout(7,1,5,5);
            setLayout(layout);
            Label2 = new JLabel("  The organization of the lesson were logical and easy to follow ");
            add(Label2);

            Label3 = new JLabel("  The content of lecture met your expectations ");
            add(Label3);

            Label4 = new JLabel("  The exercises/assignments/labworks were useful ");
            add(Label4);

            Label5 = new JLabel("  The lecturer explained things clearly ");
            add(Label5);

            Label6 = new JLabel("  The lecturer answered student's questions clearly during classes ");
            add(Label6);

            Label7 = new JLabel("  The lecturer encouraged students participation during classes ");
            add(Label7);

            Label8 = new JLabel("  This class gave you opportunities to improve your teamworks skills ");
            add(Label8);

        }
    }

    class rightPanel extends JPanel{
        public rightPanel(){
            GridLayout layout = new GridLayout(7,1,100,5);
            setLayout(layout);
            //question 1 checkbox
            JRadioButton label1= new JRadioButton("1");
            add(label1);
            JRadioButton label2 = new JRadioButton("2");
            add(label2);
            JRadioButton label3 = new JRadioButton("3");
            add(label3);
            JRadioButton label4 = new JRadioButton("4");
            add(label4);
            JRadioButton label5 = new JRadioButton("5");
            add(label5);

            //question 2 checkbox
            JRadioButton label6= new JRadioButton("1");
            add(label6);
            JRadioButton label7= new JRadioButton("2");
            add(label7);
            JRadioButton label8= new JRadioButton("3");
            add(label8);
            JRadioButton label9= new JRadioButton("4");
            add(label9);
            JRadioButton label10= new JRadioButton("5");
            add(label10);
            //question 3 checkbox
            JRadioButton label11= new JRadioButton("1");
            add(label11);
            JRadioButton label12= new JRadioButton("2");
            add(label12);
            JRadioButton label13= new JRadioButton("3");
            add(label13);
            JRadioButton label14= new JRadioButton("4");
            add(label14);
            JRadioButton label15= new JRadioButton("5");
            //question 4 checkbox
            add(label15);
            JRadioButton label16= new JRadioButton("1");
            add(label16);
            JRadioButton label17= new JRadioButton("2");
            add(label17);
            JRadioButton label18= new JRadioButton("3");
            add(label18);
            JRadioButton label19= new JRadioButton("4");
            add(label19);
            JRadioButton label20= new JRadioButton("5");
            add(label20);
            //question 5 checkbox
            JRadioButton label23= new JRadioButton("1");
            add(label23);
            JRadioButton label21= new JRadioButton("2");
            add(label21);
            JRadioButton label22= new JRadioButton("3");
            add(label22);
            JRadioButton label24= new JRadioButton("4");
            add(label24);
            JRadioButton label25= new JRadioButton("5");
            add(label25);
            //question 6 checkbox
            JRadioButton label26= new JRadioButton("1");
            add(label26);
            JRadioButton label27= new JRadioButton("2");
            add(label27);
            JRadioButton label28= new JRadioButton("3");
            add(label28);
            JRadioButton label29= new JRadioButton("4");
            add(label29);
            JRadioButton label30= new JRadioButton("5");
            add(label30);
            //question 7 checkbox
            JRadioButton label31= new JRadioButton("1");
            add(label31);
            JRadioButton label32= new JRadioButton("2");
            add(label32);
            JRadioButton label33= new JRadioButton("3");
            add(label33);
            JRadioButton label34= new JRadioButton("4");
            add(label34);
            JRadioButton label35= new JRadioButton("5");
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

    class bottomPanel extends JPanel implements ActionListener {
        public bottomPanel(){
            GridLayout layout = new GridLayout(4,1);
            setLayout(layout);
            //scale
            bLabel1 = new JLabel("                ");
            add(bLabel1);

            JLabel bLabel4 = new JLabel("  Please rate the quality of the course *");
            add(bLabel4);

            send = new JButton("SEND");
            add(send);

            send.setHorizontalTextPosition(SwingConstants.CENTER);
            send.addActionListener(this);

        }
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==send){
                CourseName = ("");
                LecName = ("");
                CourseName = toField.getText();
                LecName = lecField.getText();

                try{
                    BufferedWriter reader = new BufferedWriter(new FileWriter(new File("/Users/huyhoang8398/Desktop/EVTF.txt"),true));
                    reader.write("Course name "+CourseName);
                    reader.newLine();
                    reader.close();
                    System.out.println("done");



                }
                catch (IOException E){
                    System.out.println("Error is "+E);
                }

            }
        }
    }









}
