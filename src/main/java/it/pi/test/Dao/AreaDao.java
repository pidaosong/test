package it.pi.test.Dao;

import it.pi.test.entity.Area;

import java.util.List;

/**
 * @program: test
 * @author: Mr.Pi
 * @create: 2018-08-20 13:53
 **/
public interface AreaDao {
    List<Area> queryArea();

    Area queryAreaById(int areaId);

    int insertArea(Area area);

    int updateArea(Area area);

    int deleteArea(int areaId);

}
