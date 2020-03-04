package com.ymt.grpc.service;

import com.ymt.grpc.common.Hello;
import com.ymt.grpc.common.HelloServiceGrpc;
import io.grpc.Channel;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class HelloClientService {
    @GrpcClient("grpc-server")
    private Channel serverChannel;

    public String sayHello(String name) {
        HelloServiceGrpc.HelloServiceBlockingStub stub = HelloServiceGrpc.newBlockingStub(serverChannel);
        Hello.HelloRequest request = Hello.HelloRequest.newBuilder().setName(name).build();
        Hello.HelloResponse response = stub.sayHello(request);
        String message = response.getMessage();
        log.info("The response is : {}", message);
        return message;
    }
}
