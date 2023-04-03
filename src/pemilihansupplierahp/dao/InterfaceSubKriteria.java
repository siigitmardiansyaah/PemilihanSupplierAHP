/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemilihansupplierahp.dao;

/**
 *
 * @author taken
 */
import java.util.List;
import pemilihansupplierahp.model.ModelKriteria;
import pemilihansupplierahp.model.ModelSubKriteria;

public interface InterfaceSubKriteria {
    public Boolean insert(ModelSubKriteria m);
    public Boolean update(ModelSubKriteria m);
    public Boolean delete(int id_kriteria);
    public List<ModelSubKriteria> getAllSubKriteria(int id_kriteria);
    public List<ModelSubKriteria> getSubKriteriaByKriteria(ModelKriteria m);
}
