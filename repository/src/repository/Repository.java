
package repository;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Repository {

    public static void main(String[] args) {
        ArrayList <tipoFile> Fs=new ArrayList<>();
        Fs.add((tipoFile)new cmd("Rava","24/07/17","spegnimento"));
        Fs.add((tipoFile)new txt("stecco","21/07/17","come la prendo domani"));
        
        for(int i=0;i<Fs.size();i++){
            System.out.println("autore: "+Fs.get(i).getAuthor()+"\n data: "+Fs.get(i).getData()+"\n called: "+Fs.get(i).getName());
        }
    }
    
}
