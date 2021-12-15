package com.daniilamark.university.lab_6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class GUISub {
    private SubscriptionService service = new SubscriptionService();

    JFrame mainFrame = new JFrame("program"); // создание окна

    JLabel labelTitle = new JLabel("Ищу подписки по названию"); // создание текстовой метки labelTitle с содержанием "Давайте сыграем в игру!"
    JLabel labelResult = new JLabel(""); // создание текстовой метки labelTitle с содержанием "";
    JLabel labelName = new JLabel("Введите название подписки: "); // создание текстовой метки labelTitle с содержанием "Введите цвет: "

    JTextField jTFName = new JTextField("",20); // создание поля ввода цвета

    JButton btnStart = new JButton("Найти"); // создание кнопки "найти"

    Font font = new Font("Verdana", Font.PLAIN, 12); // добавление шрифта "Verdana"

    // главный метод
    public static void main(String[] args) {
        GUISub myGui = new GUISub(); // создание объекта класса
        myGui.init(); // вызов метода init
    }

    // конструктор класса
    GUISub(){
        mainFrame.setLayout(null); // установка менеджера компоновки
        mainFrame.setResizable(false); //метод отключения расширения окна
        mainFrame.setLocation(440,180); // установка координат фрейма
        mainFrame.setVisible(true); // сделать фрейм видимым
        mainFrame.setSize(500,500); // установка размеров фрейма
        // обработка нажатия на крестик -- завершение программы
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
    }

    // метод init для создания компонентов нашей программы
    public void init(){
        labelName.setFont(font);
        labelResult.setFont(font);
        btnStart.setFont(font);
        labelTitle.setBounds(150,5,465,30); // установка размеров и координат текстовой метки labelTitle
        labelTitle.setForeground(Color.blue); // изменение цвета текстовой метки labelTitle
        mainFrame.add(labelTitle); // добавление текстовой метки на фрейм
        labelName.setBounds(10,40,465,30); // установка размеров и координат текстовой метки labelColor
        mainFrame.add(labelName); // добавление текстовой метки на фрейм
        jTFName.setBounds(10,70,465,30); // установка размеров и координат поля ввода jTFColor
        mainFrame.add(jTFName); // добавление поля ввода на фрейм
        btnStart.setBounds(10,120,465,30); // установка размеров и координат кнопки "Играть!"
        mainFrame.add(btnStart); // добавление кнопки " на фрейм
        labelResult.setBounds(10,180,465,30); // установка размеров и координат текстовой метки labelResult
        mainFrame.add(labelResult); // добавление текстовой метки на фрейм/**/
        btnStart.addActionListener(new ButtonClickListener()); // добавление слушателя на кнопку
    }

    // обработка нажатий на кнопку
    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if(command.equals("Найти"))  {
                String result = service.searchByName(jTFName.getText());

                labelResult.setText(result);
                //service.searchByName(jTFName.getText());
                System.out.println(service.countSubscriptions);
                //labelResult.setText(String.valueOf(service.allCountSubscriptions));
            }
        }
    }
}

