# Java Spring Boot

[View Documentation](https://www.nodion.com/en/docs/java/)

Fork this repository to run a simple Spring Boot application with the help of Buildpacks.

Please don't forget to set the `PORT` environment variable.
1. 创建新应用
我登录Nodion后，点击"新建应用"按钮开始创建。选择Java模板后，系统会自动生成一个基础Spring Boot项目，其中包含一个简单的REST接口，访问时会显示"Hello Nodion!"。

2. 使用 Buildpacks 部署
我的项目根目录有pom.xml文件，Buildpacks自动识别为Java项目。我在system.properties中添加：

java.runtime.version=17
部署完成后，访问我的应用URL就能看到"Hello Nodion!"的欢迎信息。

