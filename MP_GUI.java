import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

public class MPGUI1 extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MPGUI1 frame = new MPGUI1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Create FRame

	    MPGUI1() {
	        

	        try {
	            // Specify the path to your image file
	            String back_img = "C:\\Users\\gaura\\OneDrive\\Pictures\\Saved Pictures\\GUI_B.png";

	            // Load the background image
	            ImageIcon backgroundImage = new ImageIcon(back_img);
	            JLabel backgroundLabel = new JLabel(backgroundImage);
	            backgroundLabel.setBounds(0, 0, 400, 500);

	            // Create a JPanel for the heading and background color
	            JPanel headingPanel = new JPanel();
	            headingPanel.setBounds(450, 10, 200, 30);
	            headingPanel.setBackground(Color.BLUE); // Set the background color
	            headingPanel.setLayout(new BorderLayout());

	            // Create the JLabel for the heading
	            JLabel heading = new JLabel("Packet Sniffer");
	            heading.setHorizontalAlignment(SwingConstants.CENTER); // Center align the text
	            heading.setFont(new Font("Arial", Font.BOLD, 20)); 
	            heading.setForeground(Color.WHITE); // Set the text color

	            headingPanel.add(heading);

	            JButton b1 = new JButton("Know about tool");
	            b1.setBounds(300, 130, 500, 40);
	            b1.addActionListener(new ActionListener() {
	                public void actionPerformed(ActionEvent e) {
	                    JFrame frame1 = new JFrame();

	                    try {
	                    	
	                    	JButton r1=new JButton("View");
	                    	String[][] data = {{"101","Naruto","Leaf"},{"102","Gaara","Sand"},{"103","Sanji","All blue"},{"104","Zoro","Wano"}};
	                    	String[] column={"Number","Name","Origin"};
	                    	JTable t = new JTable(data,column);
	                    	
	                    	t.setRowHeight(100);
	                        t.setBounds(80,80,1000,1000);
	                        
	                        JScrollPane p = new JScrollPane(t);
	                        p.setBounds(80, 80, 1000, 400);
	                        
	                        // Specify the path to your image file
	                        String back_img = "C:\\Users\\gaura\\OneDrive\\Pictures\\Saved Pictures\\GUI_B.png";

	                        // Load the background image
	                        ImageIcon backgroundImage = new ImageIcon(back_img);
	                        JLabel backgroundLabel = new JLabel(backgroundImage);
	                        backgroundLabel.setBounds(0, 0, 400, 500);

	                        // Create a JPanel for the heading and background color
	                        JPanel headingPanel = new JPanel();
	                        headingPanel.setBounds(450, 10, 200, 30);
	                        headingPanel.setBackground(Color.BLUE); // Set the background color
	                        headingPanel.setLayout(new BorderLayout());

	                        // Create the JLabel for the heading
	                        JLabel heading = new JLabel("Lets Understand");
	                        heading.setHorizontalAlignment(SwingConstants.CENTER); // Center align the text
	                        heading.setFont(new Font("Arial", Font.BOLD, 20));
	                        heading.setForeground(Color.WHITE); // Set the text color

	                        headingPanel.add(heading);
	                        
	                        r1.setBounds(300,200,200,50);

	                        // Add components to the frame
	                        frame1.setContentPane(backgroundLabel);
	                        frame1.getContentPane().add(headingPanel); // Add the headingPanel instead of the heading JLabel
	                        frame1.getContentPane().add(p);
	                        frame1.setSize(1200, 950); // Increased frame size to accommodate the buttons
	                        frame1.setTitle("About this tool");
	                        frame1.getContentPane().setLayout(null);
	                        frame1.setVisible(true);
	                        frame1.getContentPane().add(r1);
	                    } catch (Exception ex) {
	                        ex.printStackTrace();
	                    }
	                } // Missing closing parenthesis here was the error
	            }); // Added missing closing parenthesis here

	            JButton b2 = new JButton("Capture Packet");
	            b2.setBounds(300, 230, 500, 40);
	            b2.addActionListener(new ActionListener() {
	                public void actionPerformed(ActionEvent e) {
	                    
	                	JFrame frame2 = new JFrame();

	                    try {


	                        
	                    	
	                        // Specify the path to your image file
	                        String back_img = "C:\\Users\\gaura\\OneDrive\\Pictures\\Saved Pictures\\GUI_B.png";

	                        // Load the background image
	                        ImageIcon backgroundImage = new ImageIcon(back_img);
	                        JLabel backgroundLabel = new JLabel(backgroundImage);
	                        backgroundLabel.setBounds(0, 0, 400, 500);

	                        // Create a JPanel for the heading and background color
	                        JPanel headingPanel = new JPanel();
	                        headingPanel.setBounds(450, 10, 200, 30);
	                        headingPanel.setBackground(Color.BLUE); // Set the background color
	                        headingPanel.setLayout(new BorderLayout());

	                        // Create the JLabel for the heading
	                        JLabel heading = new JLabel("Capture packet");
	                        heading.setHorizontalAlignment(SwingConstants.CENTER); // Center align the text
	                        heading.setFont(new Font("Arial", Font.BOLD, 20));
	                        heading.setForeground(Color.WHITE); // Set the text color

	                        headingPanel.add(heading);

	                        // Add components to the frame
	                        frame2.setContentPane(backgroundLabel);
	                        frame2.getContentPane().add(headingPanel); // Add the headingPanel instead of the heading JLabel
	                        frame2.setSize(1200, 950); // Increased frame size to accommodate the buttons
	                        frame2.setTitle("Capture Packet");
	                        
	                        frame2.getContentPane().setLayout(null);
	                        frame2.setVisible(true);
	                        

	                    } catch (Exception ex) {
	                        ex.printStackTrace();
	                    }
	                } // Missing closing parenthesis here was the error
	            });

	            JButton b3 = new JButton("More");
	            b3.setBounds(300, 330, 500, 40);
	            b3.addActionListener(new ActionListener() {
	                public void actionPerformed(ActionEvent e) {
	                    JFrame frame3 = new JFrame();

	                    try {
	                        // Specify the path to your image file
	                        String back_img = "C:\\Users\\gaura\\OneDrive\\Pictures\\Saved Pictures\\GUI_B.png";

	                        // Load the background image
	                        ImageIcon backgroundImage = new ImageIcon(back_img);
	                        JLabel backgroundLabel = new JLabel(backgroundImage);
	                        backgroundLabel.setBounds(0, 0, 400, 500);

	                        // Create a JPanel for the heading and background color
	                        JPanel headingPanel = new JPanel();
	                        headingPanel.setBounds(450, 10, 200, 30);
	                        headingPanel.setBackground(Color.BLUE); // Set the background color
	                        headingPanel.setLayout(new BorderLayout());

	                        // Create the JLabel for the heading
	                        JLabel heading = new JLabel("About");
	                        heading.setHorizontalAlignment(SwingConstants.CENTER); // Center align the text
	                        heading.setFont(new Font("Arial", Font.BOLD, 20));
	                        heading.setForeground(Color.WHITE); // Set the text color

	                        headingPanel.add(heading);

	                        // Add components to the frame
	                        frame3.setContentPane(backgroundLabel);
	                        frame3.getContentPane().add(headingPanel); // Add the headingPanel instead of the heading JLabel

	                        frame3.setSize(1200, 950); // Increased frame size to accommodate the buttons
	                        frame3.setTitle("More");
	                        frame3.getContentPane().setLayout(null);
	                        frame3.setVisible(true);
	                    } catch (Exception ex) {
	                        ex.printStackTrace();
	                    }
	                } // Missing closing parenthesis here was the error
	            });
	            // Add components to the frame
	            this.setContentPane(backgroundLabel);
	            this.getContentPane().add(headingPanel); // Add the headingPanel instead of the heading JLabel
	            this.getContentPane().add(b1);
	            this.getContentPane().add(b2);
	            this.getContentPane().add(b3);

	            this.setSize(1200, 950); // Increased frame size to accommodate the buttons
	            this.setTitle("Frame");
	            this.getContentPane().setLayout(null);
	            this.setVisible(true);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	    }
	    


	    }
	    
	

	
