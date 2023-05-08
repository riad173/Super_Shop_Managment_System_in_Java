/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.io.File;
import javax.swing.JOptionPane;
import java.awt.Desktop;

/**
 *
 * @author riadm
 */
public class OpenPdf {
    public static void openById(String id){
        try{
            if((new File("D:\\walton\\ai\\"+id+".pdf")).exists()){
                File pdfFile = new File("D:\\walton\\ai\\"+id+".pdf");
                Desktop.getDesktop().open(pdfFile);
            }else{
               JOptionPane.showMessageDialog(null, "File is not Exists"); 
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
