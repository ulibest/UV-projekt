/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Erazem
 */
public class Writter {
    protected String players = "C:\\Users\\Erazem\\Documents\\NetBeansProjects\\Casino\\src\\data\\players.txt";
    private String doc;
    
    public Writter(String type) {
        if (type.equals("players")) {
            this.doc = this.players;
        }
    }
    
    //adds text to the end of textfile
    public boolean addPlayer(String username, String password) {
        try {
            Reader r = new Reader("players");
            r.read();
            HashSet<String[]> players = r.getData();
            BufferedWriter bw = new BufferedWriter(new FileWriter(doc));
            for (String[] player : players) {
                bw.append(player[0] + "," + player[1]);
                bw.append("\n");
            }
            bw.append(username + "," + password);
            bw.close();
            return true;
        } catch (IOException ex) {
            return false;
        }
    }
}
