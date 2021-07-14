# Quarkus

> Quarkus是一个由Red Hat开源的 Java 微服务框架，其特性包括：

- 容器优先：最小的Java应用程序，最适合在容器中运行
- 云原生：在 Kubernetes 等环境中采用 12 要素原则。
- 统一命令式与反应式：在一个编程模型下带来非阻塞和命令式开发风格。
- 基于标准：基于一些标准和框架（RESTEasy、Hibernate、Netty、Eclipse Vert.x、Apache Camel …）。
- 微服务优先：快速启动项目编写 Java 应用。

## JAX-RS

> JAX-RS是JAVA EE6 引入的一个新技术。 JAX-RS即Java API for RESTful Web Services，是一个Java 编程语言的应用程序接口，支持按照表述性状态转移（REST）架构风格创建Web服务。JAX-RS使用了Java SE5引入的Java注解来简化Web服务的客户端和服务端的开发和部署

### 常用注解

- @Path，标注资源类或者方法的相对路径

- @GET，@PUT，@POST，@DELETE，标注方法是HTTP请求的类型。

- @Produces，标注返回的MIME媒体类型

- @Consumes，标注可接受请求的MIME媒体类型

- @PathParam，@QueryParam，@HeaderParam，@CookieParam，@MatrixParam，@FormParam,分别标注方法的参数来自于HTTP请求的不同位置，例如@PathParam来自于URL的路径，@QueryParam来自于URL的查询参数，@HeaderParam来自于HTTP请求的头信息，@CookieParam来自于HTTP请求的Cookie。

- 默认单例可以使用不同的 *Scoped 注解 (ApplicationScoped, RequestScoped ，等）对它进行配置。

#### 注入
RestEasy基于Arc注入，Arc是基于CDI的依赖注入的解决方案 