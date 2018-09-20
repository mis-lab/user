# UserSystem

用户管理与单点登录系统

### 开发环境

JDK8 + MySql5.7.21 + Windows 10

### 技术

#####         前端：

-  超文本标记语言：

​                HTML

-  层叠样式表：

​                CSS

-  动态脚本语言：

​                 JavaScript

-   UI框架：

​                Semantic UI

​                参考文档：https://semantic-ui.com/

#####           后台：

-    框架：

​                  1.IOC容器快速搭建框架：

​                         SpringBoot

​                          参考文档：http://spring.io/projects/spring-boot

​                  2.Web框架：

​                          SpringMVC

​                          参考文档：https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html#mvc

​                   3.数据库连接框架：

​                           mybatis

​                           参考文档：http://www.mybatis.org/mybatis-3/zh/getting-started.html

​                    4.分布式框架：

​                            Dubbo

​                             参考文档：http://dubbo.apache.org/en-us/docs/user/quick-start.html

- ​    工具包：

  ​              1.数据库连接池

  ​                     Druid

  ​                     参考文档：https://github.com/alibaba/druid/wiki

  ​               2.JSON格式化工具：

  ​                      fastJson

  ​                      参考文档：https://github.com/alibaba/fastjson/wiki/Quick-Start-CN

  ​                3.Redis操作类库

  ​                       Jedis

  ​                       参考文档：https://github.com/xetorthio/jedis/wiki

- ​      数据存储：

  ​                1.MySql

  ​                         参考文档：https://dev.mysql.com/doc/

  ​                 2.H2测试数据库

  ​                         参考文档：http://h2database.com/html/main.html

- ​        工具     

  ​               1.注册中心zookeeperr：

  ​                        参考文档：https://cwiki.apache.org/confluence/display/ZOOKEEPER/Index

  ​               2.依赖管理工具Maven：

  ​                        参考文档：https://maven.apache.org/guides/getting-started/index.html

  ​                3.jar包仓库：

  ​                         Maven Repository：http://mvnrepository.com/

  ### 

  ### 实现功能：

  #### 基础功能：

  

  - [x] 用户注册
  - [x] 用户登录并且记录登陆状态
  - [x] 用户邮箱绑定
  - [x] 登录验证码
  - [x] 全局拦截器
  - [x] 用户信息的查询
  - [x] 更新用户权限
  - [x] 初始化用户密码
  - [x] 删除用户
  - [x] 通过Excel导入用户信息
  - [x] 用户头像的上传、存储与展示
  - [x] 用户注销
  - [ ] 用户密码加密
  - [ ] IP拦截器    

####              高级功能：



- [ ] ​        Redis共享缓存

- [ ] ​        Dubbo RPC框架

#####           Dubbo是什么？能做什么？

​         Dubbo是一个分布式服务框架，以及SOA治理方案。其功能主要包括：高性能NIO通讯及多协议集成，     

​    服务动态寻址与路由，软负载均衡与容错，依赖分析与降级等

#####          Dubbo适用于哪些场景？

​      1：当网站变大后，不可避免的需要拆分应用进行服务化，以提高开发效率，调优性能，节省关键竞争资       

​           源等。 

​      2：当服务越来越多时，服务的URL地址信息就会爆炸式增长，配置管理变得非常困难，F5硬件负载均衡

​            器的单点压力也越来越大。 

​       3：当进一步发展，服务间依赖关系变得错踪复杂，甚至分不清哪个应用要在哪个应用之前启动，架构师

​             都不能完整的描述应用的架构关系。 

​       4：接着，服务的调用量越来越大，服务的容量问题就暴露出来，这个服务需要多少机器支撑？什么时候

​            该加机器？等等…… 

- [ ] Zookeeper服务注册中心
