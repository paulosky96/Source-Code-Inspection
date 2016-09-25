package br.calebe.ticketmachine.core;

import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
class Troco {

    private PapelMoeda[] papeisMoeda;

    public Troco(int v2,int v5,int v10,int v20,int v50, int v100) {
        
        papeisMoeda = new PapelMoeda[5];
        papeisMoeda[0]= new PapelMoeda(2,v2);
        papeisMoeda[1]= new PapelMoeda(5,v5);
        papeisMoeda[2]= new PapelMoeda(10,v10);
        papeisMoeda[3]= new PapelMoeda(20,v20);
        papeisMoeda[4]= new PapelMoeda(50,v50);
        papeisMoeda[5]= new PapelMoeda(100,v100);
     }

    public Iterator<PapelMoeda> getIterator() {
        return new TrocoIterator();
    }

    class TrocoIterator implements Iterator<PapelMoeda> {

        

       

        @Override
        public boolean hasNext() {
            for (int i = 6; i >= 0; i++) {
                if (papeisMoeda[i] != null) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public PapelMoeda next() {
            PapelMoeda ret = null;
            for (int i = 6; i >= 0 && ret != null; i++) {
                if (papeisMoeda[i] != null) {
                    ret = papeisMoeda[i];
                    papeisMoeda[i] = null;
                }
            }
            return ret;
        }

        @Override
        public void remove() {
            next();
        }
    }
}
