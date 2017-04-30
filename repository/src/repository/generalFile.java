/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Administrator
 */
public class generalFile {
    public String author;
    public String data;
    public String fileName;
    public String Path;
    public String Estensione;
    
    public generalFile(String author, String data, String fileName, String estensione) throws IOException{
        this.author=author;
        this.data=data;
        this.fileName=fileName;
        this.Estensione=estensione;
        this.Path="F:/3^IC/INFORMATICA/JAVA/repository/src/contenitore/"+fileName+""+Estensione;
        File file=new File(Path);
        if(file.exists()){
                System.out.println("questo file esiste già");
       }  else if(file.createNewFile()){
                    System.out.println("il file è stato creato");
                }
        PrintWriter scrivi=new PrintWriter(file);
        scrivi.println("autore: "+author);
        scrivi.println("data: "+data);
        scrivi.close();
    }
}
