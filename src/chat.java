import javax.swing.*;

import java.awt.*;


public class chat  {
    JFrame frame = new JFrame();

    JTextArea textArea = new JTextArea();
    JTextField field = new JTextField();ImageIcon water = new ImageIcon("C:\\Users\\ccvn5\\IdeaProjects\\CHATBOT\\send.png");
    JButton button = new JButton(water);
Image icon=Toolkit.getDefaultToolkit().getImage("C:\\Users\\ccvn5\\IdeaProjects\\CHATBOT\\chatbot.png");

    chat() {
        frame.add(textArea);
        frame.setIconImage(icon);
        frame.setBackground(Color.gray);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(600, 800);
        frame.setResizable(false);
        frame.setTitle("ChatBot");
        frame.add(field); frame.add(button);

        button.setFocusable(false);
        textArea.setBackground(new Color(0,128,128));
        textArea.setSize(600, 709);
        textArea.setLocation(2, 2);
        textArea.setFont(new Font("Arial", Font.BOLD, 16));
        textArea.setForeground(new Color(255,255,255));
        textArea.setText("مرحبا بك أختار اللغة1-اللغة العربية2-اللغة الأنجلزية");
        textArea.setText("Hello there! Please choose your desired language: 1)اللغة العربية or 2) English.");
        
        field.setBackground(new Color(51,51,153));
        field.setSize(535, 68);
        field.setLocation(2, 710);
        field.setForeground(new Color(255,255,255));
        button.setBounds(536,710,50,52);










       button.addActionListener(e -> {
          if (e.getSource()==button) {
              String b = field.getText();
              String x=field.getText();
              textArea.append("" + "\nYOU:" + b + "\n");
              field.setText("");

          if (b.contains("1")) {
           bot("مرحبا بك كيف يمكن المساعدة اليوم");
       } else
            if (b.contains("ماهي عاصمة السعودية")) {
                bot("الرياض");
                     }
            else if (b.contains("كم مساحة السعودية")) {
                bot("2,150,000 كم²");
                  }
          else if (b.contains("مناطق تستحق الزيارة في السعودية")) {
                bot("""
                        أفضل المناطق السياحية في السعودية
                        1- قرية رجال ألمع التراثية
                        2- منطقة جدة القديمة
                        3- متحف الطيبات الدولي في جدة
                        4- مسجد الرحمة (مسجد جدة العائم)
                        5- مسجد قباء
                        6- جبل أحد
                        7- قرية العلا التراثية
                        8- صخرة الفيل""");
            }
         else   if (b.contains("كيف أستطيع اخرج فيزا السعودية")) {
                bot("عن طريق زيارة الموقع التالي " +"\n"+
                        "https://www.my.gov.sa/wps/portal/snp/aboutksa/tourism");

                 }
         else   if (b.contains("ما أسمك")) {
                bot("سعودي");
                  }
           else if (b.contains("كم عمرك")) {
                bot("انا مجرد مساعد لك ليس لدي عمر");

                      }
         else   if (b.contains("احبك")) {
               bot("وانا ايضا");

           }




             if (x.startsWith("2")){
                        bot1("Hi there! \nI'm wondering how I can assist you today. \nIs there anything specific you need help with \nor any questions I can answer for you?");
                    }
                    else if (x.contains("Saudi Arabia Vision 2030")){
                         bot1("Visit the website vision 2030 to read more\nhttps://www.vision2030.gov.sa/");


                     }
                    else if (x.contains("Visa saudi")){
                         bot1("You can obtain a visa through this website.\nhttps://visa.visitsaudi.com/");

                     }else bot1("I apologize, but I am having difficulty comprehending your message.\nانا أسف لكن لم أستطيع فهمك هل يمكن التوضيح اكثر");





              }







       }
    );
}



    private void bot(String string) {
        textArea.append("helper:" + string + "\n");
                  }
private void bot1(String st){
        textArea.append("helper:" + st + "\n");
}

}