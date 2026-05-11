# SSM物业管理系统

## 项目简介

这是一个基于SSM（Spring + Spring MVC + MyBatis）框架开发的物业管理系统，用于管理小区的各项物业事务，包括业主信息、房屋管理、收费管理、报修管理、投诉管理、活动管理等功能。

## 技术栈

- **后端框架**: Spring 5.3.20 + Spring MVC + MyBatis 3.5.9
- **数据库**: MySQL 5.x
- **连接池**: Druid 1.2.9
- **构建工具**: Maven 3.8.8
- **JDK版本**: JDK 1.8+
- **Web服务器**: Tomcat
- **其他技术**:
  - Lombok 1.18.24（简化实体类开发）
  - Jackson 2.13.3（JSON处理）
  - PageHelper 5.2.1（分页插件）
  - Hutool 5.7.5（Java工具类库）
  - Commons FileUpload 1.4（文件上传）
  - Log4j 1.2.17（日志管理）
  - Layui（前端UI框架）

## 项目结构

```
property-management-system/
├── src/main/java/com/property/management/
│   ├── contorller/          # 控制器层（Controller）
│   ├── entity/              # 实体类
│   ├── mapper/              # MyBatis Mapper接口
│   ├── service/             # 服务层接口
│   │   └── impl/           # 服务层实现类
│   ├── intercept/           # 拦截器
│   ├── util/                # 工具类
│   └── giveserviceutil/     # 通用服务工具类
├── src/main/resources/
│   ├── config/              # 配置文件
│   │   ├── applicationContext.xml  # Spring核心配置
│   │   ├── mvc.xml                # Spring MVC配置
│   │   ├── mybatis.xml            # MyBatis配置
│   │   └── jdbc.properties        # 数据库配置
│   ├── mapper/              # MyBatis XML映射文件
│   └── log4j.properties     # 日志配置
└── src/main/webapp/         # Web资源文件
    ├── WEB-INF/
    ├── assets/              # 静态资源
    ├── css/                 # 样式文件
    ├── js/                  # JavaScript文件
    ├── images/              # 图片资源
    └── *.jsp                # JSP页面
```

## 功能模块

### 1. 用户管理
- 用户登录/注册
- 用户信息管理
- 权限控制

### 2. 业主管理
- 业主信息录入
- 业主信息查询
- 业主资料维护

### 3. 房屋管理
- 楼栋管理
- 房屋信息管理
- 社区管理

### 4. 收费管理
- 费用项目管理
- 费用收取记录
- 缴费查询

### 5. 报修管理
- 报修申请
- 报修处理
- 维修记录查询

### 6. 投诉管理
- 投诉提交
- 投诉处理
- 投诉记录查询

### 7. 活动管理
- 社区活动发布
- 活动报名
- 活动记录

### 8. 设备管理
- 设备信息维护
- 设备状态监控

### 9. 停车管理
- 车位管理
- 车辆信息登记
- 停车使用记录

### 10. 宠物管理
- 宠物信息登记
- 宠物档案管理

### 11. 信箱管理
- 信件收发
- 信箱信息管理

### 12. 资产管理
- 资产登记
- 资产查询
- 资产维护

## 环境要求

- **JDK**: 1.8 或更高版本
- **Maven**: 3.6+ 
- **MySQL**: 5.7 或更高版本
- **Tomcat**: 8.5 或更高版本
- **IDE**: IntelliJ IDEA（推荐）

## 安装与部署

### 1. 克隆项目
```bash
git clone <repository-url>
cd SSMwy
```

### 2. 数据库配置

1. 创建数据库：
```sql
CREATE DATABASE management DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
```

2. 导入数据库脚本（如果有提供SQL文件）

3. 修改数据库配置 `src/main/resources/config/jdbc.properties`：
```properties
jdbc.driver=com.mysql.jdbc.Driver
jdbc.url=jdbc:mysql:///management?serverTimezone=UTC&useSSL=false&characterEncoding=utf-8
jdbc.username=root
jdbc.password=123456
```

### 3. 编译项目

使用Maven编译项目：
```bash
cd property-management-system
mvn clean package
```

### 4. 部署到Tomcat

#### 方式一：IDEA中配置Tomcat
1. 打开IntelliJ IDEA
2. 点击 `Run` -> `Edit Configurations`
3. 添加新的Tomcat Server配置
4. 设置Deployment，添加artifact
5. 点击运行

#### 方式二：手动部署
1. 将生成的WAR包复制到Tomcat的webapps目录
2. 启动Tomcat服务器
3. 访问应用

### 5. 访问应用

启动成功后，在浏览器中访问：
```
http://localhost:8080/property-management-system
```

默认登录页面：
```
http://localhost:8080/property-management-system/login.jsp
```

## 注意事项

1. **Lombok支持**: 确保IDE已安装Lombok插件并启用了注解处理器
   - IDEA设置: `File` -> `Settings` -> `Build, Execution, Deployment` -> `Compiler` -> `Annotation Processors`
   - 勾选 "Enable annotation processing"

2. **数据库连接**: 确保MySQL服务已启动，并且数据库配置正确

3. **端口冲突**: 如果8080端口被占用，请修改Tomcat端口配置

4. **字符编码**: 项目使用UTF-8编码，确保数据库和IDE都使用UTF-8编码

5. **JDK版本**: 建议使用JDK 1.8，如果使用更高版本可能需要调整配置

## 常见问题

### 1. 编译错误：找不到getter/setter方法
- 确保IDE已安装Lombok插件
- 启用注解处理器
- 重新导入Maven项目

### 2. 数据库连接失败
- 检查MySQL服务是否启动
- 验证数据库用户名和密码
- 确认数据库名称是否正确

### 3. 404错误
- 检查应用是否正确部署
- 确认访问路径是否正确
- 查看Tomcat日志排查问题

### 4. 中文乱码
- 确保数据库使用utf8mb4编码
- 检查JDBC连接字符串中的characterEncoding参数
- 确认web.xml中的字符编码过滤器已配置

## 开发者

- 开发框架: SSM (Spring + Spring MVC + MyBatis)
- 前端框架: Layui
- 开发语言: Java

## 许可证

本项目仅供学习参考使用。

---

**温馨提示**: 如果是首次运行项目，建议先检查数据库配置和Lombok插件是否正确安装。
