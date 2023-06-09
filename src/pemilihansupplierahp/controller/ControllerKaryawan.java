/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemilihansupplierahp.controller;

/**
 *
 * @author taken
 */
import java.util.Date;
import pemilihansupplierahp.dao.DAOKaryawan;
import pemilihansupplierahp.dao.InterfaceKaryawan;
import pemilihansupplierahp.model.ModelKaryawan;
import pemilihansupplierahp.model.ModelTabelKaryawan;
import pemilihansupplierahp.view.ViewKaryawan;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

public class ControllerKaryawan {
    ViewKaryawan frm;
    InterfaceKaryawan in;
    List<ModelKaryawan> list;
    
    public ControllerKaryawan(ViewKaryawan frm){
        this.frm = frm;
        reset();
        in = new DAOKaryawan();
        list = in.getAllKaryawan();
    }
    
    public void reset(){
        frm.getTxtIdKaryawan().setText("");
        frm.getTxtNama().setText("");
        frm.getCboKelamin().setSelectedIndex(0);
        frm.getCboAgama().setSelectedIndex(0);
        frm.getTxtTempat().setText("");
        frm.getDteTanggal().setDate(new Date());
        frm.getTxtAlamat().setText("");
        frm.getTxtNoTelp().setText("");
        frm.getTxtIdKaryawan().setEnabled(true);
        frm.getBtnTambah().setEnabled(true);
        frm.getBtnSimpan().setEnabled(false);
        frm.getBtnHapus().setEnabled(false);
    }
    
    public void isiTable(){
        list = in.getAllKaryawan();
        ModelTabelKaryawan mtk = new ModelTabelKaryawan(list);
        frm.getTblKaryawan().setModel(mtk);
        setTableColumnSize();
    }
    
    public void isiField(int row){
        frm.getTxtIdKaryawan().setText(list.get(row).getIdKaryawan());
        frm.getTxtNama().setText(list.get(row).getNama());
        frm.getCboKelamin().setSelectedItem(list.get(row).getStrKelamin());
        frm.getCboAgama().setSelectedItem(list.get(row).getStrAgama());
        frm.getTxtTempat().setText(list.get(row).getTempat());
        frm.getDteTanggal().setDate(list.get(row).getTglLahir());
        frm.getTxtAlamat().setText(list.get(row).getAlamat());
        frm.getTxtNoTelp().setText(list.get(row).getNoTelp());
        frm.getTxtIdKaryawan().setEnabled(false);
        frm.getBtnTambah().setEnabled(false);
        frm.getBtnSimpan().setEnabled(true);
        frm.getBtnHapus().setEnabled(true);
    }
    
    public void insert(){
        ModelKaryawan mk = new ModelKaryawan();
        
        if (!frm.getTxtIdKaryawan().getText().trim().isEmpty() && !frm.getTxtNama().getText().trim().isEmpty()){
            mk.setIdKaryawan(frm.getTxtIdKaryawan().getText().trim());
            mk.setNama(frm.getTxtNama().getText().trim());
            mk.setKelamin(frm.getCboKelamin().getSelectedIndex()+1);
            mk.setAgama(frm.getCboAgama().getSelectedIndex()+1);
            mk.setTempat(frm.getTxtTempat().getText().trim());
            mk.setTglLahir(frm.getDteTanggal().getDate());
            mk.setAlamat(frm.getTxtAlamat().getText().trim());
            mk.setNoTelp(frm.getTxtNoTelp().getText().trim());
            if (in.insert(mk)){
                JOptionPane.showMessageDialog(frm, "Data karyawan berhasil ditambahkan","Info",1);
            }else{
                JOptionPane.showMessageDialog(frm, "Data karyawan gagal ditambahkan. Periksa kembali data yang diinput.","Info",0);
            }
        }else{
            JOptionPane.showMessageDialog(frm, "Id Karyawan dan Nama harus diisi","Info",2);
        }
    }
    
    public void update(){
        ModelKaryawan mk = new ModelKaryawan();
        
        if (!frm.getTxtIdKaryawan().getText().trim().isEmpty() && !frm.getTxtNama().getText().trim().isEmpty()){
            mk.setIdKaryawan(frm.getTxtIdKaryawan().getText().trim());
            mk.setNama(frm.getTxtNama().getText().trim());
            mk.setKelamin(frm.getCboKelamin().getSelectedIndex()+1);
            mk.setAgama(frm.getCboAgama().getSelectedIndex()+1);
            mk.setTempat(frm.getTxtTempat().getText().trim());
            mk.setTglLahir(frm.getDteTanggal().getDate());
            mk.setAlamat(frm.getTxtAlamat().getText().trim());
            mk.setNoTelp(frm.getTxtNoTelp().getText().trim());
            if (in.update(mk)){
                JOptionPane.showMessageDialog(frm, "Perubahan data karyawan berhasil disimpan","Info",1);
            }else{
                JOptionPane.showMessageDialog(frm, "Perubahan data karyawan gagal disimpan","Info",0);
            }
        }else{
            JOptionPane.showMessageDialog(frm, "Id Karyawan dan Nama harus diisi","Info",2);
        }
    }
    
    public void delete(){
        if (!frm.getTxtIdKaryawan().getText().trim().isEmpty()){
            if (in.delete(frm.getTxtIdKaryawan().getText().trim())){
                JOptionPane.showMessageDialog(frm, "Data karyawan berhasil dihapus.","Info",1);
            }else{
                JOptionPane.showMessageDialog(frm, "Data karyawan gagal dihapus","Info",0);
            }
        }else{
            JOptionPane.showMessageDialog(frm, "Id Karyawan harus diisi","Info",2);
        }
    }
    
    public void cari(){
        if (!frm.getTxtCari().getText().trim().isEmpty()){
            list = in.getCariKaryawan(frm.getTxtCari().getText().trim());
            ModelTabelKaryawan mtk = new ModelTabelKaryawan(list);
            frm.getTblKaryawan().setModel(mtk);
        }else{
            list = in.getAllKaryawan();
            ModelTabelKaryawan mtk = new ModelTabelKaryawan(list);
            frm.getTblKaryawan().setModel(mtk);
        }
    }
    
    public void setTableColumnSize(){
        JTable tbl = frm.getTblKaryawan();
        TableColumnModel columnModel = tbl.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(50);
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(2).setPreferredWidth(200);
        columnModel.getColumn(3).setPreferredWidth(100);
        columnModel.getColumn(4).setPreferredWidth(100);
        columnModel.getColumn(5).setPreferredWidth(150);
        columnModel.getColumn(6).setPreferredWidth(100);
        columnModel.getColumn(7).setPreferredWidth(200);
        columnModel.getColumn(8).setPreferredWidth(120);
    }
}
