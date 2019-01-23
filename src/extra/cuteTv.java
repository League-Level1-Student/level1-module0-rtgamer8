package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cuteTv implements ActionListener {
	JButton duckButton = new JButton("duck");
	JButton frogButton = new JButton("frog");
	JButton unicornButton = new JButton("unicorn");
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();

public static void main(String[] args) {


 new cuteTv().createUI();


	
	
	
}




void showDucks() {
    playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
    playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
    playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}

void playVideo(String videoID) {
    try {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    } catch (Exception e) {
         e.printStackTrace();
    }
    
}

void createUI() {
	frame.add(panel);
duckButton.addActionListener(this);
frogButton.addActionListener(this);
unicornButton.addActionListener(this);

panel.add(duckButton);
panel.add(frogButton);
panel.add(unicornButton);

frame.setVisible(true);
frame.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if(e.getSource()== duckButton) {
		showDucks();
	}
	if(e.getSource()== frogButton) {
		showFrog();
	}
	if(e.getSource()== unicornButton) {
		showFluffyUnicorns();
	}
	
	
}



}