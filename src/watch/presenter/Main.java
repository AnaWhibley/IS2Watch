package watch.presenter;

import watch.model.Watch;
import watch.view.SwingWatchDisplay;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
    private SwingWatchDisplay display;

    public static void main(String[] args) {
        new MainFrame().execute();
    }

}

