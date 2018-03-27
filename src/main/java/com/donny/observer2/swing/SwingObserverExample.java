package com.donny.observer2.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * 简单的Swing应用：建立一个JFrame，然后放上一个按钮
 */


public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go(){
        frame = new JFrame();

        JButton button = new JButton("Should I do it?");

        //制造出两个观察者
        button.addActionListener(new AngelListener());//天使
        button.addActionListener(new DevilListener());//恶魔

        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());

        frame.getContentPane().add(BorderLayout.CENTER, button);
    }

    class AngelListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don not do it, you might regret it!");
        }
    }

    class DevilListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //当主题（JButton）的状态改变时，在本例中，不是调用update()，而是调用actionPerformed()
            System.out.println("Come on, do it!");
        }
    }
}
