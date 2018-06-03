# gradle-demo

gradle 使用记录。

## 安装Gradle
1. Gradle基于JVM，确保已经安装jdk
2. [下载](http://services.gradle.org/distributions/)gradle
3. 解压并配置环境变量 `GRADLE_HOME`

## Groovy

Groovy是用于JVM的一种敏捷的动态语言，他是一种成熟的面向对象的对象编程语言，既可用于面向对象编程，又可以用作脚本语言。

Groovy语法与Java的区别：
1. 完全兼容Java语法
2. 分号可选
3. 类、方法默认为public，不存在default
4. 属性会自动添加getter、setter
5. 属性可用点获取
6. 最后一个表达式，会被作为return值。


高效特性：
1. assert 语句
2. 可选的括号
3. 可选的类型定义
4. 集合API
5. 字符串
6. 闭包

## Gradle 默认提供的Task

### build setup
顾名思义，构建安装gradle。

`gradle wrapper`：如果你的操作系统中没有gradle环境，但是你需要一个gradle使用，可以使用 `gradle wrapper`命令生成一个wrapper方式的gradle。会生成如下的目录结构：
```txt
.gradle/
gradle/
    wrapper/
gradlew
gradlew.bat
```

如果你的项目没有gradle，需要使用gradle，可以使用 `gradle init`依赖gradle，此task依赖 `warapper` task，生成如下目录结构：
```txt
.gradle/
gradle/
build.gradle
gradlew
gradlew.bat
setting.gradle
```

### build
- `assemble` 编译
- `build` 编译、测试
- `buildDependents` 编译、测试、依赖
- `buildNeeded` 编译、测试、依赖
- `classes` 编译 'main' 目录
- `testClasses` 编译'test'目录
- `clean` 清除生成的'build'目录，类似maven target目录，用作输出。
- `jar` 插件jar的task，用于打成jar
- `war` 插件war的task，用于打成war

### other
- `compileJava` 编译Java
- `compileTestJava` 编译测试的Java类
- `processResources` 处理资源
- `processTestResources` 初始测试资源

### help

一些帮助命令，可以帮助用户查找一些信息：

- `help` gradle帮助
- `projects` 查看所有的gradle工程
- `properties` 查看project对象的所有属性
- `components` 显示工程的组件
- `tasks` 查看所有的tasks
- `dependencies` 查看所有依赖
- `dependencyInsight` 查看改工程的特定依赖，不包含根root project的依赖

### documentation

- `javadoc` 生成javadoc

### verification

- `check` 运行所有check
- `test` 运行所有单元测试