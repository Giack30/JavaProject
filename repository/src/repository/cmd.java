/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

/**
 *
 * @author Administrator
 */
public class cmd implements tipoFile {
    public String author;
    public String data;
    public String fileName;
    public cmd(String author, String data, String fileName){
        this.author=author;
        this.data=data;
        this.fileName=fileName+".cmd";
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
}
