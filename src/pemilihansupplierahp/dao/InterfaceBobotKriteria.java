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
import pemilihansupplierahp.model.ModelBobotKriteria;

public interface InterfaceBobotKriteria {
    public Boolean insert(ModelBobotKriteria m);
    public Boolean update(ModelBobotKriteria m);
    public Boolean delete(ModelBobotKriteria m);
    public List<ModelBobotKriteria> getAllBobotKriteria();
    public Boolean bobotIsExists(int id_kriteria1, int id_kriteria2);
    public List<ModelBobotKriteria> getBobotSelectedKriteria(int id_kriteria1, int id_kriteria2);
}
