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


/* Classe porto definida, tal como os seus atributos e construtor. Este construtor recebe
como parametro a capacidade do porto */
public class Porto {
    
    private int capPorto, ctNavios; 
    private Navio[] navios;
    
    public Porto (int capPorto){
        this.capPorto = capPorto;
        navios = new Navio [capPorto];
        ctNavios = 0;  
    }

    Porto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCapPorto (){
        return capPorto;
    }
    
    public Navio [] getNavios(){
        return navios;
    }
    
    /* Metodo para adicionar um novo navio, onde verifica se o porto têm capacidade para o receber
    e não permite a duplicação da matricula do navio */
    public void novoNavio (Navio n){
        if(ctNavios == capPorto){
            System.out.println("No capacidade de navios atingido!");
            return;
        }
        boolean enc = false;
        for (int i=0;i<ctNavios;i++) {
            if(n.getMatricula().equals(navios[i].getMatricula())){
                enc = true;
                System.out.println("Matricula Existente;" + n.getMatricula());
            }
        }
        if (!enc){
           navios [ctNavios] = n;
            ctNavios ++;
        }
    }
    
    /*
    public float getCapacidadeTotal() {
        float total = 0;
        for (int i=0; i<ctNavios; i++){
            if(navios[i] instanceOf Petroleiro){
                total += ((Petroleiro)navios[i]).getCap();
            }
            if(navios[i] instanceOf PortaContentores){
                total += ((PortaContentores)navios[i]).getNum()*10;
            }         
        
        }
    }
    */
}
