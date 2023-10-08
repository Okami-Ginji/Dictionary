/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.HashMap;
import view.Menu;
import repository.TranslateRepository;

/**
 *
 * @author Administrator
 */
public class TranslateProgram extends Menu<String> {
    
    static String[] mc = {"Add Word", "Delete Word","Translate","Exit"};
    TranslateRepository program;
    HashMap<String, String> hm;
    
    public TranslateProgram() {
        super("       Dictionary program", mc);
        program = new TranslateRepository();
        hm = new HashMap<>();
        program.readFile(hm);
    }


    @Override
    public void execute(int n) {
        switch(n) {
            case 1:
                program.addNewWord(hm);
                break;
            case 2:
                program.deleteWord(hm);
                break;
            case 3:
                program.translate(hm);
                break;
            case 4:
                System.exit(0);
        }
    }
    
}