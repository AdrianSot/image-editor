package main;
import convolution.*;
import filters.*;
import contour.*;
import histogram.*;
/*
Autor: Adrián Soto
Aplicador de transformaciones a una imagen
*/
public class Main {

    public static void main(String[] args)
    {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setTitle("Image Editor");
        mainFrame.setSize(405, 300);
        mainFrame.setVisible(true);
    }
}
