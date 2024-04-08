# JUnit 4 Introduction

# 1. 引入

## 1.1 JUnit 4是什么？

JUnit4是Java语言的单元测试框架，灵活性高，随时可以执行测试，也可以自动化执行，能够尽早发现编程中的问题。

## 1.2 JUnit 4 官网

[点击跳转 JUnit 4 官网](https://junit.org/junit4/)

## 1.3 如何开始使用Junit 4

- 方案一： 下载以下jar包，导入到你的项目中：

  [junit.jar](https://repo1.maven.org/maven2/junit/junit/4.13.2/)

  [hamcrest-core.jar](https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/)


- 方案二： 使用Maven的可以在pom.xml文件中添加以下依赖：
```
<dependency>
  <groupId>junit</groupId>
  <artifactId>junit</artifactId>
  <version>4.13</version>
  <scope>test</scope>
</dependency>
```

# 2. 用法

## 2.1 注解

JUnit 4 通过注解的方式来识别测试用例，基础的一些注解有：

- `@BeforeClass`：静态方法，在所有测试方法之前执行，并且全局只会执行一次
- `@AfterClass`：静态方法，在所有测试方法之后执行，并且全局只会执行一次
- `@Before`：在每个测试用例之前运行
- `@Test`：标注测试用例
- `@After`：在每个测试用例之后运行
- `@Ignore`：忽略该测试用例

具体用法见 Annotation.java 。

## 2.2 断言

Junit 4 使用断言实现测试用例的判断逻辑，基础的一些断言有：
- `assertEquals`：判断两者是否相同
- `assertArrayEquals`：判断两个数组内容是否相同
- `assertTrue`：判断条件是否为 True
- `assertFalse`：判断条件是否为 False
- `assertNull`：判断结果是否为 Null
- `assertNotNull`：判断结果是否不为 Null
- `assertSame`：判断两个对象是否相同
- `assertNotSame`：判断两个对象是否不相同

具体用法见 Assert.java 。

## 2.3 异常

你可以使用以下方法检验代码执行过程中是否按抛出预期的异常，具体用法见 Exception.java 。

### 2.3.1 使用 assertThrows 方法

JUnit 4.13 版本可以使用 `assertThrows` 方法，此方法可以断言给定的函数调用是否会抛出预期类型的异常。此外，它还会将抛出的异常返回，以便进一步判断抛出异常的原因。

### 2.3.2 使用 expected 参数

使用 expected 参数同样可以判断函数是否抛出预期的异常，但此方法不会返回异常，无法进一步获取异常信息。

### 2.3.3 使用 try/catch 语句

如果使用的版本不是JUnit 4.13或代码库不支持lambdas，但还是想要获取异常的详细信息，则可以使用try/catch的传统用法。 

## 2.4 超时

JUnit 4提供了一个超时选项，如果一个测试用例的执行时间超过了预先设定的时间，就会视为失败，具体用法见 Timeout.java 。

## 2.5 @RunWith注解

当你把测试代码交给Junit后，JUnit会使用Runner（执行器）来执行你的测试代码。Junit 4中有多种Runner，每个Runner都有各自不同的功能，可以使用@RunWith注解来指定使用的Runner。

### 2.5.1 Suite Runner
可以将多个相关的测试类看作是一个套件一起执行，具体用法见 RunWith1.java 。
### 2.5.2 Parameterized Runner
用于使用多种参数组合多次执行同一个测试用例，具体用法见 RunWith2.java 和 RunWith3.java 。
### 2.5.3 Categories Runner
可以使用category进行分类，选择执行或不执行某一类测试用例，具体用法见 Category.java, RunWith4.java 和 RunWith5.java 。
### 2.5.4 Third Party Runners
[SpringJUnit4ClassRunner](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/test/context/junit4/SpringJUnit4ClassRunner.html)</br>
[HierarchicalContextRunner](https://github.com/bechte/junit-hierarchicalcontextrunner/wiki)</br>
[Avh4's Nested](https://github.com/avh4/junit-nested)</br>
[NitorCreation's NestedRunner](https://github.com/NitorCreations/CoreComponents/tree/master/junit-runners)</br>
[Others...](https://github.com/junit-team/junit4/wiki/Custom-runners)