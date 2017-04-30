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
public class txt implements tipoFile{
    public String author;
    public String data;
    public String fileName;
    public txt(String author, String data, String fileName){
        this.author=author;
        this.data=data;
        this.fileName=fileName+".txt";
    }
    @Override
    public void rinomina(String newFile) {
       fileName=newFile+".txt"; 
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
