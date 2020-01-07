package watch.presenter;

import watch.model.Watch;
import watch.view.SwingWatchDisplay;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class MainFrame extends JFrame {

    private SwingWatchDisplay display;

    public MainFrame () {
        setTitle("IS2 - Watch");
        setSize(500,500);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(display());
    }

    public void execute() {
        new WatchPresenter(new Watch(), display);
        setVisible(true);
    }

    private JPanel display() {
        display = new SwingWatchDisplay();
        return display;
    }

}
