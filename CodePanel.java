import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CodePanel extends JPanel implements ActionListener {

    static final int screen_width = 300;
    final static int screen_height = 400;
    JButton generate, clear;
    JLabel quote1, word, quote2;


    String[] text = { "Social Media Influence", "Favourite Subject" , "Favourite Book", "Pros and Cons of Online Learning",
            "I wish I were", "Human Rights", "Environment Conservation", "Women Should Rule The World!",
            "The Best Lesson I Have Learned", "Paperbacks vs E-books", "How to Tackle a Bad Habit",
            "My Favorite Pastime/Hobby", "Why Should Every Citizen Vote?", "Learning a New Language",
            "Books", "Fear of Missing Out (FOMO): Is it real or not?",  "Importance of Reading",
            "Importance of Books In Our Life", "My Favorite Fictional Character", "Introverts vs Extroverts",
            "Lessons to Learn From Sports", "Beauty Is In the Eye of the Beholder", "Benefits of Yoga", "If I had a Superpower"};


    CodePanel(){

        this.setPreferredSize(new Dimension(screen_width, screen_height));
        this.setLayout(null);
        this.setBackground(new Color(230, 242, 255));
        quote1 = new JLabel("Your Word Is..");
        quote1.setBounds(80,45,200,20);
        quote1.setFont(new Font("Arial", Font.PLAIN, 20));
        this.add(quote1);

        word = new JLabel();
        word.setBounds(10,100,280,20);
        word.setFont(new Font("Arial", Font.PLAIN, 20));
        word.setForeground(Color.red);
        this.add(word);

        quote2 = new JLabel("Speak on this for 2 Minutes");
        quote2.setBounds(30,175,250,20);
        quote2.setFont(new Font("Arial", Font.PLAIN, 20));
        this.add(quote2);

        generate = new JButton("Generate Word");
        generate.setBounds(45, 230, 200, 35);
        generate.setFont(new Font("Arial", Font.PLAIN, 20));
        this.add(generate);

        clear = new JButton("Clear");
        clear.setBounds(100, 320, 100, 35);
        clear.setFont(new Font("Arial", Font.PLAIN, 20));
        this.add(clear);

        generate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int temp = randomNumber();
                word.setText(getText(temp));
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                word.setText("");
            }
        });

    }
    public int randomNumber(){
        return (int)(Math.random()*(text.length - 1 +1));
    }
    public String getText(int num){
        return text[num];
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
