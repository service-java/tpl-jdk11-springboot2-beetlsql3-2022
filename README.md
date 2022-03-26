# README

- 起步例子

---

# 项目简介 @intro

用一两句话简单描述该项目所实现的业务功能

---

# 技术选型 @stack

- jdk11
- springboot2
- beetlsql3
- mysql-connector-java
- HikariCP
- guava
- hutool
- lombok

# 环境信息 @env

- gitpod 
- Extension Pack for Java插件
- Lombok Annotations Support for VS Code插件
- mysql连接信息

```yml
spring:
  datasource:
    url: jdbc:mysql://127.0.0.1:3306/demo?characterEncoding=UTF-8&allowMultiQueries=true&serverTimezone=GMT%2B8
    username: root
    password: 123456
```

# 外部依赖 @deps

项目运行时所依赖的外部集成方

---

# 领域模型 @ddd

核心的领域概念

# 技术架构 @arch

技术架构图

# 编码实践 @spec

统一的编码实践，比如异常处理原则、分页封装等

---

# 本地构建 @build

- API示例
  - http://localhost:8080/api/user/listByName?name=user
  - http://localhost:8080/api/user/listByAge?age=22

- 代码生成

```
生成到其他包, 然后在项目里拖拽
防止覆盖已有代码

===
// 需要忽略以下位置的代码
/src/main/java/com/ibeetlcodegen/
/src/main/resources/sql/
```

![](https://luo0412.oss-cn-hangzhou.aliyuncs.com/1648279561998-cDWA8fjDWCFM.png)

# 测试策略 @test

# 部署架构 @deploy

部署架构图

---

# 常见问题 @faq

- 代码生成的utf8编码问题 @todo

```
暂时好像只支持gbk, 有中文的先用gbk编码的文件
```

---

# 参考 @ref
