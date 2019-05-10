/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesanjaketlab.changeColor;

/**
 *
 * @author ilham
 */
public class convertNIMToColor implements colorChage{

    @Override
    public String colorChanger(int NIM) {
        String Warna=null;
        if (NIM%2==0){
            Warna = "hitam";
        }else if (NIM%2==1){
            Warna = "Abu Abu";
        }
        return Warna;
    }
    
}
