package com.examples.grpc;

import com.examples.grpc.GreeterGrpc;
import com.examples.grpc.HelloReply;
import com.examples.grpc.HelloRequest;
import io.grpc.stub.StreamObserver;

public class GreeterServiceImpl extends GreeterGrpc.GreeterImplBase {
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        System.out.println("Request:" + request);
        HelloReply response = HelloReply.newBuilder().setMessage("Hello " + request.getName()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
