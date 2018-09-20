# 注册页面接口文档

### 1.用户唯一性验证

##### 1.url

    (1)用户学号唯一性
    GET /regist/userIdVerify

    (2)用户邮箱唯一性
    GET /regist/userEmailVerify
    
##### 2.请求参数

(1)学号唯一性
   参数|类型
   --|--|
   id|String
(2)邮箱唯一性
   参数|类型
   --|--|
   eMail|String
   
##### 3.响应

(1)key:userIdVerify
(2)key:userEmailVerify

参数|含义
--|--|
0|此功能出现异常，请联系管理员
1|此账号可用
2|该账号已存在

### 2.注册

##### 1.url

    POST /regist
    
##### 2.请求参数

参数|含义|类型
--|--|--
userName|用户名|String
password|密码|String
id|学号|String
e_mail|邮箱|String
mailVerifyCode|邮箱验证码|String

##### 3.响应
key：regist
参数|含义
--|--
0|此功能出现异常，请联系管理员
1|注册成功
2|注册失败
3|存在空值
4|请输入正确的邮箱
5|邮箱验证码错误