/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.HashMap;
import dataacess.TranslateDAO;
/**
 *
 * @author Administrator
 */
public class TranslateRepository implements ITranslateRepository{

    @Override
    public void addNewWord(HashMap<String, String> hm) {
        TranslateDAO.Instance().addNewWord(hm);
    }

    @Override
    public void deleteWord(HashMap<String, String> hm) {
        TranslateDAO.Instance().deleteWord(hm);
    }

    @Override
    public void translate(HashMap<String, String> hm) {
        TranslateDAO.Instance().translate(hm);
    }

    @Override
    public void readFile(HashMap<String, String> hm) {
        TranslateDAO.Instance().readFile(hm);
    }
    
}
