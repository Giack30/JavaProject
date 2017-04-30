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
public interface tipoFile {
    void rinomina(String newFile);
    //void scrivi(String test);
   // int getLength();
    String getName();
    String getData();
    String getAuthor();
    void creaFile();
}
