import utils.TrayTool;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Main {

    public static void main(String[] args) {
        URL url = Main.class.getResource("Help.png");
        ImageIcon icon = new ImageIcon(url);
        Image image = icon.getImage();
        TrayTool trayTool = new TrayTool();
        TrayIcon trayIcon = new TrayIcon(image);
        System.out.println("Hello World!");
    }
}
