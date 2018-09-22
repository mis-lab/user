# 登录页面接口文档

### 1.登录

##### 1.url

    POST /session/user
    
##### 2.参数

参数|含义|类型
--|--|--
input|学号/邮箱|String
password|密码|String
vCode|验证码|String

Json示例

    {
      "input":"username",
      "password":"123456",
      "vCode":"qw5s"
      }

##### 3.响应

状态码|含义
--|--|
0|该功能出现异常，请联系管理员
1|登陆成功
2|登陆信息未填写完整
3|无权登陆该系统
4|验证码输入不正确
5|用户名或密码填写错误

Json示例

    {
      "login":1;
    }

### 2.当前登录用户用户名获取

##### 1.url

    GET session/user/name
    
##### 2.响应
Json示例

    {
        "clientName":"dsy"
    }

### 3.用户注销

##### 1.url

    DELETE /session/user/name
    
##### 2.响应
Json示例

    {
        “logout”：“dsy”
    }