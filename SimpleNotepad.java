import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class SimpleNotepad extends JFrame implements ActionListener {

    JTextArea textArea;
    JMenuItem open, save, exit;

    // Constructor
    SimpleNotepad() {
        setTitle("Simple Notepad");

        // Text Area
        textArea = new JTextArea();
        add(new JScrollPane(textArea));

        // Menu Bar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        exit = new JMenuItem("Exit");

        fileMenu.add(open);
        fileMenu.add(save);
        fileMenu.add(exit);
        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        // Action Listeners
        open.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);

        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Action Handling
    public void actionPerformed(ActionEvent e) {

        // Open File
        if (e.getSource() == open) {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showOpenDialog(this);

            if (option == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();

                try {
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    textArea.read(br, null);
                    br.close();
                } catch (Exception ex) {
                    System.out.println("Error opening file");
                }
            }
        }

        // Save File
        if (e.getSource() == save) {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showSaveDialog(this);

            if (option == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();

                try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                    textArea.write(bw);
                    bw.close();
                } catch (Exception ex) {
                    System.out.println("Error saving file");
                }
            }
        }

        // Exit
        if (e.getSource() == exit) {
            System.exit(0);
        }
    }

    // Main Method
    public static void main(String[] args) {
        new SimpleNotepad();
    }
}
