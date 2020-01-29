package itcast.start.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

//@RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用
@RestController
public class UserController {
    @RequestMapping("/index")

    public Map index(){
        Map map = new HashMap();
        map.put("name","一只流浪的KK");
        map.put("type","工城市");
        map.put("sec","male");
        return map;

    }

}
