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
public class cmd implements tipoFile {
    public String author;
    public String data;
    public String fileName;
    public String Path;
    
    public cmd(String author, String data, String fileName) throws IOException{
        this.author=author;
        this.data=data;
        this.fileName=fileName+".cmd";
        this.Path="F:/3^IC/INFORMATICA/JAVA/repository/src/contenitore/"+fileName+".cmd";
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
    
    @Override
    public void rinomina(String newFile) {
       fileName=newFile+".cmd"; 
    }

    @Override
    public String getName() {
       return fileName;
    }

    @Override
    public String getData() {
       return data;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public void creaFile() {
        
    }
}
