
package repository;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Repository {

    public static void main(String[] args) throws IOException{
       /* ArrayList <tipoFile> Fs=new ArrayList<>();
       // txt file1= new txt();
        Fs.add((tipoFile)new cmd("flo","25/07/17","floCula"));
        Fs.add((tipoFile)new txt("stecco","21/07/17","prova1"));
        
        //Fs.get(1).rinomina("prova rinominare questo file ");
        
        for(int i=0;i<Fs.size();i++){
            System.out.println("autore: "+Fs.get(i).getAuthor()+"\n data: "+Fs.get(i).getData()+"\n called: "+Fs.get(i).getName());
        }*/
    
   generalFile file1= new generalFile("Ravagnan", "29/04/17", "provaGenerica", ".txt");
    }
    
}
