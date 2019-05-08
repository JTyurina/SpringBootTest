package springbootpackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

//аннотация указывает, что класс является приложением спринг бут
//спринг бут стартер из пом найдет аннотацию SpringApplication, в нем main, запустит springApplication
//Также он обнаружит аннотацию контроллер. Маппинг зада следующий - при открытии url /hello будет отображаться вью hello world
//По умолчанию все вью находятся в templates

@RestController
@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception{
        SpringApplication.run(Application.class, args);
    }


}