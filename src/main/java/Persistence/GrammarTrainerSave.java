package Persistence;

import Model.GrammarTrainer;
import Model.WordPair;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * In dieser Klasse wird speichern und laden aus einem File umgesetzt
 * @author Daniel Lisjak
 */
public class GrammarTrainerSave implements Save {

    /**
     * Diese Klasse speichert die Wortpaare aus einem Trainer in ein file.
     *
     * @param filename Der name des files
     * @param trainer  Der trainer, aus dem die Daten in das File gespeichert werden sollen
     */
    @Override
    public void save(String filename, GrammarTrainer trainer) {
        File f = new File(filename);
        PrintWriter out = null;

        try {
            out = new PrintWriter(f);
            for (int i = 0; i < trainer.getPairList().size(); i++) {
                WordPair current = trainer.getWordpair(i);
                out.println(current.getWord());
                out.println(current.getURL());
            }

            out.println(trainer.getRight());
            out.println(trainer.getWrong());
            out.println(trainer.getRight() + trainer.getWrong());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
    @Override
    public GrammarTrainer load(String filename) {
        return null;
    }
}