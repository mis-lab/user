# 个人信息页面接口文档

### 1.用户信息获取

##### 1.url

    GET /session/user/info

#### 2.响应

key:user

###### 1.响应成功

参数|含义|类型
--|--|--
userName|用户名|String
id|学号|String
sex|性别|String
phoneNumber|手机号码|String
major|专业|String
classNumber|班级|String
studyDirection|学习方向|String
age|年龄|int
birth|生日|String（格式：xxxx-xx-xx）
labelInfo|一句话标签|String

Json示例：

    {
    "user": {
        "userName": "dsy",
        "id": "2017211005",
        "sex": "男",
        "phoneNumber": "13759758663",
        "major": "信息管理与信息系统",
        "classNumber": "03011702",
        "studyDirection": "后台",
        "age": 19,
        "birth": "1999-10-27",
        "labelInfo": "Do Your Best!!!"
        }
    }
###### 2.响应失败的几种情况

###### | | |
--|--|--
2|未登录
0|此功能出现问题，请联系管理员
4|该用户不存在

Json示例：

    {
        "user":2
    }


### 2.用户信息的更改

##### 1.url

    PUT /user/info

##### 2.请求参数

参数|含义|类型
:--|--|--
userName|用户名|String
id|学号|String
sex|性别|String
phoneNumber|手机号码|String
major|专业|String
classNumber|班级|String
studyDirection|学习方向|String
age|年龄|int
birth|生日|String（格式：xxxx年xx月xx日）
labelInfo|一句话标签|String

##### 3.响应

key：user

|||
--|--|--
1|已成功更改个人信息
2|更新失败，稍后重试
3|未登录。无权进行信息更改，请返回登陆页面进行登录
0|此功能出现异常，请联系管理员

Json示例：

    {
        "user":1
    }