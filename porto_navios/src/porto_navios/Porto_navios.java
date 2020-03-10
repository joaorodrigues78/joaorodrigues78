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
public class Porto_navios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Porto p = new Porto();
        Navio n;
        Petroleiro np;
        PortaContentores npc;
        
        
        n = new Navio ("07-JR-78");
        n.setNome("Navio01");
        n.setComp(50);
        p.novoNavio(n);
        
        np = new Petroleiro ("83-RE-23");
        np.setNome("Petroleiro01");
        np.setComp(80);
        np.cap = 5;
        p.novoNavio(np);
        
        npc = new PortaContentores ("23-GF-10");
        npc.setNome("PortaContentores01");
        npc.setComp(100);
        npc.num = 30;
        p.novoNavio(npc);
                
    }
    
}
