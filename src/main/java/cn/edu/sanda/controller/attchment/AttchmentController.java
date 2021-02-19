package cn.edu.sanda.controller.attchment;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"attchment"})
public class AttchmentController {
    //登录首页
    @GetMapping(value = {"/image_upload"})
    public String adminLogin() {
        return "/attchment/image_upload";
    }

}
