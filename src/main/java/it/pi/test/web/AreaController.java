package it.pi.test.web;

import it.pi.test.entity.Area;
import it.pi.test.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: test
 * @author: Mr.Pi
 * @create: 2018-08-20 15:10
 **/
@RestController
@RequestMapping("/admin")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @GetMapping(value = "/listarea")
    private Map<String,Object> areaList(){
        Map<String,Object> modelmap = new HashMap<String,Object>();
        List<Area> list = areaService.getAreaList();
        modelmap.put("list",list);
        return modelmap;
    }

    @GetMapping(value = "/getareabyid")
    private Map<String,Object> getAreaById(@RequestParam("id")int areaId){
         Map<String,Object> modelMap = new HashMap<String, Object>();
         Area area = areaService.getAreaById(areaId);
         modelMap.put("success",true);
         modelMap.put("area",area);
         return  modelMap;
    }

}
