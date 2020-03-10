/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porto_navios;

/**
 *
 * @author joaor
 */
public class PortaContentores extends Navio {
    
    int num;
    
    public PortaContentores (String matricula) {
        super(matricula);
    }
    
    public int getNum(){
        return num;
    }
    
    public void setNum (int num){
        this.num = num;
    }
    
}
