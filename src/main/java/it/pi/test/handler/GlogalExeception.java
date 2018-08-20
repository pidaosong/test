package it.pi.test.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: test
 * @author: Mr.Pi
 * @create: 2018-08-20 15:17
 **/
@ControllerAdvice
public class GlogalExeception {
    @ExceptionHandler(value =Exception.class)
    @ResponseBody
    private Map<String,Object> exceptionHandler(HttpServletRequest request,Exception e){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success",true);
        modelMap.put("error",e.getMessage());
        return modelMap;
    }
}
