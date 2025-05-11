# Java Spring Boot

[View Documentation](https://www.nodion.com/en/docs/java/)

Fork this repository to run a simple Spring Boot application with the help of Buildpacks.

Please don't forget to set the `PORT` environment variable.

## 📦 项目结构
springboot-demo/                 # 项目根目录
├── .gitignore
├── mvnw / mvnw.cmd
├── pom.xml                     # Maven 项目配置文件（定义依赖、构建方式等）
├── Procfile                   # Nodion/Heroku 等平台用来指定启动命令
├── README.md
├── system.properties          # 指定使用的 Java 版本（供 Buildpack 读取）
├── .mvn/
│   └── wrapper/
│       ├── maven-wrapper.jar
│       └── maven-wrapper.properties
└── src/                       # 项目源码
    ├── main/
    │   ├── java/
    │   │   └── com/nodion/demo/
    │   │       └── DemoApplication.java    # Spring Boot 应用主入口类（带 main 方法）
    │   └── resources/
    │       └── application.properties      # Spring Boot 配置文件（端口、数据库、日志等）
    └── test/
        └── java/com/nodion/demo/
            └── DemoApplicationTests.java
 
