package utils;

import javax.swing.*;
import java.awt.*;

/**
 * Created by SN on 2017/10/7.
 */
public class TrayTool {

    public void addTray(TrayIcon trayIcon) {
        try {
            SystemTray systemTray = SystemTray.getSystemTray();
            systemTray.add(trayIcon);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void CreateJFrame(String title) { // 定义一个CreateJFrame()方法
        JFrame jf = new JFrame(title); // 实例化一个JFrame对象
        Container container = jf.getContentPane(); // 获取一个容器
        JButton start_btn = new JButton("Start", null);
        JButton stop_btn = new JButton("Stop", null);


        container.add(start_btn);
        container.add(stop_btn);
        container.setBackground(Color.white);//设置容器的背景颜色
        jf.setVisible(true); // 使窗体可视
        jf.setSize(400, 50); // 设置窗体大小
        // 设置窗体关闭方式
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
