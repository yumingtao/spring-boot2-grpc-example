# Spring Boot2 GRPC Example
The grpc-client provides restful api for external call, grpc-client calls grpc-server via grpc.

## Dependencies
### Spring Boot 2.2.5.RELEASE
### yidongnan/grpc-spring-boot-starter 2.7.0.RELEASE
### grpc-all 1.27.1
The grpc-all 1.27.2 is conflict with yidongnan/grpc-spring-boot-starter 2.7.0.RELEASE

## Test
1. mvn clean install
2. Start grpc-server
3. Start grpc-client
4. http://localhost:8087/hello?name=xxxx

## Reference Documentation
https://github.com/grpc/grpc-java
https://github.com/yidongnan/grpc-spring-boot-starter
https://blog.csdn.net/alinyua/article/details/83030149

