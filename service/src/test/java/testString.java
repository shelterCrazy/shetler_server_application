import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by kenan on 2018/5/3.
 */
@RestController
@EnableAutoConfiguration
//@SpringBootTest
public class testString {

    Logger logger = LoggerFactory.getLogger(testString.class);

    public static void main(String[] args) throws JsonProcessingException {
        String str = "\u6700\u4ee3\u7801\u7f51\u7ad9\u5730\u5740";

        ObjectMapper om = new ObjectMapper();
        System.out.println(om.writeValueAsString(str));

        System.out.println(str);

        SpringApplication.run(testString.class);
    }


    @RequestMapping("/springIoTest")
    public ModelMap springIoTest(){
        ModelMap map = new ModelMap();
        logger.debug("进入/springIoTest ****************");

        map.put("status", "200");
        map.put("msg", "hello word");
        return map;
    }

}
