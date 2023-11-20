package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.GrammarTrainer;
import Persistence.GrammarTrainerSave;
import Persistence.Save;
import View.*;

/**
 * Diese Klasse enthält die Logik für das Programm
 * @author Daniel Lisjak
 */
public class GrammarTrainerController implements ActionListener {
    private GrammarTrainer grammarTrainer;
    private GrammarTrainerPanel panel;
    private GrammarTrainerFrame frame;
    private Save save;

    public GrammarTrainerController() {
        this.panel = new GrammarTrainerPanel(this);
        this.frame = new GrammarTrainerFrame("Worttrainer",this.panel);
        this.save = new GrammarTrainerSave();
        this.grammarTrainer = save.load("GrammarTrainer.txt");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("end"))	{
            this.panel.inputEnable(false);
            this.panel.enableReset(false);
            this.panel.enableEnd(false);
            this.panel.endMessage();
            this.save.save("GrammarTrainer.txt",this.grammarTrainer);
        }

        // Dieser Teil trifft ein, wenn der zurücksetzen button gedrückt wird
        if(e.getActionCommand().equals("reset"))	{
            this.grammarTrainer.setRight(0);
            this.grammarTrainer.setWrong(0);
            this.panel.setRight("0");
            this.panel.setWrong("0");
            this.panel.setCounter("0");
        }
    }
}