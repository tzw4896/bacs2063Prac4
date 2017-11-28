package client;

import java.awt.Font;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import adt.ListInterface;
import adt.ExpandableArrayList;
import entity.Runner;

public class MarathonRegistration extends JFrame {

  private JLabel jlblInstruction = new JLabel("MARATHON REGISTRATION");
  private JLabel jlblName = new JLabel("Name: ");
  private JTextField jtfName = new JTextField(12);
  private JLabel jlblNumber = new JLabel("Next number: ");
  private JTextField jtfNumber = new JTextField();
  private JTextArea jtaResult = new JTextArea(5, 20);

  private ListInterface<Runner> runnerList = new ExpandableArrayList<>();

  public MarathonRegistration() {
    setTitle("Marathon Registration");
    Font fontInstruction = new Font("Arial", Font.BOLD, 36);
    Font font = new Font("Arial", Font.BOLD, 18);
    jlblInstruction.setFont(fontInstruction);
    jlblInstruction.setHorizontalAlignment(SwingConstants.CENTER);
    jlblName.setFont(font);
    jtfName.setFont(font);
    jlblNumber.setFont(font);
    jtfNumber.setFont(font);
    
    JPanel jpInput = new JPanel(new GridLayout(3, 2));
    jpInput.add(jlblNumber);
    jpInput.add(jtfNumber);
    jtfNumber.setText("" + Runner.getNextNumber());
    jtfNumber.setEditable(false);
    jpInput.add(jlblName);
    jpInput.add(jtfName);
    add(jpInput, BorderLayout.WEST);
    
    add(jlblInstruction, BorderLayout.NORTH);

    ImageIcon runnerIcon = new ImageIcon(getClass().getResource("image/runner.jpg"));
    add(new JLabel(runnerIcon));

    InputListener listener = new InputListener();
    jtfName.addActionListener(listener);

    jtaResult.setLineWrap(true);
    jtaResult.setWrapStyleWord(true);
    jtaResult.setEditable(false);
    jtaResult.setFont(font);
    JScrollPane scrollPane = new JScrollPane(jtaResult);
    add(scrollPane, BorderLayout.EAST);
    jtfName.grabFocus();
  }
  
  private class InputListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      String name = jtfName.getText();
      Runner runner = new Runner(name);
      runnerList.add(runner);
      jtfNumber.setText("" + Runner.getNextNumber());
      jtaResult.setText("Runner List: \n" + runnerList);
      jtfName.setText("");
      jtfName.grabFocus();
    }
  }

  public static void main(String[] args) {
    MarathonRegistration frame = new MarathonRegistration();
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
