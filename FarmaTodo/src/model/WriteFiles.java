package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

import javax.swing.JOptionPane;

public class WriteFiles {
    public static void SaveFiles(String pathFile,List<Druggist>changesListDruggist){
        try(BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter(pathFile))) {
            for (Druggist druggist : changesListDruggist) {
                String valores= druggist.getName()+","+druggist.getDoc_type()+","+druggist.getDoc_num()+","+druggist.getDruggist_user()+","+druggist.getDruggist_password();
                bufferedWriter.write(valores);
                bufferedWriter.newLine();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, pathFile, 0);
        }

    }
}
