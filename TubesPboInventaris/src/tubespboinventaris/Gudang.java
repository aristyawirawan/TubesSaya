/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespboinventaris;
import java.util.ArrayList;
/**
 *
 * @author aris
 */
public class Gudang {
    public int index;
    public int id;
    ArrayList<Barang> daftarBarang=new ArrayList<>();

    public Gudang(int id) {
        this.id=id;
    }
    
    public void addBarang(int idBrg){
        Barang brg=new Barang(idBrg);
        daftarBarang.add(brg);
    }
    
    public Barang getBarangByIndex(){
        return daftarBarang.get(index);
    }
    
    public void deleteBarang(int idBrg){
        daftarBarang.remove(idBrg);
    }
}
