
package kantor;

/**
 *
 * @author Nurul AD
 */
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
public class classadmin {
    Statement st;
    ResultSet rs;
    
    Connection conn = null;
PreparedStatement pst = null;

    
    String divisi,notadinas,tgl,aplikasi,pemanfaatan,kegiatan,kendal,penanganan,keterangan, stts,kd;

    public String getDivisi() {
        return divisi;
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }

    public String getNotadinas() {
        return notadinas;
    }

    public void setNotadinas(String notadinas) {
        this.notadinas = notadinas;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public String getAplikasi() {
        return aplikasi;
    }

    public void setAplikasi(String aplikasi) {
        this.aplikasi = aplikasi;
    }

    public String getPemanfaatan() {
        return pemanfaatan;
    }

    public void setPemanfaatan(String pemanfaatan) {
        this.pemanfaatan = pemanfaatan;
    }

    public String getKegiatan() {
        return kegiatan;
    }

    public void setKegiatan(String kegiatan) {
        this.kegiatan = kegiatan;
    }

    public String getKendal() {
        return kendal;
    }

    public void setKendal(String kendal) {
        this.kendal = kendal;
    }

    public String getPenanganan() {
        return penanganan;
    }

    public void setPenanganan(String penanganan) {
        this.penanganan = penanganan;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getStts() {
        return stts;
    }

    public void setStts(String stts) {
        this.stts = stts;
    }

    public String getKd() {
        return kd;
    }

    public void setKd(String kd) {
        this.kd = kd;
    }
    
    
     void update(){
        try{
             java.sql.Connection conn=(Connection)koneksi.koneksi();
            String sql = null;
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            st.executeUpdate("Update data set divisi='"+this.divisi+"',notadinas= '"+this.notadinas+"',tanggal= '"+this.tgl+"',aplikasi= '"+this.aplikasi+"',pemanfaatan= '"+this.pemanfaatan+"',jeniskegiatan= '"+this.kegiatan+"',kendala= '"+this.kendal+"',penanganan= '"+this.penanganan+"',keterangan= '"+this.keterangan+"',status= '"+this.stts+"'" +" WHERE kd_data = '"+this.kd+"'");
            JOptionPane.showMessageDialog(null, "Data Berhasil di-update");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Gagal Di-update "+e);
        }
    }
     
      void cari(){
        try{
            st=conn.createStatement();
            rs=st.executeQuery("select * from data where kd_data='"+this.kd+"'");
           
            if(rs.next()){
                kd=rs.getString("kd_data");
                divisi=rs.getString("divisi");
                notadinas=rs.getString("notadinas");
                tgl=rs.getString("tanggal");
                aplikasi=rs.getString("aplikasi");
                pemanfaatan=rs.getString("pemanfaatan");
                kegiatan=rs.getString("kegiatan");
                kendal=rs.getString("kendala");
                penanganan=rs.getString("penanganan");
                keterangan=rs.getString("keterangan");
                stts=rs.getString("status");
                JOptionPane.showMessageDialog(null, "Data Ditemukan");
            }
            else{
                JOptionPane.showMessageDialog(null, "Gagal Ditemukan");
                kd="";
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Gagal Ditemukan "+e);
        }
    }

   
}
