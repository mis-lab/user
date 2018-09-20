# 个人信息页面接口文档

### 1.用户信息获取

##### 1.url
    
    /userPersonalMessShow
    
#### 2.请求参数

    无参
    
#### 3.响应

key:userPersonalMessShow

###### 1.响应成功

参数|含义|类型
--|--|--
userName|用户名|String
id|学号|String
sex|性别|String
phone_number|手机号码|String
major|专业|String
class_number|班级|String
study_direction|学习方向|String
age|年龄|int
birth|生日|String（格式：xxxx年xx月xx日）
labelInfo|一句话标签|String

###### 2.响应失败的几种情况

|||
--|--|--
2|未登录
0|此功能出现问题，请联系管理员
4|该用户不存在


### 2.用户信息的更改

##### 1.url

    /userPersonalMessUpdate
    
##### 2.请求参数

参数|含义|类型
--|--|--
userName|用户名|String
id|学号|String
sex|性别|String
phone_number|手机号码|String
major|专业|String
class_number|班级|String
study_direction|学习方向|String
age|年龄|int
birth|生日|String（格式：xxxx年xx月xx日）
labelInfo|一句话标签|String

##### 3.响应

key：userPersonalMessUpdate

|||
--|--|--
1|已成功更改个人信息
2|更新失败，稍后重试
3|未登录。无权进行信息更改，请返回登陆页面进行登录
0|此功能出现异常，请联系管理员