import javax.swing.SwingUtilities;
//AHOY
//Este es el main del proyecto.

import UI.FarmaTodoGUI;
import UI.FarmaceuticosMenu;
import UI.LoginGUI;
import model.Druggist;
import model.FilesLoader;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //Comentario por julian
        //Comentario por Axel
        List<Druggist> druggList=FilesLoader.LoadDruggists("druggistList.txt");
         SwingUtilities.invokeLater(()->{
             LoginGUI.startLogin();
             //COMENTARIO POR FELP
        });
}}