

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
import java.awt.Dimension;
import java.awt.Toolkit;

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
	            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	            backgroundLabel.setBounds(0, 0, (int) screenSize.getWidth(), (int) screenSize.getHeight());
	            backgroundLabel.setBounds(0, 0, 1200, 950);

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
	                        JButton r1 = new JButton("View");
	                        JButton r2 = new JButton("View");
	                        JButton r3 = new JButton("View");
	                        JButton r4 = new JButton("View");
	                        
	                        r1.addActionListener(new ActionListener() {
	                            public void actionPerformed(ActionEvent e) {
	                            	JFrame frame1 = new JFrame();

	                                try {
	                                    // Specify the path to your image file
	                                    String imagePath = "C:\\Users\\gaura\\OneDrive\\Pictures\\Saved Pictures\\sd.png";

	                                    // Load the background image
	                                    ImageIcon backgroundImage = new ImageIcon(imagePath);
	                                    JLabel backgroundLabel = new JLabel(backgroundImage);
	                                    backgroundLabel.setBounds(0, 0, 800, 500);

	                                    // Create a JPanel for the heading and background color
	                                    JPanel headingPanel = new JPanel();
	                                    headingPanel.setBounds(350, 10, 500, 30);
	                                    headingPanel.setBackground(Color.BLUE); // Set the background color
	                                    headingPanel.setLayout(new BorderLayout());

	                                    // Create the JLabel for the heading
	                                    JLabel heading = new JLabel("Source and Destination");
	                                    heading.setHorizontalAlignment(SwingConstants.CENTER); // Center align the text
	                                    heading.setFont(new Font("Arial", Font.BOLD, 20)); 
	                                    heading.setForeground(Color.WHITE); // Set the text color

	                                    headingPanel.add(heading);


	                                    // Add components to the frame
	                                    frame1.setContentPane(backgroundLabel);
	                                    frame1.add(headingPanel); // Add the headingPanel instead of the heading JLabel


	                                    frame1.setSize(1100, 950); // Increased frame size to accommodate the buttons
	                                    frame1.setTitle("About this tool");
	                                    frame1.setLayout(null);
	                                    frame1.setVisible(true);
	                                } catch (Exception ex) {
	                                    ex.printStackTrace();
	                                }
	                            }
	                        });

	                        
	                        r2.addActionListener(new ActionListener() {
	                            public void actionPerformed(ActionEvent e) {
	                            	JFrame frame1 = new JFrame();

	                                try {
	                                    // Specify the path to your image file
	                                    String imagePath = "C:\\Users\\gaura\\OneDrive\\Pictures\\Saved Pictures\\size.png";

	                                    // Load the background image
	                                    ImageIcon backgroundImage = new ImageIcon(imagePath);
	                                    JLabel backgroundLabel = new JLabel(backgroundImage);
	                                    backgroundLabel.setBounds(0, 0, 400, 500);

	                                    // Create a JPanel for the heading and background color
	                                    JPanel headingPanel = new JPanel();
	                                    headingPanel.setBounds(450, 10, 200, 30);
	                                    headingPanel.setBackground(Color.BLUE); // Set the background color
	                                    headingPanel.setLayout(new BorderLayout());

	                                    // Create the JLabel for the heading
	                                    JLabel heading = new JLabel("Packet Size");
	                                    heading.setHorizontalAlignment(SwingConstants.CENTER); // Center align the text
	                                    heading.setFont(new Font("Arial", Font.BOLD, 20)); 
	                                    heading.setForeground(Color.WHITE); // Set the text color

	                                    headingPanel.add(heading);


	                                    // Add components to the frame
	                                    frame1.setContentPane(backgroundLabel);
	                                    frame1.add(headingPanel); // Add the headingPanel instead of the heading JLabel


	                                    frame1.setSize(1100, 950); // Increased frame size to accommodate the buttons
	                                    frame1.setTitle("About this tool");
	                                    frame1.setLayout(null);
	                                    frame1.setVisible(true);
	                                } catch (Exception ex) {
	                                    ex.printStackTrace();
	                                }
	                            }
	                        });

	                        
	                        
	                        r3.addActionListener(new ActionListener() {
	                            public void actionPerformed(ActionEvent e) {
	                            	JFrame frame1 = new JFrame();

	                                try {
	                                    // Specify the path to your image file
	                                    String imagePath = "C:\\Users\\gaura\\OneDrive\\Pictures\\Saved Pictures\\dat.png";

	                                    // Load the background image
	                                    ImageIcon backgroundImage = new ImageIcon(imagePath);
	                                    JLabel backgroundLabel = new JLabel(backgroundImage);
	                                    backgroundLabel.setBounds(0, 0, 400, 500);

	                                    // Create a JPanel for the heading and background color
	                                    JPanel headingPanel = new JPanel();
	                                    headingPanel.setBounds(450, 10, 200, 30);
	                                    headingPanel.setBackground(Color.BLUE); // Set the background color
	                                    headingPanel.setLayout(new BorderLayout());

	                                    // Create the JLabel for the heading
	                                    JLabel heading = new JLabel("Transferred Data");
	                                    heading.setHorizontalAlignment(SwingConstants.CENTER); // Center align the text
	                                    heading.setFont(new Font("Arial", Font.BOLD, 20)); 
	                                    heading.setForeground(Color.WHITE); // Set the text color

	                                    headingPanel.add(heading);


	                                    // Add components to the frame
	                                    frame1.setContentPane(backgroundLabel);
	                                    frame1.add(headingPanel); // Add the headingPanel instead of the heading JLabel


	                                    frame1.setSize(1100, 950); // Increased frame size to accommodate the buttons
	                                    frame1.setTitle("About this tool");
	                                    frame1.setLayout(null);
	                                    frame1.setVisible(true);
	                                } catch (Exception ex) {
	                                    ex.printStackTrace();
	                                }
	                            }
	                        });

	                        
	                        
	                        r4.addActionListener(new ActionListener() {
	                            public void actionPerformed(ActionEvent e) {
	                            	JFrame frame1 = new JFrame();

	                                try {
	                                    // Specify the path to your image file
	                                    String imagePath = "C:\\Users\\gaura\\OneDrive\\Pictures\\Saved Pictures\\prot.png";

	                                    // Load the background image
	                                    ImageIcon backgroundImage = new ImageIcon(imagePath);
	                                    JLabel backgroundLabel = new JLabel(backgroundImage);
	                                    backgroundLabel.setBounds(0, 0, 400, 500);

	                                    // Create a JPanel for the heading and background color
	                                    JPanel headingPanel = new JPanel();
	                                    headingPanel.setBounds(450, 10, 200, 30);
	                                    headingPanel.setBackground(Color.BLUE); // Set the background color
	                                    headingPanel.setLayout(new BorderLayout());

	                                    // Create the JLabel for the heading
	                                    JLabel heading = new JLabel("Protocol");
	                                    heading.setHorizontalAlignment(SwingConstants.CENTER); // Center align the text
	                                    heading.setFont(new Font("Arial", Font.BOLD, 20)); 
	                                    heading.setForeground(Color.WHITE); // Set the text color

	                                    headingPanel.add(heading);


	                                    // Add components to the frame
	                                    frame1.setContentPane(backgroundLabel);
	                                    frame1.add(headingPanel); // Add the headingPanel instead of the heading JLabel


	                                    frame1.setSize(1100, 950); // Increased frame size to accommodate the buttons
	                                    frame1.setTitle("About this tool");
	                                    frame1.setLayout(null);
	                                    frame1.setVisible(true);
	                                } catch (Exception ex) {
	                                    ex.printStackTrace();
	                                }
	                            }
	                        });

	                        String[][] data = {
	                                {"Source and Destination", "Source and Destination of sender and receiver", " "},
	                                {"Size", "It indicates the size of the packet transferred", " "},
	                                {"Data", "It shows the encrypted data", " "},
	                                {"Type", "It shows the protocol used", " "}
	                        };

	                        String[] column = {"Keyword", "Description"};
	                        JTable t = new JTable(data, column);

	                        t.setRowHeight(100);
	                        t.getColumnModel().getColumn(0).setPreferredWidth(200);
	                        JScrollPane p = new JScrollPane(t);
	                        p.setBounds(50, 70, 700, 450);

	                        // Set preferred width for the first column
	                        

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

	                        // Add components to the frame
	                        frame1.setContentPane(backgroundLabel);
	                        frame1.getContentPane().add(headingPanel); // Add the headingPanel instead of the heading JLabel
	                        frame1.getContentPane().add(p);
	                        frame1.setSize(1200, 950); // Increased frame size to accommodate the buttons
	                        frame1.setTitle("About this tool");
	                        frame1.getContentPane().setLayout(null);

	                        frame1.getContentPane().add(r1);
	                        frame1.getContentPane().add(r2);
	                        frame1.getContentPane().add(r3);
	                        frame1.getContentPane().add(r4);

	                        r1.setBounds(800, 120, 200, 50);
	                        r2.setBounds(800, 220, 200, 50);
	                        r3.setBounds(800, 320, 200, 50);
	                        r4.setBounds(800, 420, 200, 50);

	                        frame1.setVisible(true);
	                    } catch (Exception ex) {
	                        ex.printStackTrace();
	                    }
	                }
	            });

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
	                        
	                        JPanel headingPanel2 = new JPanel();
	                        headingPanel2.setBounds(50, 220, 1000, 30);
	                        headingPanel2.setBackground(Color.BLUE); // Set the background color
	                        headingPanel2.setLayout(new BorderLayout());


	                        JButton res1 = new JButton("Start Capturing");
	                        // Create the JLabel for the heading
	                        JLabel heading = new JLabel("Capture packet");
	                        heading.setHorizontalAlignment(SwingConstants.CENTER); // Center align the text
	                        heading.setFont(new Font("Arial", Font.BOLD, 20));
	                        heading.setForeground(Color.WHITE); // Set the text color
	                        
	                        JLabel heading2 = new JLabel("Click to start capturing packets");
	                        heading2.setHorizontalAlignment(SwingConstants.CENTER); // Center align the text
	                        heading2.setFont(new Font("Arial", Font.BOLD, 20));
	                        heading2.setForeground(Color.WHITE); // Set the text color

	                        headingPanel.add(heading);
	                        headingPanel2.add(heading2);
	                        // Add components to the frame
	                        frame2.setContentPane(backgroundLabel);
	                        frame2.getContentPane().add(headingPanel);
	                        frame2.getContentPane().add(headingPanel2);// Add the headingPanel instead of the heading JLabel
	                        frame2.setSize(1200, 950); // Increased frame size to accommodate the buttons
	                        frame2.setTitle("Capture Packet");
	                        frame2.getContentPane().add(res1);
	                        res1.setBounds(450, 320, 200, 50);
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
	    
	

	
