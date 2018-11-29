package com.soft3d.soft3d;

import java.awt.Canvas;
import javax.swing.JFrame;
import java.awt.Dimension;

public class Display extends Canvas {
  private final JFrame m_frame;

  public Display(int width, int height, String title) {
    Dimension size = new Dimension(width, height);
    setPreferredSize(size);
    setMinimumSize(size);
    setMaximumSize(size); // prevent accidental resize from code

    m_frame = new JFrame();
    m_frame.add(this);
    m_frame.pack();
    m_frame.setResizable(false);
    m_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    m_frame.setLocationRelativeTo(null);
    m_frame.setTitle(title);
    m_frame.setVisible(true);
  }
}