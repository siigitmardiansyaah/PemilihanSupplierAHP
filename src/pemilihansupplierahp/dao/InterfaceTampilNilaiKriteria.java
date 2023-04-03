/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemilihansupplierahp.dao;

import java.util.List;
import pemilihansupplierahp.model.ModelKriteria;
import pemilihansupplierahp.model.ModelTampilHasil;
import pemilihansupplierahp.model.ModelTampilNilaiKriteria;
import pemilihansupplierahp.model.ModelTampilNilaiSubKriteria;
import pemilihansupplierahp.model.ModelValues;

/**
 *
 * @author taken
 */
public interface InterfaceTampilNilaiKriteria {
    public List<ModelTampilNilaiKriteria> getAllNilaiBobotKriteria();
    public List<ModelValues> getValuesKriteria();
    public List<ModelTampilNilaiSubKriteria> getNilaiBobotSubKriteria(ModelKriteria m);
    public List<ModelValues> getValuesSubKriteria(ModelKriteria k);
    public List<ModelTampilHasil> getHasil();
}
