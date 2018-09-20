# 登录页面接口文档

### 1.登录

##### 1.url

    POST /login
    
##### 2.参数

参数|含义|类型
--|--|--
input|学号/邮箱|String
password|密码|String
vCode|验证码|String

##### 3.响应

key:login

状态码|含义
--|--|
0|该功能出现异常，请联系管理员
1|登陆成功
2|登陆信息未填写完整
3|无权登陆该系统
4|验证码输入不正确
5|用户名或密码填写错误

### 2.当前登录用户用户名获取

##### 1.url

    POST /clientUserName
    
##### 2.请求参数

    无参
    
##### 3.响应
key：clientUserName

value:用户名

### 3.用户注销

##### 1.url

    POST /loginOut
    
##### 2.请求参数

    无参
    
##### 3.响应
key: loginOut

参数|含义
--|--|
1|注销成功
0|注销失败