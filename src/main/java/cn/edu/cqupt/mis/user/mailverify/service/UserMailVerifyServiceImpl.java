package cn.edu.cqupt.mis.user.mailverify.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author:dengsiyuan
 * @Date:2018/9/29 11:19
 */
@Service
public class UserMailVerifyServiceImpl {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private JavaMailSender mailSender;

    private String from = "campus.mis@foxmail.com";

    public Object sendVerifyMail(String to,String subject,String content){
        MimeMessage message = null;
        try {
            message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(from);
            helper.setTo(to);
            helper.setSubject(subject);
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            StringBuffer sb = new StringBuffer();
            sb.append("<div style='position: relative; margin: 0 auto; width: 450px;height: 350px;'>")
                    .append("<h1 align='center'><strong>Mis-Lab Security</strong></h1>")
                    .append("<h5>您好：</h5>")
                    .append("<h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;欢迎您通过邮箱验证码来验证您的身份！</h5>")
                    .append("<h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;快！使用<div style='position: relative; margin: 0 auto; width: 100px;height: 45px; text-align: center; background-color: #EEE'><font size='5' style='position: relative; top: 6px;'>"+content+"</font></div>去验证您的身份吧！切记不要告诉他人哦！</h5>")
                    .append("<h5 style='position:relative; float: right; margin-bottom: 0'>Mis-Lab</h5><br><br>")
                    .append("<h5 style='position: relative; float: right; margin-top: 0'>"+ simpleDateFormat.format(date)+"</h5></div>");
            helper.setText(sb.toString(), true);
            mailSender.send(message);
            return null;
        } catch (MessagingException e) {
            logger.error(e.getClass()+"{}",e);
            return null;
        }
    }
}
