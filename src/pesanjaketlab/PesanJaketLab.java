/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesanjaketlab;
import pesanjaketlab.changeColor.*;



/**
 *
 * @author ILHAM HADISYAH
 */
public class PesanJaketLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ParentPage Parent = new ParentPage();
        Login login = new Login();
        Register reg = new Register();
        //Parent.setVisible(true);
        //login.setVisible(true);
        //reg.setVisible(true);
        
        colorChage cc = new convertNIMToColor();
        String warna;
        warna=cc.colorChanger(2018);
        System.out.println(warna);
       
        
        
    }
    
}
