import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MP_GUI {
    MP_GUI() {
        JFrame frame = new JFrame();

        try {
            // Specify the path to your image file
            String imagePath = "C:\\Users\\gaura\\OneDrive\\Pictures\\Saved Pictures\\GUI_B.png";

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
            JLabel heading = new JLabel("Packet Sniffer");
            heading.setHorizontalAlignment(SwingConstants.CENTER); // Center align the text
            heading.setFont(new Font("Arial", Font.BOLD, 20)); 
            heading.setForeground(Color.WHITE); // Set the text color

            headingPanel.add(heading);

            JButton b1 = new JButton("Know about tool");
            b1.setBounds(300, 150, 500, 40);
            b1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Open a new window
                    JFrame newFrame = new JFrame();
                    newFrame.setSize(400, 300);
                    newFrame.setTitle("About Packet Sniffer");
                    JLabel label = new JLabel("Information about the tool goes here.");
                    newFrame.add(label);
                    newFrame.setVisible(true);
                }
            });

            JButton b2 = new JButton("Start Packet Capturing");
            b2.setBounds(300, 230, 500, 40);

            JButton b3 = new JButton("Button 3");
            b3.setBounds(300, 310, 500, 40);

            // Add components to the frame
            frame.setContentPane(backgroundLabel);
            frame.add(headingPanel); // Add the headingPanel instead of the heading JLabel
            frame.add(b1);
            frame.add(b2);
            frame.add(b3);

            frame.setSize(800, 500); // Increased frame size to accommodate the buttons
            frame.setTitle("Frame");
            frame.setLayout(null);
            frame.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String args[]) {
        MP_GUI gui = new MP_GUI();
    }
}
