package Task7GUIOne;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditing extends JFrame implements DocumentListener {

    public static void main(String[] args) {
        JFrame Txt  = new TextEditing();
        Txt.setTitle("文本文档");
        Txt.setVisible(true);

    }

//    private static final long serialVersiongUID = 1l;

    JFrame TextEditing = new JFrame();

    JMenuBar menuBar = new JMenuBar();
    JMenu file = new JMenu("文件");
    JMenu edit = new JMenu("编辑");
    JMenu form = new JMenu("格式");
    JMenu view = new JMenu("查看");
    JMenu help = new JMenu("帮助");

    JTextArea textArea = new JTextArea();
    JScrollPane jScrollPane = new JScrollPane(textArea);

    String[] str1 = {"新建", "打开", "保存", "另存为", "页面设置", "打印", "退出"};
    String[] str2 = {"剪切", "复制", "粘贴", "查找", "替换"};
    String[] str3 = {"自动换行", "字体"};

    Font f1 = new Font("隶书", Font.PLAIN, 15);
    //Search
//    int flag = 0;
//    String source = "";

    public TextEditing() {

//       TextEditing.setTitle("文本文档");

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();

        setSize(screenSize.width / 2, screenSize.height / 2);
        setLocation(screenSize.width / 4, screenSize.height / 4);
        add(jScrollPane, BorderLayout.CENTER);
        setJMenuBar(menuBar);

        file.setFont(f1);
        edit.setFont(f1);
        form.setFont(f1);
        view.setFont(f1);
        help.setFont(f1);

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(form);
        menuBar.add(view);
        menuBar.add(help);

        textArea.getDocument().addDocumentListener(this);
        for (int i = 0; i < str1.length; i++) {
            JMenuItem item1 = new JMenuItem(str1[i]);
            item1.addActionListener(new myActionListener1());
            item1.setFont(f1);
            file.add(item1);

        }
        for (int i = 0; i < str2.length; i++) {
            JMenuItem item2 = new JMenuItem(str2[i]);
            item2.addActionListener(new myActionListener1());
            item2.setFont(f1);
            edit.add(item2);

        }
        for (int i = 0; i < str3.length; i++) {
            JMenuItem item3 = new JMenuItem(str3[i]);
            item3.addActionListener(new myActionListener1());
            item3.setFont(f1);
            form.add(item3);

        }




    }



    @Override

    public void insertUpdate(DocumentEvent e) {

    }

    @Override
    public void removeUpdate(DocumentEvent e) {

    }

    @Override
    public void changedUpdate(DocumentEvent e) {

    }

    private class myActionListener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
