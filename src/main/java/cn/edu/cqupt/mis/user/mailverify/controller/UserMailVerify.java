package cn.edu.cqupt.mis.user.mailverify.controller;

import cn.edu.cqupt.mis.user.common.StatusCode;
import cn.edu.cqupt.mis.user.mailverify.service.UserMailVerifyServiceImpl;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
/**
 * @author:dengsiyuan
 * @Date:2018/9/29 11:14
 */
@RestController
@Api("用户邮箱绑定")
public class UserMailVerify {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserMailVerifyServiceImpl userMailVerifyServiceImpl;

    /**
     * 各种邮箱验证码的发送controller
     * @param eMail
     * @param session
     **/
    @ApiOperation("用户邮箱绑定")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "eMail",dataType = "String",required = true,value = "用户邮箱")
    })
    @ApiResponses({
            @ApiResponse(code = 0,message = "该功能存在异常"),
            @ApiResponse(code = 1,message = "验证码发送成功"),
            @ApiResponse(code = 2,message = "验证码发送失败")
    })
    @RequestMapping(value = "/user/eMailCode",method = RequestMethod.GET)
    public Object verifyMail(String eMail, HttpSession session) throws Exception {
        System.out.println(eMail);
        Map map = new HashMap<String,Object>(16);
        try {
            String base = "abcdefghijklmnopqrstuvwxyz0123456789";
            Random random = new Random();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < 5; i++) {
                int number = random.nextInt(base.length());
                sb.append(base.charAt(number));
            }
            session.setAttribute("mailCode",sb.toString());
            String subject = "Mis-Lab Security";
            if(userMailVerifyServiceImpl.sendVerifyMail(eMail,subject,sb.toString()) != null){
                map.clear();
                map.put("verifyMail", StatusCode.OPERATE_FAIL);
            }
            else {
                map.clear();
                map.put("verifyMail", StatusCode.SUCCESS);
            }
        }catch (Exception e){
            logger.error(e.getClass()+"{}",e);
            map.clear();
            map.put("verifyMail",StatusCode.FAIL);
        }
        return map;
    }
}
