/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespboinventaris;

/**
 *
 * @author aris
 */
public abstract class Orang {
    private String nama;
    private int nip;
    
    public Orang(String nama,int nip){
        this.nama=nama;
        this.nip=nip;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
 
    public String getNama() {
        return nama;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }
}
