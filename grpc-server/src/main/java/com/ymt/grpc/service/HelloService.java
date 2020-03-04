package com.ymt.grpc.service;

import com.ymt.grpc.common.Hello;
import com.ymt.grpc.common.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

@Slf4j
@GrpcService()
public class HelloService extends HelloServiceGrpc.HelloServiceImplBase{
    @Override
    public void sayHello(Hello.HelloRequest request, StreamObserver<Hello.HelloResponse> responseObserver) {
        String message = "Hello " + request.getName();
        final Hello.HelloResponse.Builder builder = Hello.HelloResponse.newBuilder().setMessage(message);
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
        log.info("The response is : {}", message);
    }
}
