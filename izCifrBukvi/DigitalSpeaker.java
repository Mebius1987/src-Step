package Step.izCifrBukvi;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import java.awt.Component;
import javax.swing.Box;

    public class DigitalSpeaker extends JFrame
    {
        private static final long serialVersionUID = 1L;
        private JPanel contentPane;
        private JButton btnConvert;
        private JFormattedTextField formattedTextField;
        private Component verticalStrut;

        /**
         * Launch the application.
         */
        public static void main(String[] args)
        {
            EventQueue.invokeLater(new Runnable()
            {
                public void run()
                {
                    try
                    {
                        DigitalSpeaker frame = new DigitalSpeaker();
                        frame.setVisible(true);
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                }
            });
        }

        /**
         * Create the frame.
         */
        public DigitalSpeaker()
        {
            setTitle("Digital converter");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(100, 100, 450, 300);
            contentPane = new JPanel();

            contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
            setContentPane(contentPane);
            contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

            final JTextField text = new JTextField();
            text.setEditable(false);
            Action action = new AbstractAction()
            {
                private static final long serialVersionUID = 1L;

                @Override
                public void actionPerformed(ActionEvent e)
                {
                    text.setText(formattedTextField.getText());

                }
            };

            MaskFormatter formatter = null;
            try {
                formatter = new MaskFormatter("*******");
                formatter.setValidCharacters("0123456789 ");
            }
            catch (java.text.ParseException exc) {
                System.err.println("formatter is bad: " + exc.getMessage());
            }

            contentPane.add(text);

            btnConvert = new JButton("Convert");
            btnConvert.addActionListener(action);
            formattedTextField = new JFormattedTextField(formatter);
            formattedTextField.addActionListener(action);
            contentPane.add(formattedTextField);

            verticalStrut = Box.createVerticalStrut(20);
            contentPane.add(verticalStrut);
            contentPane.add(btnConvert);
        }
    }


