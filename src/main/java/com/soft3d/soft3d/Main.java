package com.soft3d.soft3d;

public class Main {
  public static void main(String[] args) {
    Display display = new Display(800, 600, "Software Renderer");

    while(true) {
      display.SwapBuffers();
    }
  }
}