package com.pickme.test;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class budbud {

    private JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                budbud window = new budbud();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public budbud() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 1100, 558);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set an EmptyBorder to add a gap at the top
        JComponent contentPane = (JComponent) frame.getContentPane();
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 0));
        contentPane.setBorder(new EmptyBorder(90, 0, 0, 0));

        createPanelWithButton("RoundShape");
        createPanelWithButton("Triangle Shape");
        createPanelWithButton("HourGlass");
        createPanelWithButton("RectangleShape");
        createPanelWithButton("Inverted Triangle");
    }

    private void createPanelWithButton(String buttonText) {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(245, 600)); // Set width and height

        JButton button = new JButton(buttonText);
        button.setPreferredSize(new Dimension(245, 600)); // Adjust button size
        panel.add(button);

        frame.getContentPane().add(panel);
    }
}
