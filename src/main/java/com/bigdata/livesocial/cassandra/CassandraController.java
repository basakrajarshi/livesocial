package com.bigdata.livesocial.cassandra;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dixit Patel
 */

@RestController
public class CassandraController {


  //  @Autowired
  //  CassandraService cassandraService;

    @RequestMapping(method = RequestMethod.POST, value = "/test")
    String test() {
        return "Test";
    }
}
