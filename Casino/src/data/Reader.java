/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Erazem
 */
public class Reader {
    protected String players = "C:\\Users\\Erazem\\Documents\\NetBeansProjects\\Casino\\src\\data\\players.txt";
    private String doc;
    protected HashSet<String[]> data = new HashSet();

    public Reader(String type) {
        if (type.equals("players")) {
            this.doc = this.players;
        }
    }
    
    public HashSet<String[]> getData() {
        return data;
    }
    
    //reads document
    //returns true if document was read and false if not
    public boolean read(){
        try {
            Scanner sc = new Scanner(new File(this.doc));
            while (sc.hasNextLine()) {
                data.add(sc.nextLine().split(","));
            }
            sc.close();
            return true;
        } catch (FileNotFoundException ex) {
            return false;
        }
    }
}
