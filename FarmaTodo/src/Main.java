import javax.swing.SwingUtilities;

import UI.FarmaTodoGUI;
import UI.FarmaceuticosMenu;
import UI.LoginGUI;
import model.Druggist;
import Loaders.FilesLoader;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //Comentario por julian
        List<Druggist> druggList=FilesLoader.LoadDruggists("src/Loaders/druggistList.txt");
         SwingUtilities.invokeLater(()->{
             LoginGUI.startLogin();
        });
        
}}