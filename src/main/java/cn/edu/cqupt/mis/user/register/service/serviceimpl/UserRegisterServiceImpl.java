package cn.edu.cqupt.mis.user.register.service.serviceimpl;import cn.edu.cqupt.mis.user.common.StatusCode;import cn.edu.cqupt.mis.user.register.dao.UserRegisterDao;import cn.edu.cqupt.mis.user.register.model.UserRegisterMessage;import cn.edu.cqupt.mis.user.register.service.UserRegisterService;import org.slf4j.Logger;import org.slf4j.LoggerFactory;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Service;/** * @author:dengsiyuan * @Date:2018/9/29 9:18 */@Servicepublic class UserRegisterServiceImpl implements UserRegisterService {    Logger logger = LoggerFactory.getLogger(this.getClass());    @Autowired    private UserRegisterDao userRegisterDao;    /**     * 用户注册     * @param userRegisterMessage     * @return int:-1注册失败     */    @Override    public int userRegister(UserRegisterMessage userRegisterMessage) {        try {            if(userRegisterDao.judgeUserId(userRegisterMessage.getUserId()) == null){                if(userRegisterDao.judgeUserEmail(userRegisterMessage.getEMail()) == null){                    if(userRegisterDao.insertNewUser(userRegisterMessage) == -1){                        return StatusCode.OPERATE_FAIL;                    }else {                        return StatusCode.SUCCESS;                    }                }else {                    return StatusCode.EMAIL_EXIST;                }            }else {                return StatusCode.ID_EXIST;            }        }catch (Exception e){            e.printStackTrace();            logger.error(e.getClass()+"{}",e);            return StatusCode.FAIL;        }    }}