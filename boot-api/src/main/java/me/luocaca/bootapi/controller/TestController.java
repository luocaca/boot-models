package me.luocaca.bootapi.controller;

import me.luocaca.bootentity.Person;
import me.luocaca.bootutils.helper.CommonMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/test")
public class TestController {

    /**
     *  获取当前时间
     * @return
     */
    @GetMapping("/date")
    public String getDate()
    {

        Person  person = new Person();
        person.setAge(18);
        person.setId(1);
        person.setName("大傻");

        Date d =  CommonMethod.getCurDate() ;

        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


        return "当前时间"+f.format(d)+person;

    }


}
