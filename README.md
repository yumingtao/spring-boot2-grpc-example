# Spring Boot2 gRPC Example
The grpc-client provides restful api for external call, grpc-client calls grpc-server via grpc.

There are three modules:
- grpc-common: proto definition
- grpc-client: provides restful api for external and as a grpc client
- grpc-server: grpc server

## Core Dependencies
1. Spring Boot 2.2.5.RELEASE
2. yidongnan/grpc-spring-boot-starter 2.7.0.RELEASE
3. grpc-all 1.27.1
- The grpc-all 1.27.2 is conflict with yidongnan/grpc-spring-boot-starter 2.7.0.RELEASE

## How to Test
1. mvn clean install
2. Start grpc-server
3. Start grpc-client
4. http://localhost:8087/hello?name=xxxx

## Reference
- https://github.com/grpc/grpc-java
- https://github.com/yidongnan/grpc-spring-boot-starter
- https://blog.csdn.net/alinyua/article/details/83030149

